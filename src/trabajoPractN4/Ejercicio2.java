/*
 * Realizar el pseudocódigo y la implementación Java de un método que reciba
 * un arreglo ordenado (en forma creciente) de números enteros y un valor n,
 * y verifique si n está en el arreglo, utilizando los métodos de búsqueda:
 * - Secuencial
 * - Búsqueda binaria
 *
 * Indicar la técnica algorítmica utilizada. Calcular el tiempo de ejecución de
 * cada algoritmo.
 */
package trabajoPractN4;

import utiles.Busqueda;

/**
 *
 * @author Flavia
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arregloA = {44, 1, 35, 2, 0, 16, 25, 77, 9, 3};
        int[] arregloB = {0, 1, 2, 3, 9, 16, 25, 35, 44, 77};
        System.out.println("Posición del elemento: " + Busqueda.busquedaSecuencial(arregloA, 3));
        System.out.println("Posición del elemento: " + Busqueda.busquedaBinaria(arregloB,35));

    }
}
