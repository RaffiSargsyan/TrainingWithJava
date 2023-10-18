package keywordStatic;

public class Test {
    public static String name;
    private int age;

    static void info() {

        System.out.println(name);
//        System.out.println(age);
    }

    static {
//        age = 12;
    }

    class Info {
        public String city;

        void test1() {
            age = 1;
            info();

        }

    }


}
