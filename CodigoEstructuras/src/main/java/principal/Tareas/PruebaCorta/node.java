package principal.Tareas.PruebaCorta;

/**
 *
 * @author Patrick
 */

public class node <T>{
    
    private String nombreCliente;
    private T cedulaCliente;
    private String producto;
    private int total;
    private boolean discapacitado;
    private node<T> next;
    
    public node(){
        
    }
    
    public node(String value, T value2, String value3, int value4, boolean value5){
        this.nombreCliente = value;
        this.cedulaCliente = value2;
        this.producto = value3;
        this.total = value4;
        this.discapacitado = value5;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }

    public T getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(T cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isDiscapacitado() {
        return discapacitado;
    }

    public void setDiscapacitado(boolean discapacitado) {
        this.discapacitado = discapacitado;
    }
       
}
