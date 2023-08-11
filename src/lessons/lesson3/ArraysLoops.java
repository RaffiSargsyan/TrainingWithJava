package lessons.lesson3;

import java.util.Arrays;

public class ArraysLoops {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 2;
        myArray[1] = 44;
        myArray[3] = 22;
        myArray[4] = 123;
        System.out.println(myArray[0] + myArray[1]);
        System.out.println(myArray.length);
        System.out.println(myArray[0] + myArray[myArray.length - 1]);

        int[] secondArray = {3, 4, 66, 7, 8};
        System.out.println(secondArray[0]);
        System.out.println(secondArray[secondArray.length - 1]);

        int[] x;
        x = new int[]{3, 4, 5, 6, 7}; // another variant
        System.out.println(x[3]);

        int k = -1;
        if (k > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non Positive");
        }

        int b;
        if (k > 1)
            b = 1;
        else
            b = 0;
        System.out.println(b);

        b = k > 0 ? 1 : 0;
        System.out.println(b);

        System.out.println(k > 0 ? "Positive" : "Non Positive");

        System.out.println("----------------------------");

        if (k > 0) {
            System.out.println("Positive");
        } else {
            if (k < 0) {
                System.out.println("Negative");
            } else
                System.out.println("Zero");
        }
        k = 4;
        if (k == 1) {
            System.out.println("One");
        } else {
            if (k == 2) {
                System.out.println("Two");
            } else {
                if (k == 3) {
                    System.out.println("Three");
                } else {
                    System.out.println("Bigger");
                }
            }
        }
        System.out.println("-----------------------");

        int n = 3;

        switch (n) {
            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");
                break;
            case 3:
            case 4:
                System.out.println("Java");
                break;
            default:
                System.out.println("Bigger");
        }
        System.out.println("----------------------");

        String y = "aa";
        switch (y) {
            case "a":
                System.out.println("Not find");
                break;
            case "aa":
                System.out.println("Find");
                break;
        }
        /*
          about switch, switch cannot use long double float types it only can use byte short char int
         and java 8 can use String
         */
        System.out.println("-----------------------------");

        int counter = 1;
        while (counter < 11) {
            System.out.println(counter++);
        }

        k = 1;
        while (k <= 3) {
            System.out.println("Hello");
            k++;
        }

        System.out.println("---------------------");
        k = 11;
        do {
            System.out.println("Hello World");
            k++;
        } while (k <= 7);

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("----------------------------");

        String[] names = {"Ann", "Amalia", "Raffi", "Pele"};
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);

        }
        //  for (String s : names) {
        //      System.out.println(s);
        //  }

        for (int i = names.length; i < 0; i++) {
            System.out.println(i);
        }

//        for (int index = 0; index < names.length; index++) {
//            System.out.println(names[index]);
//
//        }
        // for (int i = 0; i < 100; i++) {
        //     if (i % 2 == 0){
        //         System.out.println(i);
        //     }
        // }
        int[] myArray2 = {3, 12, -3, 77, -3, 88};
        for (int element : myArray2) {
            if (element < 0) {
                System.out.println("Yes");
                break;
            }
        }

        for (int i = 0; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.print(i);

        }
    }
}
