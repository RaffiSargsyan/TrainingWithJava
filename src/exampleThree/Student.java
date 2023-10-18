package exampleThree;

import exampleThree.Human;

class Student extends Human {
    @Override
    public void printInfo() {
        System.out.println("Это студент.");
    }
}