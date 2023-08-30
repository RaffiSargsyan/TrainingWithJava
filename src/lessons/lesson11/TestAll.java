package lessons.lesson11;

public class TestAll {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Administrator admin = new Administrator();

        teacher1.setName("Raffi");
        teacher1.setYear(1998);
        teacher1.setPhone("098897474");
        teacher1.setSalary(200);
        System.out.println(teacher1.getName() + " "  +
                " " + teacher1.getYear() +
                " " + teacher1.getPhone() +
                " " + teacher1.getSalary());


        admin.setName("Amalia");
        admin.setYear(1998);
        admin.setPhone("1212998");
        System.out.println(admin.getName() +
                " " + admin.getYear() +
                " " + admin.getPhone());

        System.out.println();

        admin.printInfo();

        System.out.println("\n");

        teacher1.printInfo();
    }
}
