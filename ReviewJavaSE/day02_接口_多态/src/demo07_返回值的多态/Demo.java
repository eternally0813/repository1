package demo07_返回值的多态;

public class Demo {
    public static void main(String[] args) {
        Person p =fangfa();


    }
    public static Person fangfa(){
        Teacher t=new Teacher();
        return t;

    }
}
