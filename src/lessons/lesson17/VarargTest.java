package lessons.lesson17;

public class VarargTest {
    public static void main(String[] args) {

        sum(3, 4);
        sum(3, 42, 3);
        sum(new int[]{12, 1, 2});
        f(1);
        f(1,1,2);
    }

    static void f(int... a) {
        int s = 0;
        for (int x : a) {
            s = s+ x;
        }
        System.out.println(s);

    }

    static void sum(int x, int y) {

    }

    static void sum(int x, int y, int z) {

    }

    static void sum(int[] x) {

    }
}
