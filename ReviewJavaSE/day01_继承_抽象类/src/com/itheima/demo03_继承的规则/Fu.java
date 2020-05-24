package com.itheima.demo03_继承的规则;

public class Fu {
    int i=1000;
    private int j=500; //被父类私有了，子类继承后无法使用

    public Fu() {
        System.out.println("父类的无参构造");
    }
    public Fu(String s){
        System.out.println("父类的有参构造");
    }
}
