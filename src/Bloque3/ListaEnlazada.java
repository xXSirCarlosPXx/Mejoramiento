package Bloque3;

public class ListaEnlazadas {

    static void main() {
        ListaEnlazada lista = new ListaEnlazada();

        lista.mostrar();
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);
        lista.insertarAlInicio(40);
        lista.mostrar();

        lista.revertirLista();
        lista.mostrar();
    }

    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;
    
    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        IO.println("Insertado al inicio: " + dato);
    }
    
    public void revertirLista() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente;

        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        cabeza = anterior;
        IO.println("Lista revertida");
    }
    
    public void mostrar() {
        if (cabeza == null) { IO.println("Lista: [Vacia]"); return; }
        IO.print("Lista: [");
        Nodo actual = cabeza;
        while (actual != null) {
            IO.print(actual.dato);
            if (actual.siguiente != null) IO.print(", ");
            actual = actual.siguiente;
        }
        IO.println("]");
    }
}
