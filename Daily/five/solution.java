// Date: 5 Jan 2025, Friday

// Q: Implement queue using array/linked list. (Queues) [Basic]
// A:
package Daily.five;

public class solution {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println("Is queue Empty? " + queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Front Element: " + queue.peek());
    }
}
