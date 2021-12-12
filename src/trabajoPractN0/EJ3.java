/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN0;

import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class EJ3 {

    public static void main(String[] args) {
        //Este modulo calcula el promedio de n numeros enteros ingresados por el usuario
        int cont = 0, acum = 0, x = 0;
        char fin = 'n';
        while (fin == 'n') {
            System.out.println("Ingrese un nuemero");
            x = TecladoIn.readLineInt();
            acum += x;
            cont++;
            System.out.println("Desea terminar? s/n");
            fin = TecladoIn.readLineNonwhiteChar();
        }
        System.out.print("El promedio de los " + cont + " valores enteros ingresados es: " + promedio(acum, cont));

    }

    public static double promedio(double dividendo, double divisor) {
        /**
         * Este metodo realiza la division de los valores ingresados como
         * parametros y obtiene un promedio dividendo: es la suma de los valores
         * ingresados por el usuario divisor: es la cantidad de valores
         * ingresados por el usuario
         */
        return (dividendo / divisor);
    }
}

