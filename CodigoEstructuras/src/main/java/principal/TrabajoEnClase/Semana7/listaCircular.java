package principal.TrabajoEnClase.Semana7;

import principal.TrabajoEnClase.Semana3.node;

public class listaCircular {

private node<Persona> head;
private node<Persona> tail;

    public void insertar(Persona value) {
        node<Persona> nuevoNodo = new node<Persona>(value);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);

        } else if (head.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);

        } else if (tail.getValue().getId() <= nuevoNodo.getValue().getId()) {
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);

        } else {
            node<Persona> aux = tail;
            
            while (aux.getNext().getValue().getId() < nuevoNodo.getValue().getId()) {
                aux = aux.getNext();
            }

            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }

    }

    public void imprimirLista() {
        node<Persona> aux = head;
         do  {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        } while (aux != head); 
         /*Se puede hacer con el do while o con un while como en la lista normal
         e imprimir el valor de la cola o tail por a parte*/
    }
    
}
