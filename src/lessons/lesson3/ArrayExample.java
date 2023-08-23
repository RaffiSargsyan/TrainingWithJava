package lessons.lesson3;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {7, 8, 14, 5, 6, 88, 90, 11};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println(max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);


        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        int countOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEven++;
            }

        }

        System.out.println(countOfEven);
        int countOfOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                countOfOdd++;
            }

        }
        System.out.println(countOfOdd);
        System.out.println();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

        double sum1 = 0;
        for (int i : array) {
            sum1 = sum1 + i;
        }
        System.out.println(sum1 / array.length);
    }
}
