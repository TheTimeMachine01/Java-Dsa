package Daily.one;

public class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }

    @Override
    public String toString() {
        return data + " -> " + (next != null ? next.toString() : "null");
    }
}
