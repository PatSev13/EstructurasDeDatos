package principal.Tareas.Tarea1;

/**
 *
 * @author Saryf
 */
public class Ejercicio1 {
    
    public static int NumeroInvertido(int num, int p){
        
        if(num < 10){
            return num;
            
        }else{
            return(num % 10) * (int) Math.pow(10, p) + (NumeroInvertido(num/10, p-1));
        }
    }
    
}
