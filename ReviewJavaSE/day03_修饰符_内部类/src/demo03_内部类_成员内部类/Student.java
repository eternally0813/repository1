package demo03_内部类_成员内部类;

public class Student {
    private int i=10;

    class neibulei{
        private int i=20;
        public void fangfa(){
            int a=30;
            System.out.println("i等于"+i); //30  就近原则
            System.out.println(this.i); //20
            System.out.println(Student.this.i); //10
        }
    }

    class neibulei2{
        public void fangfa2(){
            System.out.println(i);
        }
    }
}
