package principal.Tareas.Tarea1;

/**
 *
 * @author Saryf
 */
public class Ejercicio2 {
    
    public static String PalabraInvertida(String palabra, int tam){
        
        if(tam==0){
            return palabra.charAt(tam)+"";
    
        }else{
            return palabra.charAt(tam)+ (PalabraInvertida(palabra, tam-1));
        }
    }
    
}
