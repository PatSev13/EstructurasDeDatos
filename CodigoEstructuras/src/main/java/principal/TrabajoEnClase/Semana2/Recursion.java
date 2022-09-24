package principal.TrabajoEnClase.Semana2;

public class Recursion {

    //static int arr[] = {12, 34, 64, 2, 3};

    /*El método recursivo tiene que tener una condición de parada
    y una llamada así mismo*/
    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            System.out.println(n);
            return n * factorial(n - 1);

        }
    }

    //(arr, 0, 0)
    public static int encontrarMax(int[] numeros, int indice, int max) {

        if (indice != numeros.length) {
            
            if (max < numeros[indice]) {
                System.out.println("\nMax: " + max);
                System.out.println("Indice #" + indice + ": " + numeros[indice]);
                max = encontrarMax(numeros, indice+1, numeros[indice]);
            } else {
                System.out.println("\nMax: " + max);
                System.out.println("Indice #" + indice + ": " + numeros[indice]);
                max = encontrarMax(numeros, indice+1, max);
            }

        }

        return max;

    }

}
