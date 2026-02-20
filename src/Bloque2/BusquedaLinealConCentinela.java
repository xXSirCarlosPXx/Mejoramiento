package Bloque2;

import java.util.Arrays;

public class BusquedaLinealConCentinela {

    static void main() {
        int[] arreglo = { 4, 7, 2, 9, 7, 1, 5, 7, 3, 8, 7, 6, 10, 7, 2 };
        int objetivo = 7;

        IO.println("Arreglo: " + Arrays.toString(arreglo));

        int posicion = buscar(arreglo, objetivo);

        IO.println("Objetivo: " + objetivo);
        if (posicion != -1) IO.println("Ultima posicion: indice " + posicion);
        else IO.println("Elemento no encontrado");
    }

    static int buscar(int[] arreglo, int objetivo) {
        int guardado = arreglo[0];
        arreglo[0] = objetivo;

        int i = arreglo.length - 1;
        while (arreglo[i] != objetivo) i--;

        arreglo[0] = guardado;

        if (i > 0 || guardado == objetivo) return i;
        return -1;
    }
}
