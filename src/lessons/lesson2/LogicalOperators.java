package lessons.lesson2;

public class LogicalOperators {
    public static void main(String[] args) {
        int x =9;
        System.out.println(x >= 1 && x <= 9);
         boolean vv = x< 0 || x > 10;
        System.out.println(vv);
          vv = true;
        System.out.println(!vv); //reverse vv
        System.out.println(5&8);
        System.out.println(5 | 8);
        System.out.println(8 ^ 5);
        System.out.println(17 & 24);
    }

}
