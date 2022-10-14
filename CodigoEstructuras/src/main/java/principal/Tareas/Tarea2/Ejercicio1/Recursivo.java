package principal.Tareas.Tarea2.Ejercicio1;

/**
 *
 * @author javie
 */
public class Recursivo {
    
    public double calccos(int x, int n){
        if(n==0){
            return x;
        }else{
            return Math.pow(-1, n)*Math.pow(x, 2*n)/factorial(2*n) + calccos(x, n-1);
        }
    }
    
public int factorial(int n) {
if (n==0) {
return 1;
} else {
return n* factorial (n-1);
}
}
    
}
