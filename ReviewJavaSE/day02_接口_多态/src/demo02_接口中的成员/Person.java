package demo02_接口中的成员;

public interface Person {
    //1.公有、静态常量---【可以被子类继承】
    public static final int a = 10;
    public int b = 20; //可以简写，编译后：public static final int b=20;
    static int c = 30;
    final int d = 40;
    int e = 50;

    //2.公有、抽象方法---【被子类继承，并强制重写里面的方法】
    public abstract void fangfa();
    public void fangfa2();
    abstract void fangfa3();
    void fangfa4();

    //3.公有、默认方法---【普通方法，有方法体{}，被子类继承的，子类可以重写】
    public default void fangf(){

    };
    default void fangf2(){

    }

    //4.公有、静态方法---【不能被继承，只属于本接口，只能通过本接口名访问】
    public static void f(){

    }

}
