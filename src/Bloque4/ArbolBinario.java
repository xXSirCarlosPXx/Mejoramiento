package Bloque4;

public class ArbolBinario {

    static void main() {
        ArbolBinario arbol = new ArbolBinario();

        int[] valores = {50, 30, 70, 20, 40, 60, 80, 10};
        for (int v : valores) arbol.insertar(v);

        IO.println("Altura del árbol : " + arbol.obtenerAltura());

        IO.println("Nivel de 50 : " + arbol.buscarNodo(50));
        IO.println("Nivel de 30 : " + arbol.buscarNodo(30));
        IO.println("Nivel de 10 : " + arbol.buscarNodo(10));
        IO.println("Nivel de 99 : " + arbol.buscarNodo(99));
    }

    static class Nodo {
        int dato;
        Nodo izquierdo, derecho;
        Nodo(int dato) { this.dato = dato; }
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
    
    public int obtenerAltura() {
        return alturaRec(raiz);
    }

    private int alturaRec(Nodo nodo) {
        if (nodo == null) return 0;
        return Math.max(alturaRec(nodo.izquierdo), alturaRec(nodo.derecho)) + 1;
    }
    
    public int buscarNodo(int dato) {
        int nivel = buscarNivelRec(raiz, dato, 1);
        if (nivel == -1)
            IO.println("El valor " + dato + " no existe en el árbol.");
        return nivel;
    }

    private int buscarNivelRec(Nodo nodo, int dato, int nivel) {
        if (nodo == null) return -1;
        if (nodo.dato == dato) return nivel;
        if (dato < nodo.dato)
            return buscarNivelRec(nodo.izquierdo, dato, nivel + 1);
        else
            return buscarNivelRec(nodo.derecho, dato, nivel + 1);
    }
}
