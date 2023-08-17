package lessons.lesson1;

public class Examples {
    public static void main(String[] args) {
        System.out.println("Hi Mom !");
        System.out.println("\tHello everyone"); //tabulation
        System.out.println("\nHow are you?");  //new line

//        int x;       //declaration
//        x = 123;     //assignment
//        int y = 10; //initialization
//        System.out.println("My number is: " + x);
//        System.out.println();

        String x = "water";
        String y = "bread";
        String temp;

        temp = x;
        x = y;
        y = temp;
        System.out.println("name: " + x);
        System.out.println("name2: " + y);
    }
}
