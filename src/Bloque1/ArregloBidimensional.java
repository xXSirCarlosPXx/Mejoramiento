package Bloque1;

public class ArregloBidimensional {

    static void main() {
        int[][] arreglo = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        IO.println("La suma de la diagonal principal es: " + suma(arreglo));
    }

    static int suma(int[][] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i][i];
        }
        return suma;
    }
}
