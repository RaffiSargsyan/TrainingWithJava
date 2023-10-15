package lessons.lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Musician pianist = new Musician() {
            @Override
            public void playMusic() {
                System.out.println("Playing piano");
            }
        };
        pianist.playMusic();

        Musician guitarist = () -> System.out.println("Playing guitar");

        guitarist.playMusic();

        Message sms = text -> System.out.println("Sending SMS: " + text);

        sms.sendMessage("hello");

        A z = (a, b) -> {
            return a + b;
        };
        System.out.println(z.sum(1, 2));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (Integer x : numbers) {
            System.out.print(x + " ");
        }
        System.out.println();

        numbers.forEach(x -> System.out.print(x + " "));
        System.out.println();

        List<String> names = new ArrayList<>();
        names.add("Raffi");
        names.add("Amalia");

        List<String> r = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(r);


        List<String> t = new ArrayList<>();
        for (String n : names) {
            t.add(n.toUpperCase());

        }
        System.out.println(t);
    }
}
