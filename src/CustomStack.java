import java.util.ArrayList;
import java.util.List;

class CustomStack<T> {
    private List<T> elements = new ArrayList<>();

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        int lastIndex = elements.size() - 1;
        T poppedElement = elements.get(lastIndex);
        elements.remove(lastIndex);
        return poppedElement;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public List<T> getElements() {
        return elements;
    }
}