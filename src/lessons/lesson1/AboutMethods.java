package lessons.lesson1;

public class AboutMethods {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;

        int z = add(x, y);
        System.out.println(z);
    }

    static int add(int x, int y) {

        return x + y;
    }
}
//        String name = "Raffi";
//        int age = 24;
//
//        hello(name, age);
//
//    }
//    static void hello(String title, int number) {
//        System.out.println("Hello " + title + " you are " + number);
//    }

