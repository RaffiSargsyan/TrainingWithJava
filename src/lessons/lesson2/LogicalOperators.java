package lessons.lesson2;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 41;
        System.out.println(x >= 1 && x <= 9);

        boolean v = x < 0 || x > 40;
        System.out.println(v);

        v = true;
        System.out.println(!v);

        System.out.println(x > 4 && (x % 2 == 0 || x < 44));
    }

}
