package principal;

import principal.TrabajoEnClase.Semana2.Recursion;
import principal.TrabajoEnClase.Semana3.stack;
import principal.TrabajoEnClase.Semana4.queue;
import principal.TrabajoEnClase.Semana7.Persona;
import principal.TrabajoEnClase.Semana7.list;
import principal.TrabajoEnClase.Semana7.listaCircular;
import principal.TrabajoEnClase.Semana9.listaDobleCircular;

public class main {

    public static void main(String[] args) {

        /*------------------ Recursividad ------------------*/
        //System.out.println(Recursion.factorial(5));
        
        //int arr[] = {12, 34, 64, 2, 3};
        //System.out.println(Recursion.encontrarMax(arr, 1, arr[0]));
        
        
        /*------------------ Stack/Pila ------------------*/
        //stack<Integer> Pila = new stack<>();
        //Pila.push(1);
        //Pila.push(2);
        //Pila.push(3);
        /*System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());*/
        
        //System.out.println(Pila.encuentra(7));
        //System.out.println(Pila.encuentra(2));
        
        /*------------------ Queue/Cola ------------------*/
        /*queue <Integer> Cola = new queue<>();
        
        Cola.enqueue(5);
        Cola.enqueue(4);
        Cola.enqueue(3);
        Cola.enqueue(2);
        
        System.out.println(Cola.dequeue());
        System.out.println(Cola.dequeue().getValue());*/
        
        /*queue <Integer> Cola2 = new queue<>();
        for (int i = 0; i <= 100; i++) {
            Cola2.enqueue(i);
        }
        
        System.out.println(Cola2.findByIndex(50).getValue());
        
        //Hacer cola nueva a partir de un valor
        int temp = Cola2.findByIndex(23).getValue();
        
        queue <Integer> Cola3 = new queue<>();
        Cola3.enqueue(temp);
        for (int i = 0; i <= 100; i++) {
            Cola3.enqueue(i);
        }
        
        System.out.println(Cola3.findByIndex(0).getValue());*/
        
        /*------------------ Listas ------------------*/
        /*------- Lista simple -------*/
        /*list listaS = new list();
        listaS.insertar(new Persona(1, "P"));
        listaS.insertar(new Persona(2, "P"));
        listaS.insertar(new Persona(3, "P"));
        listaS.insertar(new Persona(5, "P"));
        listaS.insertar(new Persona(4, "P"));
        listaS.eliminarPersona(7);
        listaS.eliminarPersona(3);
        listaS.eliminarPersona(3);
        listaS.imprimirLista();*/
        
        /*------- Lista circular -------*/
        /*listaCircular listaC = new listaCircular();
        listaC.insertar(new Persona(1, "P"));
        listaC.insertar(new Persona(2, "P"));
        listaC.insertar(new Persona(3, "P"));
        listaC.insertar(new Persona(5, "P"));
        listaC.insertar(new Persona(4, "P"));
        listaC.imprimirLista();*/
        
        /*------- Lista Doble Circular -------*/
        listaDobleCircular listaDC = new listaDobleCircular();
        listaDC.insertar(new Persona(1, "P"));
        listaDC.insertar(new Persona(5, "P"));
        listaDC.insertar(new Persona(3, "P"));
        listaDC.insertar(new Persona(4, "P"));
        listaDC.insertar(new Persona(2, "P"));
        listaDC.imprimirLista();
        
        /*listaDC.existe(5);
        listaDC.existe(6);
        listaDC.existe(1);
        
        listaDC.modifica(new Persona(4, "B"));
        listaDC.modifica(new Persona(1, "B"));
        listaDC.modifica(new Persona(6, "B"));
        listaDC.imprimirLista();*/
        
        /*listaDC.elimina(3);
        System.out.println("\n");
        listaDC.imprimirLista();*/
        
        System.out.println("\n");
        System.out.println( "Valor extraído: " + listaDC.extrae(3));
        listaDC.imprimirLista();
        
    }
}
