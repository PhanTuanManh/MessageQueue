import java.util.ArrayList;
import java.util.List;
class MessageQueue {
    private List<String> queue = new ArrayList<>();

    public void enqueue(String message) {
        if (message.length() > 250) {
            System.out.println("Error: Message limit exceeded.");
            return;
        }
        queue.add(message);
    }

    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Error: Queue is empty.");
            return;
        }
        System.out.println("Popped message: " + queue.get(0));
        queue.remove(0);
    }

    public void display() {
        System.out.println("Queue: " + queue);
    }
}