package com.itheima.demo02_同步代码块解决线程安全问题;

public class Tickets implements Runnable {
    private int piao =100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (piao > 0) {
                    int i = piao;
                    System.out.println(Thread.currentThread().getName() + "取走了一张票" + i);
                    piao--;

                } else {
                    System.out.println("没票了");
                    break;
                }
            }
        }

    }
}
