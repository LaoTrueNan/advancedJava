package gzq.byd.com.valves;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public void hei() {
        System.out.println("Hierarchy");
    }

    public static void main(String[] args) {
        try {
            final long count = Files.lines(Paths.get("D://md//WebappClassLoader.java")).count();
            System.out.println(count);
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("D://md//WebappClassLoader.java"));
            lineNumberReader.skip(Long.MAX_VALUE);
            final int i = lineNumberReader.getLineNumber() + 1;
            System.out.println(i);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Long.MAX_VALUE);
    }
}