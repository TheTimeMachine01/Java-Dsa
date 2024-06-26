package DSA.Basic.Stack;

class Stack {

    private final int maxSize;
    private final char[] stackArray;
    private int top;

    public Stack(int size) {

        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char value) {
        stackArray[++top] = value;
    }

    public char pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

public class Reverse {

    static String turn(String str) {

        int length = str.length();

        Stack stack = new Stack(length);

        for (int i = 0; i < length; i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();

    }

    public static void main(String[] args) {
        String str = "Ashish";

        String out = turn(str);

        System.out.println(out);
    }
}
