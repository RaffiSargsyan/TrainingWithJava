package lessons.lesson1;

public class Example {
    public static void main(String[] args) {
        System.out.print("Hello World \n");
        System.out.println("How are you");
        byte a = -127;
        a = 1;
        a = -1;
        System.out.println(a);
        long n = 23231212234L;  //about long and word l
        System.out.println(n);
        float z = 43.2F;
        double c = 23.3;  // about double word f last on float

        boolean v = true;
        System.out.println(v);
        v = false;
        System.out.println(v);

        char q = '$';
        char qq = '\u003F';  //about unicode with type char
        System.out.println(q);
        System.out.println(qq);

        String s = "Dear";
        System.out.println(s);
        String firstName = "Raffi";
        String lastName = "Sargsyan";
        System.out.println(firstName + " " + lastName);
        //  about String for +
        int k = 12244;
        System.out.println("k= " + k);
    }
}
