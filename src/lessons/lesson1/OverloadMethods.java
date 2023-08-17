package lessons.lesson1;

public class OverloadMethods {
    public static void main(String[] args) {
        double x = add(2.3, 2.1, 23.2, 1.0, 4.2);
        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("This is overload method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overload method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overload method #3");
        return a + b + c + d;
    }

    static double add(double a, double b, double c, double d, double e) {
        System.out.println("This is overload method #4");
        return a + b + c + d;
    }
}
