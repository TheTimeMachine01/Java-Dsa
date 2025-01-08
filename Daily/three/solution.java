// Date: 3 Jan 2025, Friday

// Q: Detect a cycle in a linked list. (Linked Lists) [Easy]
// A:
package Daily.three;

import Daily.components.Node;

public class solution {

    public static void main(String[] args) {

        // Test case 1: List with no cycle
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        // node3.next = null; // No cycle here
        Code code = new Code();
        System.out.println("Test Case 1: " + code.hasCycle(node1)); // Should print false

        // Test case 2: List with cycle
        Node node4 = new Node(4);
        node3.next = node4;
        node4.next = node2; // Create a cycle: node4 -> node2
        System.out.println("Test Case 2: " + code.hasCycle(node1)); // Should print true

    }
}
