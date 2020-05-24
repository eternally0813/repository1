package demo02_接口中的成员;

public class Demo {
    public static void main(String[] args) {
        Zi z=new Zi();
        Person.f();  //公有、静态方法---【不能被继承，只属于本接口，只能通过本接口名访问】

    }
}
