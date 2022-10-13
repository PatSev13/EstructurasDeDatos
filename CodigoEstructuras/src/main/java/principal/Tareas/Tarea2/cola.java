package principal.Tareas.Tarea2;

public class cola<T> {

    private node<T> head;
    private node<T> tail;
    public int size;

    public void enqueue(T value, int value2, int value3) {
        node<T> newNode = new node<>(value, value2, value3);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            //---------------------- Palcos ----------------------
            if (newNode.getValue() == "Palco" && head.getValue() == "Palco") {

                if (newNode.getValue2() < head.getValue2() || newNode.getValue3() < head.getValue3()) {
                    newNode.setNext(head);
                    head = newNode;

                } else {
                    node<T> temp = head;
                    node<T> temp2 = temp.getNext();

                    while (temp.getValue() == "Palco" && (temp.getNext().getValue() == "Palco")) {
                        if (newNode.getValue2() < temp2.getValue2()) {
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

                        if (newNode.getValue2() < temp2.getValue2() || newNode.getValue3() < temp2.getValue3()) {
                            newNode.setNext(temp2);
                            temp.setNext(newNode);

                        } else if (newNode.getValue2().equals(temp2.getValue2())) {

                            while (temp2.getNext().getValue() != "Sol" || (temp2.getNext().getValue() == "Sombra" && temp2.getNext().getValue2() > newNode.getValue2())) {
                                temp = temp.getNext();
                                temp2 = temp2.getNext();
                            }

                            if (newNode.getValue3() < temp2.getValue3()) {
                                newNode.setNext(temp2);
                                temp.setNext(newNode);

                            } else {
                                temp = temp.getNext();
                                temp2 = temp2.getNext();
                                newNode.setNext(temp2);
                                temp.setNext(newNode);
                            }

                        } else if (newNode.getValue2() > temp2.getValue2()) {

                            while (newNode.getValue2() >= temp2.getValue2() && temp2.getNext().getValue() != "Sol") {
                                temp = temp.getNext();
                                temp2 = temp2.getNext();
                            }

                            if (newNode.getValue3() < temp2.getValue3()) {
                                newNode.setNext(temp2);
                                temp.setNext(newNode);

                            } else {
                                temp = temp.getNext();
                                temp2 = temp2.getNext();
                                newNode.setNext(temp2);
                                temp.setNext(newNode);
                            }
                        }

                    } else {
                        newNode.setNext(temp2);
                        temp.setNext(newNode);
                    }
                }

                //---------------------- Sombras ----------------------
                //---------------------- Soles ----------------------
            } else {

                if (newNode.getValue2() < tail.getValue2()) {
                    node<T> temp = head;

                    while (temp.getNext().getValue() != "Sol" && temp.getNext() != null) {
                        temp = temp.getNext();
                    }

                    if (newNode.getValue2() < temp.getNext().getValue2()) {
                        newNode.setNext(temp.getNext());
                        temp.setNext(newNode);

                    } else if (newNode.getValue2().equals(temp.getNext().getValue2())) {
                        temp = temp.getNext();

                        while (temp.getValue() == "Sol" && newNode.getValue2().equals(temp.getNext().getValue2())) {
                            temp = temp.getNext();
                        }

                        if (newNode.getValue3() > temp.getValue3()) {
                            newNode.setNext(temp.getNext());
                            temp.setNext(newNode);
                        } else {
                            node<T> temp2 = head;

                            while (temp2.getNext() != temp && temp2.getNext() != null) {
                                temp2 = temp2.getNext();
                            }

                            newNode.setNext(temp2.getNext());
                            temp2.setNext(newNode);
                        }
                    }

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
            System.out.print("Sector: " + firstInQueue.getValue() + ". Horario: " + firstInQueue.getValue2() + ". Cédula: ");
            return firstInQueue;
        }
    }
}
