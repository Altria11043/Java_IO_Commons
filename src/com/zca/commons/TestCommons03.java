package com.zca.commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 写内容
 * @author Altria
 */
public class TestCommons03 {
    public static void main(String[] args) throws IOException {
        // append: 是否追加
        FileUtils.write(new File("Altria.zhou"), "学习是一件伟大的事业\r\n", "UTF-8");
        FileUtils.writeStringToFile(new File("Altria.zhou"), "学习是一件辛苦的事业\r\n", "UTF-8", true);
        FileUtils.writeByteArrayToFile(new File("Altria.zhou"), "学习是一件幸福的事业\r\n".getBytes(), true);


        // 写出列表
        List<String> datas = new ArrayList<>();
        datas.add("Altria");
        datas.add("Zhou");
        datas.add("Saber");

        // lineEnding: 元素与元素直接的间隔符
        FileUtils.writeLines(new File("Altria.zhou"),datas, "/", true);
    }
}
