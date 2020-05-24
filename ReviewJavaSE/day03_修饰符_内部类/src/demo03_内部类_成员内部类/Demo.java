package demo03_内部类_成员内部类;

public class Demo {
    public static void main(String[] args) {
        Student s=new Student();
        //使用内部类
        //外部类名.内部类名   名字  = 对象名.new内部类名
        Student.neibulei neibuleihaha =s.new neibulei();
        neibuleihaha.fangfa();

        Student.neibulei2 neibulei2=s.new neibulei2();
        neibulei2.fangfa2();
    }
}
