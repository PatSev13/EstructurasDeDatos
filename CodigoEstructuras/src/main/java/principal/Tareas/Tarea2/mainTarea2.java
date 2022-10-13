package principal.Tareas.Tarea2;

public class mainTarea2 {

    public static void main(String[] args) {

        /*------------------ Queue/Cola ------------------*/
        cola<String> Cola = new cola<>();

        //Cola.enqueue("Sombra", 8);
        Cola.enqueue("Sol", 10);
        Cola.enqueue("Palco", 8);
        Cola.enqueue("Palco", 5);
        Cola.enqueue("Palco", 3);
        Cola.enqueue("Palco", 7);
        /*Cola.enqueue("Palco", 9);
        Cola.enqueue("Palco", 2);*/
        Cola.enqueue("Sombra", 6);
        Cola.enqueue("Sombra", 5);
        Cola.enqueue("Sombra", 4);
        Cola.enqueue("Palco", 2);
        Cola.enqueue("Sol", 6);
        Cola.enqueue("Sol", 5);
        Cola.enqueue("Sol", 15);
        Cola.enqueue("Sol", 3);
        
        
        for (int i = 0; i < Cola.size; i++) {
            System.out.println(Cola.dequeue().getValue2());
        }
    }

}
