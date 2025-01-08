package Daily.three;

import Daily.components.Node;

public class Code {

    public boolean hasCycle(Node head) {

        if(head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            System.out.println("Slow: " + slow.data + " Fast: " + fast.data);
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
