package lessons.lesson8;

import lessons.lesson7.Human;

public class EachUser {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.firstName = "Amalia";
        human1.lastName = "Hakobyan";
        human1.year = 2000;
        human1.gender = 'F';
        human1.isArmenian = true;

        Human human2 = new Human();
        human2.firstName = "Raffi";
        human2.lastName = "Sargsyan";
        human2.year = 1998;
        human2.gender = 'M';
        human2.isArmenian = true;


        System.out.println(human2.firstName +
                " " + human2.lastName);
        if (human1.year > human2.year) {
            System.out.println(human1.firstName);
        } else
            System.out.println(human2.firstName);


        System.out.println(human1.year >
                human2.year ? human1.firstName : human2.firstName);

        human1.sayHello();

        human1.printFullName();
        human2.printFullName();

        String s = human1.fullName();
        System.out.println("Full name of human 1 is " + s);

        human1.sum(22, 8);

        human1.print1ToN(10);

        String text = "Amalia Hakobyan";
        System.out.println(text.length());
        System.out.println(text.charAt(1));
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
        int countOfA = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'A' || text.charAt(i) == 'a') {
                countOfA++;
            }
        }
        System.out.println(countOfA);

        System.out.println(text.toUpperCase());
        String z = text.toLowerCase();
        System.out.println(z);
        System.out.println(text);


    }
}
