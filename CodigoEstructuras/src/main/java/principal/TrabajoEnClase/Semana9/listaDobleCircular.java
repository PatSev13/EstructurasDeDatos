package principal.TrabajoEnClase.Semana9;

import principal.TrabajoEnClase.Semana3.node;
import principal.TrabajoEnClase.Semana7.Persona;

public class listaDobleCircular {

    private node<Persona> head;
    private node<Persona> tail;

    public void insertar(Persona value) {
        node<Persona> nuevoNodo = new node<>(value);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);
            head.setBack(tail);

        } else if (head.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);

        } else if (tail.getValue().getId() <= nuevoNodo.getValue().getId()) {
            nuevoNodo.setBack(tail);
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);

        } else {
            node<Persona> aux = tail;

            while (aux.getNext().getValue().getId() < nuevoNodo.getValue().getId()) {
                aux = aux.getNext();
            }

            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);

            aux.getNext().getNext().setBack(nuevoNodo);
            nuevoNodo.setBack(aux);
        }

    }

    public void imprimirLista() {
        node<Persona> aux = head;
        do {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        } while (aux != head);
    }

    public void existe(int id) {
        node<Persona> aux = head;
        boolean existe = false;

        if (head == null) {
            System.out.println("No existen datos en la lista");
            return;

        } else if (id == aux.getValue().getId()) {
            existe = true;
            System.out.println("Existen datos de una persona con el id indicado en la primera posición");

        } else if (id == aux.getBack().getValue().getId()) {
            existe = true;
            System.out.println("Existen datos de una persona con el id indicado en la última posición");

        } else {
            while (aux != tail) {
                if (id == aux.getValue().getId()) {
                    existe = true;
                    aux = tail;
                    System.out.println("Existen datos de una persona con el id indicado en medio de la lista");
                } else {
                    aux = aux.getNext();
                }
            }
        }

        if (existe == false) {
            System.out.println("No hay niguna persona en la lista con el id buscado");
        }

    }

    public void modifica(Persona value) {
        boolean existe = false;

        if (head == null) {
            System.out.println("No existen datos en la lista");
            return;

        } else if (head.getValue().getId() == value.getId()) {
            head.getValue().setNombre(value.getNombre());
            existe = true;

        } else if (tail.getValue().getId() == value.getId()) {
            tail.getValue().setNombre(value.getNombre());
            existe = true;

        } else {
            node<Persona> aux = head;
            while (aux != tail && aux.getValue().getId() != value.getId()) {
                aux = aux.getNext();
            }

            if (aux.getValue().getId() == value.getId()) {
                aux.getValue().setNombre(value.getNombre());
                existe = true;
            }
        }

        if (existe == false) {
            System.out.println("No hay niguna persona en la lista con el id buscado para realizar la modificación");
        } else {
            System.out.println("Se realizaron los cambios exitosamente");
        }
    }

    public void elimina(int id) {
        node<Persona> aux = head;

        if (head == null) {
            System.out.println("No existen datos en la lista");

        } else if (head.getValue().getId() == id) {
            aux = aux.getNext();
            aux.setBack(tail);
            tail.setNext(aux);
            head = aux;

        } else if (tail.getValue().getId() == id) {
            aux = aux.getBack().getBack();
            aux.setNext(head);
            head.setBack(aux);
            tail = aux;

        } else {
            while (aux.getValue().getId() != id && aux != tail) {
                aux = aux.getNext();
            }

            if (aux.getValue().getId() == id) {
                aux = aux.getNext();
                aux.setBack(aux.getBack().getBack());
                aux = aux.getBack();
                aux.setNext(aux.getNext().getNext());
            } else {
                System.out.println("No hay niguna persona en la lista con el id buscado");
            }
        }
    }

    public Persona extrae(int id) {
        node<Persona> aux = head;

        if (head == null) {
            System.out.println("No existen datos en la lista");
            return null;

        } else if (head.getValue().getId() == id) {
            node<Persona> temp = head;
            aux = aux.getNext();
            aux.setBack(tail);
            tail.setNext(aux);
            head = aux;
            return temp.getValue();

        } else if (tail.getValue().getId() == id) {
            node<Persona> temp = tail;
            aux = aux.getBack().getBack();
            aux.setNext(head);
            head.setBack(aux);
            tail = aux;
            return temp.getValue();

        } else {
            while (aux.getValue().getId() != id && aux != tail) {
                aux = aux.getNext();
            }

            if (aux.getValue().getId() == id) {
                node<Persona> temp = aux;
                aux = aux.getNext();
                aux.setBack(aux.getBack().getBack());
                aux = aux.getBack();
                aux.setNext(aux.getNext().getNext());
                return temp.getValue();
            } else {
                System.out.println("No hay niguna persona en la lista con el id buscado");
                return null;
            }
        }
    }
}
