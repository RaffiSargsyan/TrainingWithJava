package varargs;

public class VarargsExample {
    public static int sum(int count, int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    public static int numbers(int... num) {
        int result = 0;
        for (int i : num) {
            result += i;
        }
        return result;
    }

    public static double sum(int a, int b, double c) {
        return a + b + c;
    }

    public static int sum1(int a, int b, double c) {
        return (int) (a + b + c);
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(5, 10, 15, 20, 25));
        System.out.println(numbers(12, 3));
        System.out.println(sum(1, 19, 19.21));
        int result = sum1(11, 2, 4.3);

    }
}
