package demo06_形参的多态;

public class Demo {
    public static void main(String[] args) {
        Student s=new Student();
        Teacher t=new Teacher();

        s.setName("张三");
        s.setAge(15);
        print(s);

        System.out.println("-------------");

        t.setName("李四");
        t.setAge(20);
        print(t);

    }
    public static void print(Person p){
        System.out.println("姓名"+p.getName());
        System.out.println("年龄"+p.getAge());
    }
}
