package Bloque2;

import java.util.Arrays;

public class BusquedaBinariaRecursiva {

    static void main() {
        int[] arreglo = { 2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91, 100, 110, 130, 150 };
        int objetivo = 45;

        IO.println("Arreglo: " + Arrays.toString(arreglo));

        int resultado = busqueda(arreglo, 0, arreglo.length - 1, objetivo);

        IO.println("Objetivo: " + objetivo);
        if (resultado != -1) IO.println("Encontrado en el indice: " + resultado);
        else IO.println("Elemento no encontrado");
    }

    static int busqueda(int[] arreglo, int inicio, int fin, int objetivo) {
        if (inicio > fin) return -1;

        int mid = inicio + (fin - inicio) / 2;

        if (arreglo[mid] == objetivo) return mid;
        else if (arreglo[mid] > objetivo) return busqueda(arreglo, inicio, mid - 1, objetivo);
        else return busqueda(arreglo, mid + 1, fin, objetivo);
    }
}
