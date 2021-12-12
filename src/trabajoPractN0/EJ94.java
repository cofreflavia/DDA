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
public class EJ94 {

    public static void main(String[] args) {
        String cadena;
        int primero = 0, ultimo;
        char inicio, fin;
        boolean valorVerd = false;
        System.out.println("Ingrese el numero: ");
        cadena = TecladoIn.readLine();
        ultimo = cadena.length() - 1;
        inicio = cadena.charAt(primero);

        fin = cadena.charAt(ultimo);

        while (inicio == fin && primero >= ultimo) {
            primero++;
            ultimo--;
            inicio = cadena.charAt(primero);
            fin = cadena.charAt(ultimo);
            valorVerd = inicio == fin;
        }
        System.out.println("gg"+valorVerd);

    }
}
