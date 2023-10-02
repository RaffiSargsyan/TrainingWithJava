package lessons.memory;

public class StudentTest {
    public static void main(String[] args) {
        Student2 s1 = new Student2(15);
        Student2 s2 = new Student2(25);
        swap(s1, s2);
        System.out.println(s1.getAge());
        System.out.println(s2.getAge());
        change(s1);
        System.out.println(s1.getAge());
        System.out.println(s2.getAge());
    }

    private static void swap(Student2 a, Student2 b) {
        Student2 temp = a;
        a = b;
        b = temp;
    }

    private static void change(Student2 a) {
        a.setAge(100);
        a = new Student2(20);
        a.setAge(500);
    }
}
