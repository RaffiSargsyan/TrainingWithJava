package lessons.lesson8;

public class Test {
    public static void main(String[] args) {
        byte x = 4;
        int a = 129;

        x = (byte) a;
        System.out.println(x);

        x = (byte) (x + 1);
        System.out.println(x);

        x++;
        System.out.println(x);
        x += 5;
        System.out.println(x);

        x = 1;
        System.out.println(x + 5 + " java");
        System.out.println("java " + x + 5 + " java");
        System.out.println("java " + (x + 5) + " java");

        String s = "19";
        int z = Integer.parseInt(s);
        System.out.println(z + 1);

    }
}
