package gzq.byd.com.bigdata;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.IOUtils;
//import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import junit.framework.TestCase;
import java.util.List;
import java.util.Map;

public class RandomAccessFileTest extends TestCase{

    private static final Logger logger = LoggerFactory.getLogger(RandomAccessFileTest.class);

    private static final String ENCODING = "UTF-8";
    private static final int NUM = 50000;

    private static File file = new File(ClassLoader.getSystemResource("").getPath() + File.separator + "test.txt");
    private static File randomFile = new File(ClassLoader.getSystemResource("").getPath() + File.separator + "RandomFile.txt");



    /**
     * 生成1000w随机文本文件
     */
//    @Test
    public void testCase1() {
        String prefix = "_$#";
        OutputStreamWriter out = null;
        try {
            out = new OutputStreamWriter(new FileOutputStream(file, true), ENCODING);
            // 在1500w里随机1000w数据
//            1w=121,414 12bytes
//            2w=242,959
            for (int j = 0; j < 20000; j++) {
                out.write(prefix + (int) (130000000 * Math.random()) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(out);
        }
        logger.info(file.getAbsolutePath());
    }

    /**
     * 测试RandomAccessFile读取文件
     */
//    @Test
    public void testCaseRandomAccessRead() {
        long start = System.currentTimeMillis();
//
        logger.info(String.valueOf(file.exists()));
        long pos = 0L;
        while (true) {
            Map<String, Object> res = FileUtil.readLine(file, ENCODING, pos, NUM);
            // 如果返回结果为空结束循环
            if (MapUtils.isEmpty(res)) {
                break;
            }
            Object po = res.get("pins");
            List<String> pins = (List<String>) res.get("pins");
            if (CollectionUtils.isNotEmpty(pins)) {
//                logger.info(Arrays.toString(pins.toArray()));
                if (pins.size() < NUM) {
                    break;
                }
            } else {
                break;
            }
            pos = (Long) res.get("pos");
        }
        logger.info(((System.currentTimeMillis() - start) / 1000) + "");
    }

    /**
     * 测试RandomAccessFile读取文件
     */
//    @Test
    public void testBufferedRandomAccessRead() {
        long start = System.currentTimeMillis();
//
        logger.info(String.valueOf(file.exists()));
        long pos = 0L;
        while (true) {
            Map<String, Object> res = FileUtil.BufferedRandomAccessFileReadLine(file, ENCODING, pos, NUM);
            // 如果返回结果为空结束循环
            if (MapUtils.isEmpty(res)) {
                break;
            }
            List<String> pins = (List<String>) res.get("pins");
            if (CollectionUtils.isNotEmpty(pins)) {
//                logger.info(Arrays.toString(pins.toArray()));
                if (pins.size() < NUM) {
                    break;
                }
            } else {
                break;
            }
            pos = (Long) res.get("pos");
        }
        logger.info(((System.currentTimeMillis() - start) / 1000) + "");
    }

    /**
     * 测试普通读取文件
     */
//    @Test
    public void testCaseCommonRead() {
        long start = System.currentTimeMillis();
        logger.info(String.valueOf(randomFile.exists()));
        int index = 0;
        while (true) {
            List<String> pins = FileUtil.readLine(file, ENCODING, index, NUM);
            if (CollectionUtils.isNotEmpty(pins)) {
//                logger.info(Arrays.toString(pins.toArray()));
                if (pins.size() < NUM) {
                    break;
                }
            } else {
                break;
            }
            index += NUM;
        }
        logger.info(((System.currentTimeMillis() - start) / 1000) + "");
    }
}
