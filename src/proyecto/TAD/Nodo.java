
package proyecto.TAD;

public class Nodo<T> {
    T dato;          // Valor genérico del nodo
    Nodo<T> siguiente;  // Apuntador al siguiente nodo
    
    public Nodo(){
        siguiente=null;
    }
    
    public Nodo(T dato){
        siguiente=null;
        this.dato = dato;
    }
    
    public Nodo(T dato, Nodo siguiente){
        this.siguiente=siguiente;
        this.dato = dato;
    }
    
    
    public T getDato() {
        return dato;
    }
    
    public void setDato(T dato) {
        this.dato = dato;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
