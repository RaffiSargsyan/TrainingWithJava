package example;

public class Subclass extends Superclass {

    public static void main(String[] args) {

        Superclass superclass = new Superclass();

        superclass.number = 1;
        superclass.num = 25;
        superclass.name = "Amalia";

        Subclass subclass = new Subclass();
        subclass.name = "Amalia";
        subclass.number = 2;
        superclass.num = 2;


//        Superclass superclass = new Superclass();
//        Subclass subclass = new Subclass();
//        subclass.name = "Amalia";
//        superclass.name = "Amalia Hakobyan";
////        superclass.name1
//        superclass.number = 25;
//        System.out.println(superclass.num);
//
//        superclass.protectedMethod();
//        System.out.println(superclass.name);
//        superclass.printInfo();
//        superclass.printNumber(12, 3, 4, 5);
//        char c = 'd';
//        char c1 = '3';
//        superclass.isLetter(c1);

    }


}
