package com.felix.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Felix
 * @date 2021/5/5 6:12 下午
 * @DESC
 */
public class FileCopy {


    public static void copyFile(String src, String dist) throws IOException {

        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dist);

        byte[] buffer = new byte[20 * 1024];
        int cnt;
        while ((cnt = in.read(buffer, 0, buffer.length)) != -1) {
            out.write(buffer, 0, cnt);
        }
        System.out.println("copy successfully!");
        in.close();
        out.close();

    }


    public static void main(String[] args) throws IOException {

         FileCopy.copyFile("//Users//felixx//Desktop//PDF//a.txt", "//Users//felixx//Desktop//PDF//b.txt");

    }

}
