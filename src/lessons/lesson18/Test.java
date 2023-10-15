package lessons.lesson18;

public class Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 46, 89, 0};
        int[] b = {1, 1, 99, 9, 110};

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);

        int min = b[0];
        for (int i = 0; i < b.length; i++) {
            if (min > b[i]) {
                min = b[i];
            }
        }
        System.out.println(min);


//        String s = null;
//        System.out.println(s.length());
    }
}
