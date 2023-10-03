package lessons.lesson17;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("login", "pass","@gmail");

        try {
            User u2 = (User) u1.clone();
            System.out.println(u2.login);
            System.out.println(u2.password);
            u2.login = "Raf";
            System.out.println(u1.login);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
