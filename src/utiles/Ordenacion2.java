/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

/**
 *
 * @author Flavia
 */
public class Ordenacion2 {

    public static void mergeSort(int array[]) {
        int[] tmp = new int[array.length];
        mergeSort(array, tmp, 0, array.length - 1);
    }

    private static void mergeSort(int[] a, int[] tmp, int left, int right) {
        if (left < right) {
            int centre = (left + right) / 2;
            mergeSort(a, tmp, left, centre);
            mergeSort(a, tmp, centre + 1, right);
            merge(a, tmp, left, centre + 1, right);
        }
    }

    private static void merge(int[] a, int[] tmp, int left, int right, int rend) {
        int lend = right - 1;
        int tpos = left;
        int lbeg = left;

        while (left <= lend && right <= rend) {
            if (a[left] < a[right]) {
                tmp[tpos++] = a[left++];
            } else {
                tmp[tpos++] = a[right++];
            }
        }
        while (left <= lend) {
            tmp[tpos++] = a[left++];
        }
        while (right <= rend) {
            tmp[tpos++] = a[right++];
        }
        for (tpos = lbeg; tpos <= rend; tpos++) {
            a[tpos] = tmp[tpos];
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {38,27,43,3,9,82,10};
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        heapSort(arreglo);
        System.out.println("");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
    public static void quickSort(int[] arreglo) {
        quickSort(arreglo, 0, arreglo.length-1);
    }
    private static void quickSort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = A[i];                  // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
       
        if (izq < j - 1) {
            quickSort(A, izq, j - 1); // ordenamos subarray izquierdo
        }
        
        if (j + 1 < der) {
            quickSort(A, j + 1, der); // ordenamos subarray derecho
        }
    }

    
    
    public static void heapSort(int[] a) {
        int tmp;
        int posFin;
        int n= a.length;
        armarHeapMaximo(a, n);

        posFin = n - 1;
        while (posFin > 0) {
            tmp = a[posFin];
            a[posFin] = a[0];
            a[0] = tmp;
            siftDown(a, 0, posFin - 1);
            posFin--;
        }
    }
    
     private static void armarHeapMaximo(int[] a, int longitud) {
        int inicio;

        inicio = (longitud - 2) / 2;

        while (inicio >= 0) {
            siftDown(a, inicio, longitud - 1);
            inicio--;
        }
    }
    
     private static void siftDown(int[] a, int posIni, int posFin) {
        int tmp;
        int raiz, hijo;
        boolean intercambiar;

        raiz = posIni;
        intercambiar = true;

        while ((raiz * 2 + 1) <= posFin && intercambiar) {
            hijo = raiz * 2 + 1;

            if (hijo + 1 <= posFin && a[hijo] < a[hijo + 1] ) {
                hijo = hijo + 1;
            }

            if (a[raiz]< a[hijo]) {
                tmp = a[raiz];
                a[raiz] = a[hijo];
                a[hijo] = tmp;
                raiz = hijo;
            } else {
                intercambiar = false;
            }
        }
    }
}
