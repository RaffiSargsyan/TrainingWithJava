package lessons.lesson1;

public class PrintMethods {
    public static void main(String[] args) {
//        System.out.printf("%dIt is nice day ", 17); at first printed value

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Hi";
        int myInt = 100;
        double myDouble = 12.4;

//        System.out.printf("%b", myBoolean);
//        System.out.printf("%c", myChar);
//        System.out.printf("%s", myString);
//        System.out.printf("%d", myInt);
//        System.out.printf("%f", myDouble);

//        minimum number of characters to be written as output
//        System.out.printf("Hello %-10s", myString);

        // sets number of digits of precision when outputting floating point values
//        System.out.printf("You have this much money %.2f", myDouble);

        System.out.printf("You have this much money %20f", myDouble);

    }
}
