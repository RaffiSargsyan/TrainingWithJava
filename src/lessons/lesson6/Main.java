package lessons.lesson6;

/*
//object an instance of a class that can contain attributes and methods
 */
public class Main {
    public static void main(String[] args) {

        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.made);
        System.out.println(myCar1.model);
        System.out.println(myCar1.color);
        System.out.println();
        System.out.println(myCar2.made);
        System.out.println(myCar2.model);
        System.out.println(myCar2.color);

//        myCar1.drive();
//        myCar1.brake();
    }
}
