package DSA.Basic.LinkedList;

public class Demo<T> {

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

    public Demo() {

        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T data) {

        Node<T> node = new Node<>(data);

        if(head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        size++;
    }

    public T get(int index) {

        if(index < 0 || index >= size) {

            throw new IndexOutOfBoundsException("The provided Index: "+ index +" is greater than size: "+ size );

        }

        Node<T> current = head;

        for (int i = 0; i < index; i++) {

            current = current.next;
        }

        return current.data;
    }

    public T remove(int index) {

        if(index < 0 || index >= size) {

            throw new IndexOutOfBoundsException("The provided Index: "+ index +" is greater than size: "+ size );

        }

        Node<T> current = head;

        if (index == 0) {

            head = head.next;

            if (head != null) {

                head.prev = null;

            } else {

                tail = null;

            }

        }else {


            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            if (current.prev != null) {

                current.prev.next = current.next;
            }

            if(current.next !=null) {

                current.next.prev = current.next;

            } else {
                tail = current.prev;
            }

        }

        size--;
        return current.data;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }



    public static void main(String[] args) {

        Demo<Integer> list = new Demo<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("The size of the list is: "+ list.size());

        System.out.println(" ");
        System.out.println(" ");

        list.remove(2);
        System.out.println("The entry at Index 0 is: "+ list.get(0));
        System.out.println("The entry at Index 1 is: "+ list.get(1));
        System.out.println("The entry at Index 2 is: "+ list.get(2));


        System.out.println(" ");
        System.out.println("The size of the list is: "+ list.size());

    }

}