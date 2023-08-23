package lessons.lesson7;

public class Human {
    public String firstName;
    public String lastName;
    public int year;
    public boolean isArmenian;
    public char gender;

    public void sayHello() {
        System.out.println("Hello");
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public void sum(int x, int y) {
        System.out.println(x + y);
    }

    public void print1ToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
