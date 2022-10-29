package principal.TrabajoEnClase.Semana7;

import principal.TrabajoEnClase.Semana3.node;

public class list {

    private node<Persona> cabeza;

    public void insertar(Persona value) {
        node<Persona> nuevoNodo = new node<Persona>(value);

        if (cabeza == null) {
            cabeza = nuevoNodo;

        } else if (cabeza.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;

        } else if (cabeza.getValue().getId() < nuevoNodo.getValue().getId() && cabeza.getNext() == null) {
            cabeza.setNext(nuevoNodo);

        } else {
            node<Persona> aux = cabeza;
            while (aux.getNext() != null && aux.getNext().getValue().getId() < nuevoNodo.getValue().getId()) {
                aux = aux.getNext();
            }

            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }

    }

    public void imprimirLista() {
        node<Persona> aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
    }

    public void eliminarPersona(int idBuscado) {
        boolean seEncuentra = false;

        if (cabeza == null) {
            System.out.println("No hay datos en la lista");

        } else {
            node<Persona> aux = cabeza;

            while (aux.getNext() != null) {

                if (aux.getNext().getValue().getId() == idBuscado) {
                    System.out.println("Datos eliminados: " + aux.getNext().getValue().toString());
                    aux.setNext(aux.getNext().getNext());
                    seEncuentra = true;

                } else {
                    aux = aux.getNext();
                }

            }
            if (seEncuentra == false) {
                System.out.println("No hay niguna persona en la lista con el id buscado");
            }
        }
    }
}
