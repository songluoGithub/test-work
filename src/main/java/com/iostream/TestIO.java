package com.iostream;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class TestIO {
	public static void main(String[] args) throws IOException {
		//字节流写入测试下
//		File file = new File("C:\\Users\\luosong\\Desktop\\1.txt");
//		FileOutputStream fos = new FileOutputStream(file,true);
//		String str = "写入";
//		fos.write(str.getBytes());
//		fos.close();
//		System.out.println("写入完成");
		
		//字符流写入
//		FileWriter fw = new FileWriter(new File("C:\\Users\\luosong\\Desktop\\1.txt"),true);
//		String str = "\r\n写入到文件中";
//		fw.write(str);
//		fw.close();
//		System.out.println("写入成功");
		
		//字节缓冲流写入
//		File file = new File("C:\\Users\\luosong\\Desktop\\1.txt");
//		OutputStream out = new FileOutputStream(file);
//		BufferedOutputStream bop = new BufferedOutputStream(out);
//		String str = "hahhahahh";
//		byte[] b = str.getBytes();
//		bop.write(b);
//		bop.close();
//		System.out.println("写入成功");
		
		//字符缓冲流写入
//		File file = new File("C:\\Users\\luosong\\Desktop\\1.txt");
//		FileWriter fw = new FileWriter(file,true);
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write("aaa");
//		bw.flush();
//		bw.close();
//		System.out.println("写入成功");
		
		
		//字符流读取文件
//		File file = new File("C:\\Users\\luosong\\Desktop\\1.txt");
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		System.out.println(br.readLine());
		
		
		//用字节流实现文件内容写入
//		File source = new File("C:\\Users\\luosong\\Desktop\\newCreateField.txt");//源文件
//		File target = new File("C:\\Users\\luosong\\Desktop\\1.txt");//目标文件
//		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));//读出
//		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));//写入
//		int size = 0;
//		byte[] b = new byte[1024];
//		while((size=bis.read(b)) != -1){
//			bos.write(b, 0, size);
//		}
//		bos.close();
//		bis.close();
		
		//用字符流实现文件内容得写入
		File source = new File("C:\\Users\\luosong\\Desktop\\newCreateField.txt");//源文件
		File target = new File("C:\\Users\\luosong\\Desktop\\1.txt");//目标文件
//		target.createNewFile();
		BufferedReader br = new BufferedReader(new FileReader(source));//读取流
		BufferedWriter bw = new BufferedWriter(new FileWriter(target));//写入流
		String str = null;
		while((str=br.readLine())!=null){//判断是否到了文件流末尾
			bw.write(str);
		}
		bw.flush();
		br.close();
		bw.close();
		target.deleteOnExit();
		System.out.println("写入完成");
	}
}
