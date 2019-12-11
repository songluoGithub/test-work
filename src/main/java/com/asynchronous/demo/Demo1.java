package com.asynchronous.demo;


/**
 * create by luosong
 * data: 2019/7/12
 **/
//利用wait和notifyAll来实现异步回调转同步执行
public class Demo1 extends BaseDemo{

    private final Object lock = new Object();

    @Override
    public void callback(long response) {
        System.out.println("得到结果");
        System.out.println(response);
        System.out.println("调用结束");

        synchronized (lock) {
        	System.out.println("开始唤醒线程了");
            lock.notifyAll();
            System.out.println("唤醒线程了");
        }

    }

    public static void main(String[] args) {

        Demo1 demo1 = new Demo1();

        demo1.call();

        synchronized (demo1.lock){
            try {
                demo1.lock.wait();
                System.out.println("线程睡眠咯");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("主线程内容");

    }
}
