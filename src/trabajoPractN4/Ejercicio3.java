/*
 * Realizar el pseudocódigo y la implementación en java de un método de ordenación
 * para cada esquema algorítmico que se lista a continuación:
 *
 * 1) Fuerza bruta
 * 2) Disminuye y vencerás
 *
 * El algoritmo recibe un arreglo de números enteros y los ordena de menor a mayor
 * (orden creciente). Calcular el tiempo de ejecución de cada algoritmo.
 *
 * En cada método, ¿qué sentencias deben cambiar para ordenar el arreglo en orden decreciente?
 */
package trabajoPractN4;

import utiles.Ordenacion;

/**
 *
 * @author Flavia
 */
public class Ejercicio3 {
    /**
     * Visualiza por pantalla los elementos de un arreglo.
     *
     * @param a arreglo de ingreso
     */
    public static void mostrarArreglo(int[] a) {
        int i, longArreglo;

        longArreglo = a.length;
        for (i = 0; i < longArreglo; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {12, 3, 56, 1, 0, 34, 100, 83, 13, 65, 23, 53, 13};
        int[] b = {12, 3, 56, 1, 0, 34, 100, 83, 13, 65, 23, 53, 13};
        mostrarArreglo(a);
        Ordenacion.selectionSort(a);
        mostrarArreglo(a);

        System.out.println("================");

        mostrarArreglo(b);
        Ordenacion.insertionSort(b);
        mostrarArreglo(b);
    }
}
