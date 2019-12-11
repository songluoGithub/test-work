package com.springboot.mybatis.test_work;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class TestGetFileLine {
	public static int getTotalLines(File file) throws IOException {
	    long startTime = System.currentTimeMillis();
	    FileReader in = new FileReader(file);
	    LineNumberReader reader = new LineNumberReader(in);
	    reader.skip(Long.MAX_VALUE);
	    int lines = reader.getLineNumber();
	    reader.close();
	    long endTime = System.currentTimeMillis();

	    System.out.println("统计文件行数运行时间： " + (endTime - startTime) + "ms");
	    return lines;
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\luosong\\Desktop\\test5000.txt");
		int num = getTotalLines(file);
		System.out.println(num);
	}
}
