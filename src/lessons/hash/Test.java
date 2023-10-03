package lessons.hash;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4, "Raffi");
        map.put(6, "Amalia");
        map.put(19, "Arpine");
        map.put(4, "Raffi8");
        map.put(null, "Lucy");

        System.out.println(map);
        System.out.println(map.get(4));
        System.out.println(map.get(null));

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> x : entries) {
            System.out.println(x.getKey() + ", " + x.getValue());
        }
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + ", " + map.get(key));
        }

        HashMap<Integer, MyLang> numbers = new HashMap<>();
        numbers.put(1, new MyLang("one", "Մեկ"));
        numbers.put(2, new MyLang("two", "Երկու"));
        numbers.put(3, new MyLang("three", "Երեք"));
        numbers.put(4, new MyLang("four", "Չորս"));
        numbers.put(5, new MyLang("five", "Հինգ"));

        int a = 3, b = 2;
        System.out.println(numbers.get(a).en + " + " + numbers.get(b).en +
                " = " + numbers.get(a + b).en);
        System.out.println(numbers.get(a).hy + " + " + numbers.get(b).hy +
                " = " + numbers.get(a + b).hy);


        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(4, "Raffi");
        tmap.put(6, "Amalia");
        tmap.put(19, "Arpine");
        tmap.put(4, "Raffi 25");
//        tmap.put(, "Lucy");
        System.out.println(tmap);


        HashSet<String> s = new HashSet<>();
        s.add("");
    }
}
