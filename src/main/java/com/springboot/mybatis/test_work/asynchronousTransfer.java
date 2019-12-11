package com.springboot.mybatis.test_work;

/**
 * 异步调用
 * @author luosong
 *
 */
public class asynchronousTransfer {
	public static void main(String[] args) {
		asynchronousFun myExecutor = new asynchronousFun();
		myExecutor.fun();
		System.out.println("你先睡觉");
	}
}