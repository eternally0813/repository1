package com.itheima.demo01_多线程售票的安全问题;

public class Demo {
    public static void main(String[] args) {
        //创建票池对象
    Tickets th=new Tickets();
        //创建三个线程，模拟三个售票窗口
    Thread t1=new Thread(th,"窗口1");
    Thread t2=new Thread(th,"窗口2");
    Thread t3=new Thread(th,"窗口3");
        //启动线程
        t1.start();
        t2.start();
        t3.start();


    }
}
