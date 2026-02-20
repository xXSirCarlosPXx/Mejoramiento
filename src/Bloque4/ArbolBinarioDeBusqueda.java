package Bloque4;

public class ArbolBinarioDeBusqueda {

    static void main() {
        ArbolBinarioDeBusqueda arbol = new ArbolBinarioDeBusqueda();

        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int v : valores) arbol.insertar(v);

        IO.print("Pre-orden  (raíz→izq→der): ");
        arbol.preOrden();

        IO.print("In-orden   (izq→raíz→der): ");
        arbol.inOrden();

        IO.print("Post-orden (izq→der→raíz): ");
        arbol.postOrden();
    }

    static class Nodo {
        int dato;
        Nodo izquierdo, derecho;

        Nodo(int dato) {
            this.dato = dato;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    private Nodo raiz;

    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    private Nodo insertarRec(Nodo nodo, int dato) {
        if (nodo == null) return new Nodo(dato);
        if (dato < nodo.dato)
            nodo.izquierdo = insertarRec(nodo.izquierdo, dato);
        else if (dato > nodo.dato)
            nodo.derecho = insertarRec(nodo.derecho, dato);
        return nodo;
    }
    
    public void preOrden()  { preOrdenRec(raiz);  IO.println(); }
    public void inOrden()   { inOrdenRec(raiz);   IO.println(); }
    public void postOrden() { postOrdenRec(raiz); IO.println(); }

    private void preOrdenRec(Nodo nodo) {
        if (nodo == null) return;
        IO.print(nodo.dato + " ");
        preOrdenRec(nodo.izquierdo);
        preOrdenRec(nodo.derecho);
    }

    private void inOrdenRec(Nodo nodo) {
        if (nodo == null) return;
        inOrdenRec(nodo.izquierdo);
        IO.print(nodo.dato + " ");
        inOrdenRec(nodo.derecho);
    }

    private void postOrdenRec(Nodo nodo) {
        if (nodo == null) return;
        postOrdenRec(nodo.izquierdo);
        postOrdenRec(nodo.derecho);
        IO.print(nodo.dato + " ");
    }
}
