package example;

public class Superclass {
    protected String name = "Amalia";
    private String name1 = "Raffi";
    public int number = 21;
    int num;
    public final String LASTNAME = "Sargsyan";
    public static String firstName = "Hakobyan";

//    /*
//    //members from protected are available with the
//     same package and in subclasses each of package.
//     */
//    protected void protectedMethod() {
//        System.out.println("This is method with the protected modifier");
//    }
//
//    public void printInfo() { //modifier public available from anywhere
//        System.out.println(name + name1);
//    }
//
//    void printNumber(int... num) { // we can only use default modifier in this package
//        for (int i : num) {
//            System.out.println(i);
//        }
//
//    }
//
//    public boolean isLetter(char name) {
//        boolean letter = Character.isLetter(name);
//        if (letter) {
//            System.out.println("good");
//        } else {
//            System.out.println("ok");
//        }
//        return letter;
//    }
}