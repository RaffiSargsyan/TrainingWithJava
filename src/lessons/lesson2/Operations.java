package lessons.lesson2;

public class Operations {
    public static void main(String[] args) {
        int a;
        int A;      // case sensitive
        //int 4x;
        int _x = 9; //variables names
        int x24 = 9;
        int $x = 9;

        String firstName = "Raffi";  //camel case variables, that is ok
        System.out.println(firstName); //with this everyone can easy read code
        String firstNameOfTheBestStudent = "Raffi";
        System.out.println(firstNameOfTheBestStudent);

        int x = 4, b = 3;
        int c = x + b;
        System.out.println(c);
        c = x - b;
        System.out.println(x - b);
        System.out.println(c);
        System.out.println(x / b);
        System.out.println(x % b);

        double t = 6.9, k = 5.5;
        System.out.println(t / k);

        x = 5;
        x = x + 1;
        x++;
        ++x;
        System.out.println(x);

        x = 10;
        System.out.println(++x);
        System.out.println(x);

        x = 3;
        b = 4;
        c = x++ - --b; //c = 3 - 3
        //x = 4, y = 3
        System.out.println("x = " + x);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        //  ++x;
        //  x = x + 1;
        //  System.out.println(x);
        //  x = 1;
        //  System.out.println(x++);
        //  System.out.println(++x);
        //  x = 7;
        //  b = 8;
        //  c = ++x + b--; //8 + 8 =16
        //  System.out.println(c);
        //  System.out.println(x++);
        //  System.out.println(x);
        //  System.out.println(--b);
        //  System.out.println(b);
        //  System.out.println(--b);
        //  c = --x + --b;
        //  System.out.println(c);


    }
}
