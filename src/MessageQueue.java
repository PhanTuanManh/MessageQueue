class MessageQueue {
    private static final int MAX_QUEUE_SIZE = 5; // Đặt kích thước tối đa của queue
    private CustomQueue<String> queue = new CustomQueue<>();
    private CustomStack<String> stack = new CustomStack<>();

    public void enqueue(String message) {
        if (message.length() > 250) {
            System.out.println("Error: Message limit exceeded.");
            return;
        }

        if (queue.getElements().size() + stack.getElements().size() >= MAX_QUEUE_SIZE) {
            System.out.println("Error: Queue is full. Cannot enqueue message.");
            return;
        }

        if (!stack.isEmpty() && queue.isEmpty()) {
            System.out.println("Error: Queue is full. Cannot enqueue message.");
            return;
        }

        queue.enqueue(message);
    }


    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Error: Queue is empty.");
            return;
        }

        String dequeuedMessage = queue.dequeue();
        System.out.println("Popped message: " + dequeuedMessage);
        stack.push(dequeuedMessage);
    }


    public void display() {
        System.out.println("Queue: " + queue.getElements());
        System.out.println("Stack: " + stack.getElements());
    }
}