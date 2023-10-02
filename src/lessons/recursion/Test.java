package lessons.recursion;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + " ");
        }
        int a = 45;
        System.out.println(a);
        Human h = new Human();
        h.setName("Raffi");
        h.setAge(25);

        int b = 0113; //8
        int b1 = 0x4f; //16
        System.out.println(b1);

        System.out.println(fact(9));
        System.out.println(factR(9));
        System.out.println(fib(7));
    }

    public static int fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int factR(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factR(n - 1);
    }

    public static int fact(int n) {
        int r = 1;
        for (int i = 2; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}
