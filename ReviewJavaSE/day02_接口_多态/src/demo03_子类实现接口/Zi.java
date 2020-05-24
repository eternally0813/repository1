package demo03_子类实现接口;

public class Zi  implements Person,People{
    @Override
    public void work() {
        System.out.println("子类里面重写的方法");
    }

    @Override
    public void work2() {
        System.out.println("子类里面重写的方法2");
    }
}
