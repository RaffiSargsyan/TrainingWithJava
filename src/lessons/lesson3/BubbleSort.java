package lessons.lesson3;

/*
temp = x;
        x = y;
        y = temp;
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 99, 34, 88, 7, 0, 9, 2};


        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        }
    }



//        int temp = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//
//            }
//            System.out.print(array[i] + ",");
//        }

