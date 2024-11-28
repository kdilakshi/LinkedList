
package inclass;

import java.util.LinkedList;

public class Question14 {
   
    private LinkedList<Integer> queue;

    public Question14() {
        queue = new LinkedList<>();
    }

    // Enqueue operation
    public void enqueue(int value) {
        queue.addLast(value);
    }

    // Dequeue operation
    public int dequeue() {
        if (!queue.isEmpty()) {
            return queue.removeFirst();
        } else {
            throw new IllegalStateException("Queue is empty.");
        }
    }

    // Display the queue
    public void displayQueue() {
        System.out.println(queue);
    }

    public static void main(String[] args) {
        Question14 fifoQueue = new Question14();

        // Enqueue elements
        fifoQueue.enqueue(1);
        fifoQueue.enqueue(2);
        fifoQueue.enqueue(3);
        System.out.println("Queue after enqueue operations:");
        fifoQueue.displayQueue();

        // Dequeue an element
        int dequeued = fifoQueue.dequeue();
        System.out.println("Dequeued element: " + dequeued);

        // Display the queue after dequeue operation
        System.out.println("Queue after dequeue operation:");
        fifoQueue.displayQueue();
    }
}
