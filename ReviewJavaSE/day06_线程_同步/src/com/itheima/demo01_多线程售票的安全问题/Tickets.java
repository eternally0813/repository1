package com.itheima.demo01_多线程售票的安全问题;

public class Tickets implements Runnable {
    private int piao =100;

    @Override
    public void run() {
        while (true) {
            if (piao > 0) {
                int i = piao;
                System.out.println(Thread.currentThread().getName() + "取走了一张票" + i);
                piao--;

            }else {
                System.out.println("没票了");
                break;
            }
        }

    }
}
