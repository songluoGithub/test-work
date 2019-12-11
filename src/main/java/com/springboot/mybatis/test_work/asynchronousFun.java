package com.springboot.mybatis.test_work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 异步实现
 * @author luosong
 *
 */
public class asynchronousFun {
	 private ExecutorService executor = Executors.newScheduledThreadPool(0);
	 
	 public void fun(){
		 executor.submit(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(3000);
					System.out.println("睡够了！");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 
		 });
	 }
}
