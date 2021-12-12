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
public class EJ91 {

    public static void main(String[] args) {
        String cadena, cadenaAux = "";
        int inicio = 0, espacio, fin, longAux = 0, valor = 0;
        boolean terminar = true;
        System.out.println("Ingrese la frase:");
        cadena = TecladoIn.readLine();
        fin = cadena.length();
        System.out.println("fin=" + fin);
        cadena = cadena + " ";
        System.out.println("cadena: " + cadena + "A");
        espacio = cadena.indexOf(" ");
        System.out.println("espacio=" + espacio);
        while (espacio <= fin && terminar) {
            cadenaAux = cadena.substring(inicio, espacio);
            longAux = cadenaAux.length();
            System.out.println("cadenaAux=" + cadenaAux + " longAux=" + longAux);

            if (espacio == fin) {
                terminar = false;
            }

            while (longAux >= valor && terminar) {
                inicio = espacio + 1;
                espacio = cadena.indexOf(" ", inicio);
                valor = espacio - inicio;
                System.out.println("inicio=" + inicio + " espacio=" + espacio + " longAux=" + longAux + " valor=" + valor);
                if (espacio == fin) {
                    terminar = false;
                }
            }

        }
        if (valor>longAux) {
            cadenaAux = cadena.substring(inicio, espacio);
            longAux = cadenaAux.length();
        }
        System.out.println("la palabra es " + cadenaAux + " con una longitud de " + longAux+" letras");

    }
}
