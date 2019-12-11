package com.springboot.mybatis.test_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;


public class Test1 {
	/**
	* Ftp.java
	* FTP的方法类
	*/
	private static FTPClient ftpClient;

	/**
	* 连接并登陆ftp
	 * @throws IOException 
	 * @throws SocketException 
	*/
	public static void connect(String host,int port,String username,String password) throws SocketException, IOException{
		ftpClient = new FTPClient();
		ftpClient.connect(host,port);//连接ftp
		ftpClient.setConnectTimeout(60000);//定义连接时间
		ftpClient.login(username,password);//登录ftp
	}

	/**
	* target--目标文件名称
	* source--源文件名称
	 * @throws IOException 
	*/
	public static void put(String target,String source) throws IOException{

		InputStream iStream = new FileInputStream(source);
		ftpClient.storeFile(target, iStream);
		ftpClient.disconnect();
	}
	
	public static void main(String[] args) throws SocketException, IOException {
		connect("10.7.12.39",22,"sxappopt","sxappopt@123");
		put("/sxapp/sxappopt/filedown/","C:\\Users\\luosong\\Desktop\\a.txt");
	}
}
