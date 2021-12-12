/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN2;

import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class EJ9 {

    public static void main(String[] args) {
        int opcion;
        System.out.println("Sobre que arreglo desea encontrar el 34, seleccione la opcion ");
        do {
            System.out.println("1) para  {5,8,9,12,34}\n2) para  {5,8,9,34}");
            opcion=TecladoIn.readLineInt();
        } while (opcion!=1&&opcion!=2); 
        menu(opcion);   
    }
    public static void menu(int opcion) {
        int[]arreglo = {5,8,9,12,34};
        int[]arreglo1={5,8,9,34};
        switch(opcion){
            case 1: System.out.println("El 34 se encuentra en la posicion "+binarySearch(arreglo,34)+" del arreglo");break;
            case 2: System.out.println("El 34 se encuentra en la posicion "+binarySearch(arreglo1,34)+" del arreglo");break;
        }
        
    }

    public static int binarySearch(int[] a, int k) {
        int l, m, r, resultado;

        l = 0;
        r = a.length - 1;
        m = (l+r)/2;
        resultado = -1;
        while (l <= r && k != a[m]) {
            m = (l + r) / 2;

            if (k == a[m]) {
                resultado = m;
            } else {
                if (k < a[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }

        return resultado;
    }
}


