/*
 * Librería para los algoritmos de ordenación vistos.
 */
package utiles;

/**
 *
 * @author Flavia
 */
public class Ordenacion {
    /**
     * Implementacion del algoritmo de ordenamiento por selección.
     * 
     * @param a arreglo de enteros desordenado
     */
    public static void selectionSort(int[] a) {
        int i, j, min, tmp, longArreglo;
        longArreglo=a.length;
        for (i = 0; i < longArreglo-1; i++) {
            min = i;
            
            for (j = i+1; j < longArreglo; j++) {
                if (a[j] < a[min]) {// usar ">" para orden decreciente
                    min = j;
                }
            }
            
            tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }
    }
    
    /**
     * Implementacion del algoritmo de ordenamiento burbuja.
     * 
     * @param a arreglo de números desordenados
     */
    public static void bubbleSort(int[] a) {
        int i, j, tmp;
        
        for (i = 0; i < a.length-1; i++) {
            for (j = 0; j < a.length-1-i; j++) {
                if (a[j+1] < a[j]) {
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }
    
    /**
     * Implementacion del algoritmo de ordenamiento por inserción.
     * 
     * @param a arreglo de números desordenados
     */
    public static void insertionSort(int[] a) {
        int p, j, tmp;
        
        for (p = 1; p < a.length; p++) {
            tmp = a[p];
            j = p;
            
            while (j > 0 && tmp < a[j-1]) {// usar ">" para orden decreciente
                a[j] = a[j-1];
                j = j-1;
            }
            
            a[j] = tmp;
        }
    }
}