package principal;

import principal.TrabajoEnClase.Semana2.Recursion;
import principal.TrabajoEnClase.Semana3.stack;
import principal.TrabajoEnClase.Semana4.queue;

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
        
        queue <Integer> Cola2 = new queue<>();
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
        
        System.out.println(Cola3.findByIndex(0).getValue());
        
    }
}
