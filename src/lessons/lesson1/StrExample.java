package lessons.lesson1;

import java.util.Locale;

public class StrExample {
    public static void main(String[] args) {
        //String is a reference data type that can store one or more
        //characters reference data types have access to useful methods

        String name = "Water";

//        this method ignore lower or upper cases
//        boolean result = name.equalsIgnoreCase("dear");
//        int result = name.length();
//        char result = name.charAt(3) ;   //to find index in name
//        int result = name.indexOf("D");  //to find symbol, with index
//        boolean result = name.isEmpty(); //It's only can be true if we were writing ""
//        String result = name.toLowerCase();
//        String result = name.toUpperCase();
//        String result = name.trim();            //deleted all spaces
//        String result = name.replace("W", "N"); //changed symbols
        String result = String.valueOf(name.getClass().getPackage());

        System.out.println(result);
    }
}
