package lessons.lesson1;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Please enter your name");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
    }
}
