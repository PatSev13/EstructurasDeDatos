package principal.Tareas.Tarea2;

public class mainTarea2 {

    public static void main(String[] args) {

        /*------------------ Queue/Cola ------------------*/
        cola<String> Cola = new cola<>();

        Cola.enqueue("Sol", 10, 1);
        Cola.enqueue("Palco", 8, 2);
        Cola.enqueue("Palco", 5, 3);
        Cola.enqueue("Palco", 3, 5);
        Cola.enqueue("Palco", 3, 4);
        Cola.enqueue("Palco", 3, 6);
        Cola.enqueue("Sombra", 5, 7);
        Cola.enqueue("Sombra", 5, 6);
        Cola.enqueue("Sombra", 4,8);
        Cola.enqueue("Sombra", 5, 9);
        Cola.enqueue("Palco", 2,9);
        Cola.enqueue("Sol", 6,10);
        Cola.enqueue("Sol", 15, 12);
        Cola.enqueue("Sombra", 3, 4);
        Cola.enqueue("Sol", 3, 14);
        Cola.enqueue("Sol", 3, 13);
        Cola.enqueue("Sol", 3, 15);
        Cola.enqueue("Palco", 2, 3);
        
        
        for (int i = 0; i < Cola.size; i++) {
            System.out.print("Entra " + (i+1)+"º: ");
            System.out.println(Cola.dequeue().getValue3());
        }
    }

}
