package Bloque3;

import java.util.ArrayList;

public class Pilas {

    static void main() {
        Pila pila = new Pila();

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.mostrar();

        pila.pop();
        pila.pop();
        pila.mostrar();

        pila.pop();
        pila.pop();
        pila.mostrar();
    }

    private final ArrayList<Integer> lista = new ArrayList<>();

    void push(int valor) {
        lista.add(valor);
        IO.println("Plato " + valor + " apilado");
    }

    void pop() {
        if (isEmpty()) {
            IO.println("No hay platos en la pila");
            return;
        }
        int retirado = lista.removeLast();
        IO.println("Plato " + retirado + " retirado");
    }

    boolean isEmpty() {
        return lista.isEmpty();
    }

    void mostrar() {
        if (isEmpty()) { IO.println("Pila: [Vacia]"); return; }
        IO.print("Pila: [");
        for (int i = lista.size() - 1; i >= 0; i--) {
            IO.print(lista.get(i));
            if (i > 0) IO.print(", ");
        }
        IO.println("]");
    }
}
