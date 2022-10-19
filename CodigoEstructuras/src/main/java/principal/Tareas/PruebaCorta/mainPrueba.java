package principal.Tareas.PruebaCorta;

/**
 *
 * @author Patrick
 */

public class mainPrueba {

    public static void main(String[] args) {

        TomarOrden tomaOrden = new TomarOrden();
        
        tomaOrden.setTitle("Ingreso de ordenes");
        
        //Permite centrar el formulario en pantalla
        tomaOrden.setLocationRelativeTo(null);
        
        //Mostrar el formulario en pantalla
        tomaOrden.setVisible(true);
        
    }

}
