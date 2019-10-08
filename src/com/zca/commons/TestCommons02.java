package com.zca.commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 读内容
 * @author Altria
 */
public class TestCommons02 {
    public static void main(String[] args) throws IOException {
        // 读取整个文件
        String msg = FileUtils.readFileToString(new File("test.txt"), "UTF-8");
        System.out.println(msg);
        // 将文件读取到字节数组中
        byte[] datas = FileUtils.readFileToByteArray(new File("test.txt"));
        System.out.println("字节数组的长度: " + datas.length);

        // 逐行读取: 一
        List<String> msgs = FileUtils.readLines(new File("test.txt"), "UTF-8");
        System.out.println("逐行读取文件: " + msgs.get(0));

        // 逐行读取: 二
        LineIterator it = FileUtils.lineIterator(new File("test.txt"), "UTF-8");
        while(it.hasNext()){
            System.out.println(it.nextLine());
        }
    }
}
