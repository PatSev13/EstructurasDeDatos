package principal.TrabajoEnClase.Semana3;


public class node <T>{
    
    private T value;
    private node<T> next;
    
    public node(){
        
    }
    
    public node(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }
       
}
