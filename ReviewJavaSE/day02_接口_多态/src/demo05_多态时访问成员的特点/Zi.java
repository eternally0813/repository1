package demo05_多态时访问成员的特点;

public class Zi extends Fu {
    int i=20;

    @Override
    public void eat(){  //子类重写了方法
        System.out.println("子类的方法");
    }

}
