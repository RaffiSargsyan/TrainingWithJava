package lessons.trainingEquals;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Raffi", 25);
        Student s2 = new Student("Raffi", 25);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        System.out.println(students.contains(s2));

        String a = "Aa";
        String b = "BB";
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println("_________________________");
        String z = "Hello";
        String q = "Hello";
        System.out.println(z == q);
        System.out.println(z.equals(q));
        //imutable string

        String name = "Raffi";
        String surname = "Sargsyan";
        String result = "Hello" + name + " " + surname + "2023";
        System.out.println(result);
        StringBuilder sb = new StringBuilder();
        String result2 = sb.append("Hello")
                .append(name)
                .append(" ")
                .append(surname)
                .append(" 2023").toString();
        System.out.println(result2);

        Integer i = 127;
        Integer i2 = 127;
        System.out.println(i == i2);


        drive(Direction.EAST);
        drive(Direction.WEST);
        
    }

    static void drive(Direction d) {

        switch (d){
            case EAST -> System.out.println("drive EAST");
            case WEST -> System.out.println("drive WEST");
            case SOUTH -> System.out.println("drive SOUTH");
            case NORTH -> System.out.println("drive NORTH");
        }
    }

}
