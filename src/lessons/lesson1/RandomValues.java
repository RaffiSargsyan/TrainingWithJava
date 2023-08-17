package lessons.lesson1;

import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(5);   //generated number which is between 5
        int k = random.nextInt();          //generated number which is situated type int
        double y = random.nextDouble(99.2);
        boolean z = random.nextBoolean();

        System.out.print(y);
    }
}
