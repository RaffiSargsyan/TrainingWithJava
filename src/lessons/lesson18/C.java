package lessons.lesson18;

public class C implements A, B {

    @Override
    public void f() {
        A.super.f();
        System.out.println("C");
        B.super.f();
        System.out.println("CC");
    }

    @Override
    public int sum(int x, int y) {
        return 0;
    }
}
