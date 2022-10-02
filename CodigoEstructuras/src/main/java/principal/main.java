package principal;

import principal.TrabajoEnClase.Semana2.Recursion;
import principal.TrabajoEnClase.Semana3.stack;

public class main {

    public static void main(String[] args) {

        /*------------------ Recursividad ------------------*/
        //System.out.println(Recursion.factorial(5));
        
        //int arr[] = {12, 34, 64, 2, 3};
        //System.out.println(Recursion.encontrarMax(arr, 1, arr[0]));
        
        
        /*------------------ Stack/Pila ------------------*/
        stack<Integer> Pila = new stack<>();
        Pila.push(1);
        Pila.push(2);
        Pila.push(3);
        /*System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());*/
        
        System.out.println(Pila.encuentra(7));
        System.out.println(Pila.encuentra(2));
    }
}
