package lessons.lesson1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); //we must write it because we have wronging in next line
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();
        System.out.println("What is your hobby? ");
        String hobby = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your favorite food is " + food);
        System.out.println("Your hobby is " + hobby + " it's really good");
    }
}
