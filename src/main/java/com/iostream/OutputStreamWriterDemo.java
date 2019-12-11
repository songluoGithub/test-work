package com.iostream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
/**
 * 字符流转为字节写入
 * @author ganhang
 *
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        File file=new File ("C:\\Users\\luosong\\Desktop\\1.txt");
        OutputStream out;
        try {
            out = new FileOutputStream(file,true);//写入文件是否追加
            OutputStreamWriter osw=new OutputStreamWriter(out);//字符流使用构造方法转换
            String info="哈哈哈哈哈哈";
            osw.write(info);
            osw.close();
            out.close();
            System.out.println("写入成功!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}