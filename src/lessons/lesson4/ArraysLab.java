package lessons.lesson4;

public class ArraysLab {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");      // print numbers from 1 to 15
        }
        System.out.println("\n");

        for (int i = 15; i >= 1; i--) {
            System.out.print(i + " ");      // print numbers from 1 to 15 but reverse
        }
        System.out.println("\n");

        for (int i = -10; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");  // print even numbers form -10 to 15
            }
        }
        System.out.println("\n");

        for (int i = -10; i <= 15; i += 2) {
            System.out.print(i + " ");      //print even numbers form -10 to 15 but another variant, without if
        }
        System.out.println("\n");


        for (int i = 0; i <= 15; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");   // print only odd numbers from  1 to 15
            }
        }
        System.out.println("\n");


        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" # ");  // print symbols # using given number
            }
            System.out.println();
        }
        System.out.println("\n");


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" * ");  // print symbols # but reverse mode
            }
            System.out.println();
        }
        System.out.println("\n");


        int[] array = new int[10];   // creat an array with number  1 -10
        // array[0] = 1;
        // array[0] = 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");


        int[] myArray = new int[11];  // creat an array with even numbers from  -10 to 10
        for (int i = 0, j = -10; i < myArray.length; i++, j += 2) {
            myArray[i] = j;
        }
        for (int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        int[] array2 = {2, 4, 6, 1, -23, 34, 4, 88, 4,};  // given an array and print odd elements
        for (int i : array2) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        for (int i : array2) {               //print numbers which is bethwen from -10 and 7
            if (i >= -10 && i <= 7) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        for (int i : array2) {         //print element which can divided 3 or 4
            if (i % 3 == 0 || i % 4 == 0)
                System.out.print(i + " ");

        }
        System.out.println("\n");

        int countOfEvens = 0;    //print count of elements
        for (int i : array2) {
            if (i % 2 == 0)
                countOfEvens++;
        }
        System.out.println("This number = " + countOfEvens);
        System.out.println("\n");


        int sum = array2[0]; //  //print sum of elements
        for (int i = 1; i < array2.length; i++) {
            sum = sum + array2[i];
        }
        System.out.println(sum);

        System.out.println("\n");

        int max = array2[0];           //print maximum number
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max)
                max = array2[i];
        }
        System.out.println(max);


        int[] array1 = {4, 2, 6, 7, 9, 0, -9, 5}; //sort array in asc.
        for (int i : array1) {
            System.out.print(i + " ");

        }
        System.out.println("\n");


        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] > array1[i + 1]) {
                int num = array1[i];
                array1[i] = array1[i + 1];
                array1[i + 1] = num;
            }
        }
        for (int i : array1) {
            System.out.print(i + " ");
        }
    }
}

// int x = 4, z = 5;
// int l = x;
// x = z;
// z = l;
// System.out.println("x = " + x + " z = " + z);