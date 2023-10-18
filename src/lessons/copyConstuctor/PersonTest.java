package lessons.copyConstuctor;

public class PersonTest {
    public static void main(String[] args) {
        // create a Person object
        Person person1 = new Person("Amalia", 25);

        // Use the copy constructor to create a new Person object like on person1
        Person person2 = new Person(person1);

        // Display information about these persons
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2 (Copy of Person 1):");
        person2.displayInfo();
    }
}

