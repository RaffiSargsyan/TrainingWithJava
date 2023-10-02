package lessons.stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        String s = "{{}sdf(hg)k[]o}";
        System.out.println(isCoorect(s));
    }

    private static boolean isCoorect(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(i);
            if (e == '(' || e == '[' || e == '{') {
                stack.push(e);
                continue;
            }
            switch (e) {
                case ')':
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
            }

        }
        return stack.isEmpty();
    }
}
