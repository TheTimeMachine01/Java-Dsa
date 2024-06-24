package linklist;

public class link<T> {
    
    private Node<T> head;
    private int size;

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void link() {
        this.head = null;
        this.size = 0;
    }

    // Add method to add an element to the end of the list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {

            head = newNode;

        } else {

            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;

        }

        size++;
    }

    // Remove method to remove an element by index
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> previous = null;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
        size--;
        return current.data;
    }

    // Get method to retrieve an element by index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Method to get the size of the list
    public int size() {
        return size;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        link<Integer> list = new link<>();
        list.add(1);
        list.add(2);
        list.add(3);

    }
}
