package lessons.lesson17;

public class Student {
    private String name = findName();


    private double mark;

    {
        name = "Raffi";
        System.out.println("Value of Name is set");
    }

    {
        System.out.println("Block");
        mark = 45.5;
    }

    public Student() {
        System.out.println("Constructor");
        mark = 98.5;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.mark);
    }

    private final String findName() {
        return "Raffi";
    }
}
