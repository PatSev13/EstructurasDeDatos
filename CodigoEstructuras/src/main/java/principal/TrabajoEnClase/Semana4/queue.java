package principal.TrabajoEnClase.Semana4;

import principal.TrabajoEnClase.Semana3.node;

public class queue<T> {

    private node<T> head;
    private node<T> tail;

    public void enqueue(T value) {
        node<T> newNode = new node<>(value); //Se instancia cuando tenga que crearse el nodo como tal
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }

    }

    public node<T> dequeue() {

        if (head == null) {
            System.out.println("La cola está vacía");
            return null;

        } else {
            node<T> firstInQueue = head;
            head = head.getNext();
            return firstInQueue; //Si se retorna en ambas condiciones el return no hace falta al final
        }
    }

    public node<T> findByIndex(int index) {

        if (head == null) {
            System.out.println("La cola está vacía");
            return null;

        } else {
            node<T> temp = head;

            while (temp.getNext() != null && index != 0) {
                temp = temp.getNext();
                index--;
            }

            if (index == 0) {
                return temp;
            } else {
                System.out.println("El índice es mayor al número de elementos de la cola");
                return null;
            }
        }
    }
    
    
    

}
