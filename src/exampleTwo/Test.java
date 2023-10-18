package exampleTwo;

public class Test {
    public static void main(String[] args) {
        Human human = new Teacher();
        Human human1 = new Student();
        human1.printInfo();
        human.printInfo();

        Human person = new Student();
        if (person instanceof Student) {
            Student student = (Student) person;
            student.printInfo();
        } else {
            System.out.println("this is not ok");
        }


        Human humanTwo = new Human() {
            @Override
            public void printInfo() {
                System.out.println("This is anonymous class");
            }
        };
        human1.printInfo();
    }
}
