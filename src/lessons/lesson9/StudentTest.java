package lessons.lesson9;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Amalia");
        student1.setAge(22);

        System.out.println(student1.getName());

        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s3.getName());

        Student s4 = new Student("Elianora");
        System.out.println(s4.getName());

        Student s5 = new Student("Amalia",22);
        System.out.println(s5.getName() + " " + s5.getAge());

        student1.sum(1,5);
        student1.sum(1,3,5);
    }
}
