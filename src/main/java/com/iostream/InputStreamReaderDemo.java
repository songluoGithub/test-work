package com.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 * 字节流转为字符流读入
 * @author luosong
 *
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) {
        File file =new File("C:\\Users\\luosong\\Desktop\\newCreateField.txt");
        InputStream in;
        try {
            in = new FileInputStream(file);
            InputStreamReader isr=new InputStreamReader(in);
            int len=-1;
            StringBuffer sb=new StringBuffer();
            char []b=new char[10];
            while((len=isr.read(b))!=-1){
                sb.append(b,0,len);
            }
            isr.close();
            in.close();
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}