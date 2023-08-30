package lessons.lesson7;

import lessons.model.Human;


public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        human1.firstName = "Amalia";
        human1.lastName = "Hakobyan";
        human1.age = 23;
        human1.year = 1999;
        human1.gender = 'F';
        human1.isArmenian = true;


        human2.firstName = "Raffi";
        human2.lastName = "Sargsyan";
        human2.age = 24;
        human2.year = 1998;
        human2.gender = 'M';
        human2.isArmenian = true;

        String ternaryOperator = human1.year < human2.year ? human2.firstName
                : human1.firstName;

        System.out.println(ternaryOperator);




//        String nameOfHuman1 = human1.firstName;
//        String nameofHuman2 = "Raffi";

//        System.out.println(nameOfHuman1.toLowerCase());
//        System.out.println(nameOfHuman1.toUpperCase());
//        System.out.println(nameOfHuman1.charAt(0));
//        System.out.println(nameOfHuman1.length());
//        System.out.println(nameofHuman2.toLowerCase());

//        int count = 0;
//        for (int i = 0; i < nameofHuman2.length(); i++) {
//            if (nameofHuman2.charAt(i) == 'f' || nameofHuman2.charAt(i) == 'i') {
//                count++;
//            }
//        }
//        System.out.println(count);

        human1.sayHello();
        human2.sayHello();

        human1.printFullName(); // void method

        String fullNameAmal = human1.fullName();
        System.out.println("Full name of human1 is " + fullNameAmal);


//        String s = human1.fullName();  //return method
//
//        human1.sum(human1.age, human2.age);
//
//        human1.print1ToN(10);

        human1.sum(19,22);
        human2.print1ToN(10);
    }
}
