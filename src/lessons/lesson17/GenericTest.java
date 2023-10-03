package lessons.lesson17;

public class GenericTest {
    public static void main(String[] args) {

        Integer[] i = {1, 2};
        Double[] d = {1.2, 2.2, 22.1};
        print(i);
        print(d);
    }

    static <E> void print(E[] a) {
        for (E e : a) {
            System.out.println(e + " ");
        }
        System.out.println();
    }


}
