/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN2;

/**
 *
 * @author Flavia
 */
public class E12 {

    public static void main(String[] args) {
        int[] a = {5, 12, 9, 34, 8};
        int[] b = {5, 12, 9, 34, 8};
        System.out.println("el arreglo es {5,12,9,34,8}\ny ahora es:");
        bubbleSort(a);
        System.out.print("con bubbleSort ");
        escribir(a);
        insertionSort(b);
        System.out.print("\ncon insertionSort ");
        escribir(b);

    }

    public static void escribir(int[] arreglo) {
        System.out.print("{");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.print("}");
    }

    public static void insertionSort(int[] a) {
        int j = 0, temp = 0;
        int p;
        for (p = 0; p < a.length; p++) {
            temp = a[p];
            j = p;
            while (j > 0 && temp < a[j - 1]) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }

    }

    public static void bubbleSort(int[] a) {
        int guardar;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] < a[j]) {
                    guardar = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = guardar;
                }

            }
        }

    }

}
