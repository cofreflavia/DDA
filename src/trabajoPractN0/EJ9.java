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
public class EJ9 {

    public static void main(String[] args) {
        //Este metodo
        String cadena = "la palabra", letra = "la letra";
        cadena = escribir(cadena);
        letra = escribir(letra);
        System.out.println("La letra -" + letra + "- aparece " + contador(cadena, letra) + " veces en la palabra -" + cadena + "-");

    }

    public static String escribir(String string) {
        do {
            System.out.println("Ingrese " + string);
            string = TecladoIn.readLine();
        } while (string.equals(""));
        return (string);
    }

    public static int contador(String cad, String let) {
        int x, j = 0, contador = 0;
        while (j < cad.length()) {
            x = cad.indexOf(let, j);
            if (x == -1) {
                j = cad.length() + 1;
            } else {
                contador++;
                j = x + 1;
            }
        }
        return (contador);
    }
}
