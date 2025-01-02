// Date: 1 Jan 2025, Wednesday

// Q: Find the middle of the linked list. (Linked Lists) [Easy]
// A: Tortoise an Hare Algorithm method (can also be done with another method, which is already mentioned)
package Daily.one;

public class expected {

    static int getMid(Node head) {

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(head);
        System.out.println(getMid(head));
    }
}
