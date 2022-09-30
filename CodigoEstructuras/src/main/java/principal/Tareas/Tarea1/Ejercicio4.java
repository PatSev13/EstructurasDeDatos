package principal.Tareas.Tarea1;

/**
 *
 * @author Patrick
 */

public class Ejercicio4 {

    //Los parámetros son la referencia de la posición en el arreglo, el arreglo de números a sumar
    // y el valor propiamente de la suma de los números, respectivamente
    public static String sumaN(int indice, int[] numeros, int suma) {
        System.out.println("Suma: " + suma);
        if (indice != numeros.length) {
            suma += numeros[indice];
            sumaN(indice + 1, numeros, suma);
        }

        return "\nLa suma ha acabado";

    }
}
