package Bloque1;

import java.util.Arrays;

public class OrdenamientoPorSeleccion {

    static void main() {
        int[] arreglo = {9, 5, 7, 6, 3, 1, 2, 4, 8};

        IO.println("Arreglo sin ordenar: " + Arrays.toString(arreglo));
        seleccion(arreglo);
        IO.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }

    static void seleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;

                IO.print("Intercambio en i=" + i + ": ");
                IO.println(Arrays.toString(arreglo));
            }
        }
    }
}
