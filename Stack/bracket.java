import java.util.*;

public class bracket {

    static boolean areBracketsBalanced(String expr) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expr.length(); i++) {

            char x = expr.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;

            char check;
            switch (x) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                }

                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                }

                case ']' -> {
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                }
            }            
        }

        return (stack.isEmpty());
    }
    
    public static void main(String[] args) {

        String expr = "{([])}]";

        // System.out.println(expr.charAt(0));

        if(areBracketsBalanced(expr)) {
            System.out.println("Balanced");
        } else { 
            System.out.println("Not Balanced");
        }
    }
}