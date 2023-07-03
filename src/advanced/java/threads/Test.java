package advanced.java.threads;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @date 2023/3/15 9:50
 */

public class Test {
    public static void main(String[] args) {
        Process process = null;

        String target = "E:/2.txt";
        String com= "mysqldump -uroot -pgzq102938 --host=localhost --port=3306 --column-statistics=0 -c -t --xml --skip-extended-insert --where=project_id='admin-220815105341052' ry-vue ide_sfc_data";
        try {
            Process exec = Runtime.getRuntime().exec(com);
            BufferedInputStream bis = new BufferedInputStream(exec.getInputStream());

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));

//            BufferedReader bis = new BufferedReader(new InputStreamReader(exec.getInputStream()));
//            String tmp = bis.readLine();
//            while(tmp!=null){
//                bos.write(tmp.getBytes(StandardCharsets.UTF_8));
//                bos.flush();
//                tmp = bis.readLine();
//            }

            byte[] buf = new byte[1024];
            int len = bis.read(buf,0,1024);
            while (len != -1) {
                System.out.println(new String(buf, 0, len));

                bos.write(buf,0,len);
                bos.flush();
                len = bis.read(buf,0,1024);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
