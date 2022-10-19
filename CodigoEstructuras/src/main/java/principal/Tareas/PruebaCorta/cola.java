package principal.Tareas.PruebaCorta;

/**
 *
 * @author Patrick
 */
public class cola<T> {

    private node<T> head;
    private node<T> tail;
    public int size;
    private node<T> firstInQueue;
    private node<T> dequeueTemp;

    public void enqueue(node<T> Orden) {
        node<T> newNode = Orden;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if (newNode.isDiscapacitado() == true) {
                newNode.setNext(head);
                head = newNode;
            } else {
                tail.setNext(newNode);
                tail = newNode;
            }
        }
        dequeueTemp = head;
        size++;
    }

    public node<T> dequeue() {

        if (head == null) {
            System.out.println("La cola está vacía");
            return null;

        } else {
            node<T> primeroEnFila = head;
            head = head.getNext();
            System.out.println("Sale orden de: " + primeroEnFila.getNombreCliente() + ". Cédula " + primeroEnFila.getCedulaCliente());
            size--;
            return primeroEnFila;
        }
    }

    public node<T> dequeue2() {

        if (head == null) {
            System.out.println("La cola está vacía");
            return null;

        } else {

            firstInQueue = dequeueTemp;

            dequeueTemp = dequeueTemp.getNext();

            return firstInQueue;
        }
    }

    public node<T> getHead() {
        return head;
    }

    public void setDequeueTemp(node<T> dequeueTemp) {
        this.dequeueTemp = dequeueTemp;
    }

    public node<T> getFirstInQueue() {
        return firstInQueue;
    }

}
