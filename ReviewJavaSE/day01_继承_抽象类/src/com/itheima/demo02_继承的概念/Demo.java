package com.itheima.demo02_继承的概念;

public class Demo {
    public static void main(String[] args) {
        Fu f=new Fu();
        Zi z=new Zi();

        //子类使用父类的方法
        System.out.println(z.i);
        z.eatFangFa();
    }


}
