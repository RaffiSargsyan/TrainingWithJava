package lessons.lesson12;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        Scanner newScanner = new Scanner(System.in);
//
//        int n = newScanner.nextInt();
//
//        for (int i = 0; i <= n; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        newScanner.nextLine();
//        String st = newScanner.nextLine();
//        System.out.println(st);

        Student s1 = new Student("Raffi");
        System.out.println(s1.getName());

        Human human1 = new Human("Amalia");
        System.out.println(human1.toString());
    }
}
