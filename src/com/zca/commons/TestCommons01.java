package com.zca.commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.util.Collection;

/**
 * commons的使用
 * @author Altria
 */
public class TestCommons01 {
    public static void main(String[] args) {
        // 统计文件大小
        long len = FileUtils.sizeOf(new File("E:/Java/Java_IO_Commons/Alter1.jpg"));
        System.out.println("图片大小: " + len);
        // 统计目录大小
        len = FileUtils.sizeOf(new File("E:/Java/Java_IO_Commons"));
        System.out.println("文件大小: " + len);

        System.out.println("---------------------------------------------");
        // 列出子孙集
        // 筛选: EmptyFileFilter: NOT_EMPTY: 将文件为空的排除)
        // new SuffixFileFilter("java"): 筛选出文件后缀名为java的文件
        // FileFilterUtils: or和and, 可以同时进行多个条件的筛选
        Collection<File> files = FileUtils.listFiles(new File("E:/Java/Java_IO_Commons"),
                EmptyFileFilter.NOT_EMPTY, null);
        for (File file:files) {
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("---------------------------------------------");
        // dirFilter: 表示是否操作子孙级, DirectoryFileFilter.INSTANCE
        files = FileUtils.listFiles(new File("E:/Java/Java_IO_Commons"),
                FileFilterUtils.or(new SuffixFileFilter("java"), EmptyFileFilter.NOT_EMPTY),
                DirectoryFileFilter.INSTANCE);
        for (File file:files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
