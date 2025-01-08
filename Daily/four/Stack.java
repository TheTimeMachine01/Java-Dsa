package Daily.four;

import Daily.components.Node;

public class Stack {

    public Node head;

    public Stack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int i) {

        Node newNode = new Node(i);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The Stack is already Empty. E: Cannot perform pop operation on empty stack");
            return -1;
        }

        int value = head.data;
        head = head.next;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty.k");
            return -1;
        }
        return head.data;
    }
}
