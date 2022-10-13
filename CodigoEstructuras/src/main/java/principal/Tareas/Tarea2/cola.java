package principal.Tareas.Tarea2;

public class cola<T> {

    private node<T> head;
    private node<T> tail;
    public int size;

    public void enqueue(T value, int value2) {
        node<T> newNode = new node<>(value, value2); //Se instancia cuando tenga que crearse el nodo como tal
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            //---------------------- Palcos ----------------------
            if (newNode.getValue() == "Palco" && head.getValue() == "Palco") {

                if ((int) newNode.getValue2() < (int) head.getValue2()) {
                    newNode.setNext(head);
                    head = newNode;
                } else {
                    node<T> temp = head;
                    node<T> temp2 = temp.getNext();

                    while (temp.getValue() == "Palco" && (temp.getNext().getValue() == "Palco")) {
                        if ((int) newNode.getValue2() < (int) temp2.getValue2()) {
                            newNode.setNext(temp2);
                            temp.setNext(newNode);
                            break;
                        } else {
                            temp = temp.getNext();
                            temp2 = temp2.getNext();
                        }

                    }
                    newNode.setNext(temp2);
                    temp.setNext(newNode);
                }

            } else if (newNode.getValue() == "Palco" && head.getValue() != "Palco") {
                newNode.setNext(head);
                head = newNode;

                //---------------------- Palcos ----------------------
                //---------------------- Sombras ----------------------
            } else if (newNode.getValue() == "Sombra") {
                if (head.getNext().getValue() != "Palco") {
                    node<T> temp = head.getNext();
                    newNode.setNext(temp);
                    head.setNext(newNode);
                } else {
                    node<T> temp = head;
                    node<T> temp2 = temp.getNext();

                    while (temp.getValue() == "Palco" && (temp.getNext().getValue() == "Palco")) {
                        temp = temp.getNext();
                        temp2 = temp2.getNext();
                    }

                    if (temp2.getValue() == "Sombra") {
                        if ((int) newNode.getValue2() < (int) temp2.getValue2()) {
                            newNode.setNext(temp2);
                            temp.setNext(newNode);
                        }
                    } else {
                        newNode.setNext(temp2);
                        temp.setNext(newNode);
                    }
                }

                //---------------------- Sombras ----------------------
                //---------------------- Soles ----------------------
            } else {
                if ((int) newNode.getValue2() < (int) tail.getValue2()) {
                    node<T> temp = head;

                    while (temp.getNext().getValue() != "Sol" && temp.getNext() != null) {
                        temp = temp.getNext();
                    }
                    newNode.setNext(temp.getNext());
                    temp.setNext(newNode);
                    
                } else {

                    tail.setNext(newNode);
                    tail = newNode;
                }
            }

            //---------------------- Soles ----------------------
            
        }
        size++;
    }

    public node<T> dequeue() {

        if (head == null) {
            System.out.println("La cola está vacía");
            return null;

        } else {
            node<T> firstInQueue = head;
            head = head.getNext();
            System.out.print("Sector: "+ firstInQueue.getValue() + ". Horario: ");
            return firstInQueue; //Si se retorna en ambas condiciones el return no hace falta al final
        }
    }
}
