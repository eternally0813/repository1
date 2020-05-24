package demo02_static关键字;

public class Demo {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        System.out.println(s1.a);  //10
        System.out.println(s1.b);  //20

        System.out.println(s2.a);  //10
        System.out.println(s2.b);  //20

        s1.a=100;
        s1.b=200;

        System.out.println(s2.a);  //10
        System.out.println(s2.b);  //200


    }
}
