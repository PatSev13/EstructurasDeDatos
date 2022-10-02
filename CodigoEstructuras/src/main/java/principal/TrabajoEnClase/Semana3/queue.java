package principal.TrabajoEnClase.Semana3;

public class queue<T> {

    private node<T> head;
    private node<T> tail;

    public void enqueue(T value) {
        node<T> newNode = new node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }

    }
}
