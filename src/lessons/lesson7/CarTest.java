package lessons.lesson7;


import lessons.model.Car;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setEngine(-8.8);
        System.out.println(myCar.getEngine());

        myCar.setModel("Mazda");
        myCar.setYear(2010);
        myCar.setEngine(3.3);
        System.out.println(myCar.getModel() + " " + myCar.getYear());

        String text = "Amalia";
        System.out.println(text.length());
        System.out.println(text.charAt(0));

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'A') {
                count++;
                System.out.println(count);
            }
        }
        System.out.println(text.toUpperCase());
        System.out.println(text);
    }
}
