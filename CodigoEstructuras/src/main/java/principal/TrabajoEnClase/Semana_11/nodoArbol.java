package principal.TrabajoEnClase.Semana_11;

public class nodoArbol {
    private int id;
    private nodoArbol izq;
    private nodoArbol der;

    public nodoArbol(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public nodoArbol getIzq() {
        return izq;
    }

    public void setIzq(nodoArbol izq) {
        this.izq = izq;
    }

    public nodoArbol getDer() {
        return der;
    }

    public void setDer(nodoArbol der) {
        this.der = der;
    }
    
    
}
