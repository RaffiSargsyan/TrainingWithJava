package lessons.lesson6;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("Raffi", 24, 68);
        Human human2 = new Human("Amalia", 20, 59);

        human2.eat();
        human.drink();
    }
}
