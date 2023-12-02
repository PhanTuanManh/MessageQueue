import java.util.ArrayList;
import java.util.List;

class CustomQueue<T> {
    private List<T> elements = new ArrayList<>();

    public void enqueue(T element) {
        elements.add(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return elements.remove(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public List<T> getElements() {
        return elements;
    }
}