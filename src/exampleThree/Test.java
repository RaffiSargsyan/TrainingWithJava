package exampleThree;


public class Test {
    public static void main(String[] args) {
        Human person = new Student();

        if (person instanceof Student) {
            Student student = (Student) person;
            student.printInfo();
        } else {
            System.out.println("Этот человек не является студентом.");
        }

        if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            teacher.printInfo();
        } else {
            System.out.println("Этот человек не является учителем.");
        }
    }
}
