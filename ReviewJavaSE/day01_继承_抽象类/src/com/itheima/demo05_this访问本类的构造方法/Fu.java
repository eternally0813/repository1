package com.itheima.demo05_this访问本类的构造方法;

public class Fu {

    public Fu(){
        System.out.println("fu的无参构造");
    }

    public Fu(String zhangsan){
        this(); //调用本类的无参构造方法
        System.out.println("fu的有参构造");

    }
}
