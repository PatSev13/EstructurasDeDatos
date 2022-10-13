package principal.Tareas.Tarea2;

public class node <T>{
    
    private T value;
    private int value2;
    private node<T> next;
    
    public node(){
        
    }
    
    public node(T value, int value2){
        this.value = value;
        this.value2 = value2;
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

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
       
}
