package principal.TrabajoEnClase.Semana3;

public class stack<T> {

    //Nuestros atributos
    private node<T> top;

    //Se hace void porque no se retorna nada
    //Se le pasan los valores/datos
    //que se quieren guardar como parámetros
    public void push(T value) {
        node<T> newNode = new node<>(value);

        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
    }

    //Se hace "T" porque se necesita retornar algo
    public T pop() {
        node<T> poppedValue = top;
        if (top != null) {
            top = top.getNext();
            return poppedValue.getValue();
        } else {
            return null;
        }

    }

    public boolean encuentra(T x) {
        node<T> aux = top;
        boolean seEncuentra = false;

        while (aux != null) {
            if (aux.getValue() == x) {
                seEncuentra = true;
                return seEncuentra;
            } else {
                aux = aux.getNext();
            }
        }

        return seEncuentra;
    }
}
