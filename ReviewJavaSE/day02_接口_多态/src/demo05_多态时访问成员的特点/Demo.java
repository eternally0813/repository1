package demo05_多态时访问成员的特点;

public class Demo {
    public static void main(String[] args) {
        Fu f=new Zi();
        f.eat();

        System.out.println(f.i);
    }
}
