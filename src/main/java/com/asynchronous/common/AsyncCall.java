package com.asynchronous.common;


import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.asynchronous.demo.BaseDemo;

/**
 * create by luosong
 * data: 2019/7/12
 **/
//异步调用类
public class AsyncCall {

    private Random random = new Random(System.currentTimeMillis());

    private ExecutorService tp = Executors.newSingleThreadExecutor();

    //demo1,2,4,5调用方法
    public void call(BaseDemo demo){

        new Thread(()->{
            long res = random.nextInt(10);

            try {
                Thread.sleep(res*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            demo.callback(res);
        }).start();
    }

    //demo3调用方法
    public Future<Long> futureCall(){

        return tp.submit(()-> {
            long res = random.nextInt(10);

            try {
                Thread.sleep(res*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return res;
        });

    }

    public void shutdown(){

        tp.shutdown();

    }

}
