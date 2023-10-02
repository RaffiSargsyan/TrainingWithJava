package lessons.memory;

public class MemoryTest {
    public static void main(String[] args) {
        int a = 5;
        Student s1 = new Student();
        Student s2 = s1;
        s1 = new Student();
        s2 = null;
        f(s1);
        System.out.println(s1);
        System.out.println(s1.getName());
    }


    private static void f(Student a) {

        a.setName("Raffi");
    }
}
