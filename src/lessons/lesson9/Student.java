package lessons.lesson9;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("Created");
        name = "Raffi";
    }

    public Student(String n) {
        name = n;
    }

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}
