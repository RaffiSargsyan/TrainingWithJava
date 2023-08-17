package lessons.lesson1;

import java.util.ArrayList;

public class AboutCollections {
    public static void main(String[] args) {

        //   ArrayList<String> result = new ArrayList<String>();

        //   result.add("Family");
        //   result.add("Word");
        //   result.add("Life");
        //   result.add("Friends");

        //   result.set(1, "Forest"); //change index 1
        //   result.remove(1);
        //   result.clear(); //clear all

        //   for (int i = 0; i < result.size(); i++) {
        //       System.out.println(result.get(i));
        //   }
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("donuts");
        bakeryList.add("pie");

        ArrayList<String> productList = new ArrayList<>();
        productList.add("tomatoes");
        productList.add("potatoes");
        productList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("coffee");
        drinkList.add("tea");
        drinkList.add("water");

        groceryList.add(drinkList);
        groceryList.add(bakeryList);
        groceryList.add(productList);

        System.out.print(groceryList.get(1).get(2));

    }
}
