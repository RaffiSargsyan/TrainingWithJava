package lessons.staticKeyword;

public class Human {
    public String name;
    public static int year;

    public static int count = 0;

    static int a ;
    public static int b;

    static {
        a= 2;
        System.out.println("a and b ");
        b = 1;
    }
    Human() {
        count++;
        System.out.println("Hello");
    }

}
