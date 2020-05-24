package com.itheima.demo03_继承的规则;

public class Demo {
    public static void main(String[] args) {
        Zi z=new Zi();
        System.out.println(z.i);

        Zi z2=new Zi("String名字");
        System.out.println(z2.i);
    }
}
