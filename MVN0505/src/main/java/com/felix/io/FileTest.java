package com.felix.io;

import java.io.File;
/**
 * @author Felix
 * @date 2021/5/5 5:09 下午
 * @DESC
 */
public class FileTest {

    // 递归地列出一个目录下所有文件
    public static void listAllFiles(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }


    public static void main(String[] args) {
        File file = new File("//Users//felixx//Desktop//PDF");
        FileTest.listAllFiles(file);
    }

}
