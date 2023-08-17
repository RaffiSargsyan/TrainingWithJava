package lessons.lesson1;

import java.util.ArrayList;

public class AboutCollections2 {
    public static void main(String[] args) {

        //String[] animals = {"cat", "dog", "bird", "chicken"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("chicken");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
