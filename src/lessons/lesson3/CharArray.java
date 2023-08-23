package lessons.lesson3;

import java.util.SortedMap;

public class CharArray {
    public static void main(String[] args) {
        char[] chars = {' ', 'A', 'M', 'A', 'L', 'I', 'A'};
        char x = 'A';
        int countOfa = 0;
        for (char aChar : chars) {
            if (aChar == x) {
                countOfa++;
            }
        }
        System.out.println(countOfa);

        int countOfa2 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == x) {
                countOfa2++;
            }
        }
        System.out.println(countOfa2);


        System.out.println(chars[chars.length / 2] + " " + chars[chars.length / 2 - 1]);


        int lastIndex = chars.length - 1;
        boolean result = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[lastIndex] == 'I' && chars[lastIndex - 1] == 'A') {
                result = true;
            }
        }
        System.out.println(result);


        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                System.out.print(chars[i]);
            }
        }
        System.out.println();

        boolean AMAThere = false;
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == 'A' && chars[i + 2] == 'A') {
                AMAThere = true;
                break;
            }
        }
        System.out.println("I find  ---> " + AMAThere);
    }
}




