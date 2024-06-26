package Basic.linklist;

public class dublylink<T> {
    
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {

        private final T data;
        private Node<T> next;
        private Node<T> prev;

        public Node(T data) {

            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    public void dublylink() {

        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null ) {

            head = tail = newNode;

        } else {

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public T remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: "+ index +", size: "+ size);
        }

        Node<T> current = head;

        if(index == 0) {

            head = head.next;

            if(head != null) {

                head.prev = null;

            } else {

                tail = null;

            }

        } else {

            for (int i = 0; i < index; i++) {

                current = current.next;

            }

            if (current.prev != null) {

                current.prev.next = current.next;
                
            }

            if(current.next != null) {

                current.next.prev = current.next;

            } else {

                tail = current.prev;

            }

        }

        size--;
        return current.data;
    }

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

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        
        dublylink<Integer> list = new dublylink<>();
        
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Element at index 1: "+ list.get(0));
        System.out.println("Element at index 2: "+ list.get(1));
        System.out.println("Element at index 3: "+ list.get(2));

        System.out.println(" ");

        System.out.println("List size is: "+ list.size());
        
        System.out.println(" ");
        System.out.println(" ");

        System.out.println(list.remove(1));
        System.out.println("Element at index 1: "+ list.get(0));
        System.out.println("Element at index 2: "+ list.get(1));
        System.out.println("List size is: "+ list.size());
    }

}
