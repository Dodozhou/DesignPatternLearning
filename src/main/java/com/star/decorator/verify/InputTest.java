package com.star.decorator.verify;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in=new LowerCaseInputStream(
                                new BufferedInputStream(
                                        new FileInputStream("d:/test.txt")));
            while ((c=in.read())>=0){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
