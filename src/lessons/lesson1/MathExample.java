package lessons.lesson1;

import java.util.Scanner;

/*
Math class in java.Lang package,then we can use it without import
it's automatically will be import
 */
public class MathExample {
    public static void main(String[] args) {
        //   double x = 3.14; //static initializations
        //   double y = -10;

        //   double z = Math.max(x, y);  //dynamic initialization
        //   double k = Math.min(x, y);
        //   double t = Math.abs(x);     //abs..without negative
        //   System.out.println("max= " + z + " " + " " +
        //           "min = " + k + " " + " abs = " + t);

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
//        z = Math.max(x, y);

        System.out.println("The hypotenuse is: " + z);

        scanner.close();
    }
}
