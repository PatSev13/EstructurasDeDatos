package principal.Tareas.Tarea3;

/**
 *
 * @author Patrick
 */
public class Ejercicio2<T> {

    private node<T> head;
    private node<T> tail;

    public void insertar(T value) {
        node<T> nuevoNodo = new node<>(value);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);

        } else if ((int) head.getValue() > (int) nuevoNodo.getValue()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);

        } else if ((int) tail.getValue() <= (int) nuevoNodo.getValue()) {
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);

        } else {
            node<T> aux = tail;

            while ((int) aux.getNext().getValue() < (int) nuevoNodo.getValue()) {
                aux = aux.getNext();
            }

            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }

    }

    public void imprimirLista() {
        node<T> aux = head;
        do {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        } while (aux != head);
        System.out.println("\n");

    }

    public void eliminarUltimo(int valor) {
        node<T> aux = head;

        while (aux.getNext() != tail) {
            aux = aux.getNext();
        }

        if (valor == (int) tail.getValue()) {
            tail.setNext(null);
            aux.setNext(head);
            tail = aux;
        } else {
            System.out.println("El valor indicado no coincide con el del último nodo\n");
        }
    }

}
