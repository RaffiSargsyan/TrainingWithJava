package lessons.lesson1;

public class IfStatement {
    public static void main(String[] args) {
        int age = 24;
        if (age >= 75) {
            System.out.println("You are an adult !");
        }
        else if (age >= 56) {
            System.out.println("Okay");
        }
        else if (age >= 24) {
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You are not an adult !");
        }
    }
}
