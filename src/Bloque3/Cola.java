package Bloque3;

import java.util.ArrayList;

public class Colas {

    static void main() {
        Cola cola = new Cola();

        cola.enqueue(101);
        cola.enqueue(102);
        cola.enqueue(103);
        cola.mostrar();

        cola.dequeue();
        cola.dequeue();
        cola.mostrar();

        cola.dequeue();
        cola.dequeue();
        cola.mostrar();
    }

    private final ArrayList<Integer> lista = new ArrayList<>();
    
    public void enqueue(int valor) {
        lista.add(valor);
        IO.println("Estudiante " + valor + " encolado");
    }
    
    public void dequeue() {
        if (lista.isEmpty()) {
            IO.println("No hay estudiantes en la fila");
            return;
        }
        int atendido = lista.removeFirst();
        IO.println("Estudiante " + atendido + " atendido");
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }
    
    public void mostrar() {
        if (isEmpty()) { IO.println("Cola: [Vacia]"); return; }
        IO.print("Cola: [");
        for (int i = 0; i < lista.size(); i++) {
            IO.print(lista.get(i));
            if (i < lista.size() - 1) IO.print(", ");
        }
        IO.println("]");
    }
}
