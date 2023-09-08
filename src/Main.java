import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            System.out.print(j + " ");
        }
        System.out.println();
        s.nextLine();

        String st = s.nextLine();
        System.out.println(st);
    }
}