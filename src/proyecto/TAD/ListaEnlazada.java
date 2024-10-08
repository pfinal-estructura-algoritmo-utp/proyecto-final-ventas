
package proyecto.TAD;

public class ListaEnlazada<T> {
    private Nodo<T> cabeza;  // El primer nodo de la lista

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método para insertar un nodo al inicio de la lista
    public void insertarAlInicio(T data) {
        Nodo<T> nuevoNodo = new Nodo<>(data);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    // Método para insertar un nodo al final de la lista
    public void insertarAlFinal(T data) {
        Nodo<T> nuevoNodo = new Nodo<>(data);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para eliminar el primer nodo de la lista
    public void eliminarPrimero() {
        if (!estaVacia()) {
            cabeza = cabeza.siguiente;
        } else {
            System.out.println("La lista está vacía, no se puede eliminar.");
        }
    }

    // Método para eliminar el último nodo de la lista
    public void eliminarUltimo() {
        if (!estaVacia()) {
            if (cabeza.siguiente == null) { // Si solo hay un elemento
                cabeza = null;
            } else {
                Nodo<T> actual = cabeza;
                while (actual.siguiente.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = null;
            }
        } else {
            System.out.println("La lista está vacía, no se puede eliminar.");
        }
    }
    
    public Nodo<T> obtenerValor(){
        return this.cabeza;
    }

    // Método para mostrar los elementos de la lista
//    public void mostrar() {
//        if (estaVacia()) {
//            System.out.println("La lista está vacía.");
//        } else {
//            Nodo<T> actual = cabeza;
//            while (actual != null) {
//                System.out.print(actual.dato + " -> ");
//                actual = actual.siguiente;
//            }
//            System.out.println("null");
//        }
//    }
}