package principal.Tareas.Tarea1;

/**
 *
 * @author Patrick
 */

public class Ejercicio5 {

    //Los parámetros corresponden a los valores iniciales y finales de las partes de la multiplicación, o sea,
    //cuál será la primera y la última tabla y cuál será el primer y último valor de multiplicador
    public static void tablasMulti(int inicioMultiplicando, int inicioMultiplicador, int limiteMultiplicador, int limiteMultiplicando) {

        if (inicioMultiplicador <= limiteMultiplicador) {
            System.out.println(inicioMultiplicando + "x" + inicioMultiplicador + "=" + inicioMultiplicando * inicioMultiplicador);
            tablasMulti(inicioMultiplicando, inicioMultiplicador + 1, limiteMultiplicador, limiteMultiplicando);
        }
        if (inicioMultiplicador == limiteMultiplicador) {
            System.out.println("Tabla: " + inicioMultiplicando + "\n" + "------------\n");
        }
        if (inicioMultiplicador == limiteMultiplicador && inicioMultiplicando < limiteMultiplicando) {
            tablasMulti(inicioMultiplicando + 1, limiteMultiplicando - (limiteMultiplicando - 1), limiteMultiplicador, limiteMultiplicando);
        }

    }
}
