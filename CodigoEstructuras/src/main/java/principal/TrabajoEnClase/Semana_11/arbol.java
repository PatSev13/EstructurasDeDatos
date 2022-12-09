package principal.TrabajoEnClase.Semana_11;

public class arbol {

    private nodoArbol raiz;
    private int altura;

    public void inserta(int value) {
        if (raiz == null) {
            raiz = new nodoArbol(value);
        } else {
            insertar(raiz, value);
        }
    }

    private void insertar(nodoArbol nodo, int value) {
        if (value <= nodo.getId()) {

            if (nodo.getIzq() == null) {
                nodo.setIzq(new nodoArbol(value));
            } else {
                insertar(nodo.getIzq(), value);
            }

        } else {

            if (nodo.getDer() == null) {
                nodo.setDer(new nodoArbol(value));
            } else {
                insertar(nodo.getDer(), value);
            }

        }
    }
    
    public void inOrden(){
        if (raiz != null){
            inOrdenRecorrer(raiz);
        } else {
            System.out.println("El árbol está vacío");
        }
    }
    
    private void inOrdenRecorrer(nodoArbol nodo){
        if (nodo != null){
            inOrdenRecorrer(nodo.getIzq());
            System.out.println(nodo.getId());
            inOrdenRecorrer(nodo.getDer());
        }
    }
    
    public void retornarAltura(nodoArbol nodo, int nivel){
        if (nodo != null) {
            retornarAltura(nodo.getIzq(), nivel + 1);
            if (nivel > altura){
                altura = nivel;
            }
            System.out.println("En este momento, gire a la derecha" + nodo.getId());
            retornarAltura(nodo.getDer(), nivel + 1);
        }
    }
    
    public int retornarAltura(){
        altura = 0;
        retornarAltura(raiz, 1);
        System.out.println(altura);
        return altura;
    }
}
