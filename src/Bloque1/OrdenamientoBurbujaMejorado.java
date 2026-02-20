package Bloque1;

import java.util.Arrays;

public class OrdenamientoBurbujaMejorado {

    static void main() {
        int[] arreglo = {9, 5, 7, 6, 3, 1, 2, 4, 8};

        IO.println("Arreglo sin ordenar: " + Arrays.toString(arreglo));
        burbuja(arreglo);
        IO.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }

    static void burbuja(int[] arreglo) {
        boolean intercambio;

        for (int i = 0; i < arreglo.length - 1; i++) {
            intercambio = false;

            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                }
            }

            if (!intercambio) break;
        }
    }
}
