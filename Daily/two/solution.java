// Date: 2 Jan 2025, Thursday

// Q: Reverse a singly linked list. (Linked Lists) [Easy]
// A:
package Daily.two;

import Daily.components.Node;

public class solution {

    Node head;

    Node rev(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null) {
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        solution sol = new solution();

        sol.head = new Node(10);
        sol.head.next = new Node(20);
        sol.head.next.next = new Node(30);
        sol.head.next.next.next = new Node(40);
        sol.head.next.next.next.next = new Node(50);
        sol.head.next.next.next.next.next = new Node(60);

        System.out.println("Original List:");
        System.out.println(sol.head);

        sol.head = sol.rev(sol.head);

        System.out.println("Reversed List:");
        System.out.println(sol.head);
    }
}
