package com.springboot.mybatis.test_work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import javax.xml.crypto.Data;

public class Test {
	public static void main(String[] args) throws IOException {
//		FileReader reader = new FileReader("C:\\Users\\luosong\\Desktop\\createTest.txt");//路径拼接
//		BufferedReader br = new BufferedReader(reader);
//		String line = "";
//        while ((line = br.readLine()) != null) {//开始读取文件
//        	System.out.println(line+"========"+"".equals(line));
//        }
		Date date = new Date();
		System.out.println(date.getTime());
    }
}
