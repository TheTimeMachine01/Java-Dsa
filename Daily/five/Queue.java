package Daily.five;

import Daily.components.Node;

public class Queue {

    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is already empty");
            return -1;
        }
        return front.data;
    }



    public boolean isEmpty() {
        return front == null;
    }


    
}
