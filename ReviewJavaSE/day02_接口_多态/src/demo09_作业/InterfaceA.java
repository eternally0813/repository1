package demo09_作业;

public interface InterfaceA {
    public abstract void showA();

    public default void showB(){
        System.out.println("BBBB");
    }
}
