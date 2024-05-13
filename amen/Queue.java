package amen;

public class Queue {
    private int[] numbers;
    private int front;
    private int rear;
    private int nItems;
    private int maxSize;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        numbers = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
        }
        return numbers[front];
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Full");
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        numbers[++rear] = value;
        nItems++;
    }

    public int dequeue(int value) {
        if (isEmpty()) {
            System.out.println("Empty");
        }
        int frontValue = numbers[front++];
        if (front == maxSize) {
            front = 0;

        }
        nItems--;
        return frontValue;
    }

    public static void main(String[] args) {
        Queue numQueue = new Queue(5);
        numQueue.enqueue(11);
        numQueue.enqueue(22);
        numQueue.enqueue(33);
        numQueue.enqueue(44);
        numQueue.enqueue(55);

        numQueue.dequeue(55);
        numQueue.dequeue(55);
        System.out.println("Front element:" + numQueue.peek());
        System.out.println("Size of the Queue:" + numQueue.nItems);
        while(!numQueue.isEmpty()){
            System.out.println(numQueue.dequeue(1));
        }
    }


}
