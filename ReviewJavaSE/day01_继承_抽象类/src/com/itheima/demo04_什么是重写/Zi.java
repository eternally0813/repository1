package com.itheima.demo04_什么是重写;

public class Zi extends Fu {
    @Override   //加入这个注解的意思就是说下面的方法一定是重写父类的，如果写的方法名和父类的方法名不一致，@Override会报错
                //@Override：注解，作用是强制重写
    public void fangfa1(){
        System.out.println("子类的方法1");
    }
}


//子类重写方法的：方法名、返回值类型、形参，必须跟父类的方法一模一样！！！