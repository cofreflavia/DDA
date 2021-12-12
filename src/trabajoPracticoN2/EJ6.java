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
public class EJ6 {

    public static void main(String[] args) {
        //Este metodo sirve para invocar el modulo y pasarle un arreglo
        int[] entero = {5, 12, 9, 34, 8};
        selectionSort(entero);
        for (int k = 0; k < entero.length; k++) {
            System.out.print(entero[k] + " ");
        }
    }

    public static void selectionSort(int[] a) {
        /**
         *
         */
        int min, guardar;
        for (int i = 0; i < a.length - 1; i++) {
            min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            guardar = a[min];
            a[min] = a[i];
            a[i] = guardar;
        }

    }

}
