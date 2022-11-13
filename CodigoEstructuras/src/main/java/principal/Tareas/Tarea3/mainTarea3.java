package principal.Tareas.Tarea3;

public class mainTarea3 {

    public static void main(String[] args) {
        
        /*Ejercicio 2 - Lista enlazada circular simple*/
        
        Ejercicio2 listaCircular = new Ejercicio2();
        listaCircular.insertar(2);
        listaCircular.insertar(3);
        listaCircular.insertar(4);
        listaCircular.insertar(1);
        listaCircular.insertar(0);
        listaCircular.imprimirLista();
        
        listaCircular.eliminarUltimo(4);
        listaCircular.imprimirLista();
        listaCircular.eliminarUltimo(2);
        listaCircular.imprimirLista();
        
    }
    
}
