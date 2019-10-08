package com.zca.commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * 写内容
 * @author Altria
 */
public class TestCommons04 {
    public static void main(String[] args) throws IOException {
        // 拷贝文件
//        FileUtils.copyFile(new File("Alter1.jpg"), new File("01.jpg"));
        // 拷贝文件到指定目录
//        FileUtils.copyFileToDirectory(new File("Alter1.jpg"), new File("test"));
        // 将一个目录拷贝到另一个目录下
//        FileUtils.copyDirectoryToDirectory(new File("test"), new File("test2"));
        // 将一个目录下的所有内容拷贝到另一个目录下
//        FileUtils.copyDirectory(new File("test"), new File("test2"));
        // 拷贝url上的内容到文件
//        String url = "https://img.nga.178.com/attachments/mon_201707/10/f0Q7uie-c3roK1wT1kS5a-3m.png";
//        FileUtils.copyURLToFile(new URL(url), new File("FGO.png"));
        String datas = IOUtils.toString(new URL("http://www.baidu.com"), "UTF-8");
        System.out.println(datas);
    }
}
