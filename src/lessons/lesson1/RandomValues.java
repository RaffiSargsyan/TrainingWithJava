package lessons.lesson1;

import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(5);
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.print(z);
    }
}
