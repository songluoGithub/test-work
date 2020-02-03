package com.thread;

public class ThreadDemo {
    static class Join extends Thread{
        @Override
        public void run() {
//            System.out.println("当前运行的线程名："+Thread.currentThread().getName());
            for(int i = 0 ; i < 10 ;i++){
                System.out.println("播放音乐"+i);
            }
        }
    }

    public static void main(String[] args) {
        //创建 join 线程对象
        Join joinThread = new Join();
//        Join joinThread1 = new Join();
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("玩游戏"+i);
            System.out.println("当前运行的线程名："+Thread.currentThread().getName());
            if(i==3){
                joinThread.start();
//                joinThread.run();

            }
            if(i==5){
                try {
                    joinThread.join();//强制运行 join 线程，知道 join 运行完毕了，main 才有机会运行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
