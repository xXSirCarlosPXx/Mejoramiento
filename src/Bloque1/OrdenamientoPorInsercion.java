package Bloque1;

import java.util.Arrays;

public class OrdenamientoPorInsercion {

    static void main() {
        char[] arreglo = { 'k', 'b', 'f', 'a', 'd', 'j', 'c', 'h', 'e', 'g' };

        IO.println("Arreglo sin ordenar: " + Arrays.toString(arreglo));
        insercion(arreglo);
        IO.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }

    static void insercion(char[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            char clave = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }
    }
}
