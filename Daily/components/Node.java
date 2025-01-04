package Daily.components;

public class Node {
    public int data;
    public Node next;

    public Node(int x) {
        this.data = x;
        this.next = null;
    }

//    @Override
//    public String toString() {
//        return data + " -> " + (next != null ? next.toString() : "null");
//    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node current = this;

        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append(" null ");
        return sb.toString();
    }
}
