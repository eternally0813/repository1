package com.itheima.demo01_类和对象;

public class Demo {
    public static void main(String[] args) {
        Student s1=new Student();

        //匿名对象
        new Student();
        //调用这个fangfa
        fangfa(s1);  //第一种方法，实参传一个student对象
        //调用这个fangfa
        fangfa(new Student()); //第二种方法，传入匿名对象

    }

    //定义的一个方法
    public static void fangfa(Student s){  //Student类型的形参

    }
}
