package lessons.lesson18;

public interface B {
    default void f(){
        System.out.println("b");
    }
}
