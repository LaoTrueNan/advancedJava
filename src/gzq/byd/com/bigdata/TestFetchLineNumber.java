package gzq.byd.com.bigdata;

import junit.framework.TestCase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author 4466184
 * @date 2022/8/11 10:47
 */

public class TestFetchLineNumber extends TestCase {
    @Override
    protected void setUp() throws Exception {

    }

    @Override
    protected void tearDown() throws Exception {

    }

    public void testCase001(){
        try {
            final long count = Files.lines(Paths.get("D://md//WebappClassLoader.java")).count();
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
