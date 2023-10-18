package lessons.copyConstuctor;

public class Person {
    private String name;
    private int age;

    // Constructor to initialize a Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
