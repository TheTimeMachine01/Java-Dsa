// Date: 4 Jan 2025, Friday

// Q: Implement stack using array/linked list. (Stacks) [Basic]
// A:
package Daily.four;

public class solution {



    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Is stack empty ? :" + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Is stack empty ? :" + stack.isEmpty());


        System.out.println(stack.peek());  // Should return the top element of the Stack
        System.out.println("Popped: " + stack.pop()); // removes the top element and returns its value

        System.out.println(stack.head);
        System.out.println(stack.isEmpty()); // returns true if empty (Here returns False)

    }
}
