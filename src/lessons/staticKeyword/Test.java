package lessons.staticKeyword;

public class Test {
    public static void main(String[] args) {
//        new Human();
//        System.out.println(Human.a);
//        System.out.println(Human.count);

//        Student student1 = new Student("Arpin");
//        Student student2 = new Student("Arpin");
//
//        Student.sum(10,10);
//        Student.sum(1,2);

        String s = "19";
        int temp = Integer.parseInt(s);
        System.out.println(temp + 1);

        char c = 'A';
        System.out.println(Character.isLetter(c));

        String password = "asdf A DF 34";
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Character.MAX_RADIX);
        System.out.println(Long.MAX_VALUE);
    }


}
