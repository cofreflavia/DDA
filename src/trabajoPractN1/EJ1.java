/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN1;

import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class EJ1 {

    public static void main(String[] args) {
        int opcion, longitud=0;
        boolean es;
        char caracter;
        char[] letra = new char[10];
        System.out.print("Ingrese unicamente letras y para terminar ingrese 0 (cero)\nIngrese:");
        caracter = TecladoIn.readLineNonwhiteChar();
        while (longitud < 30 && caracter != '0') {
            es = esLetra(caracter);
            if (es == false) {
                System.out.print("El caracter no es una letra--Vuelva a ingresar:");
                longitud--;
            } else {
                letra[longitud] = caracter;
                System.out.print("Ingrese:");

            }
            caracter= TecladoIn.readLineNonwhiteChar();
            longitud++;
        }
        
        do {
            System.out.println("MENU\n1 Mostrar las letras ubicadas en las posiciones pares\n2 Mostrar el arreglo de las letras de manera inversa a como fueron ingresados\n3 Mostrar cuantas veces aparece una letra en el arreglo");
            opcion = TecladoIn.readLineInt();
            switch (opcion) {
                case 1:
                    mostrarPares(letra, longitud);
                    break;
                case 2:
                    mostrarInverso(letra, longitud);
                    break;
                case 3:
                    buscarLetra(letra, longitud);
                    break;
                default:
                    break;

            }
            System.out.println("\n------\n1 Menu\n2 fin");
            opcion = TecladoIn.readLineInt();
        } while (opcion == 1);

    }

    public static boolean esLetra(char l) {
        boolean esLetra;
        esLetra = (l == 'q' || l == 'w' || l == 'e' || l == 'r' || l == 't' || l == 'y' || l == 'u'
                || l == 'i' || l == 'o' || l == 'p' || l == 'a' || l == 's' || l == 'd' || l == 'f'
                || l == 'g' || l == 'h' || l == 'j' || l == 'k' || l == 'l' || l == 'ñ'
                || l == 'z' || l == 'x' || l == 'c' || l == 'v' || l == 'b' || l == 'n' || l == 'm');
        return (esLetra);
    }

    public static void mostrarPares(char[] le, int lon) {

        for (int j = 0; j < lon; j++) {
            if (j % 2 == 0) {
                System.out.print(le[j] + "-");
            }
        }
    }

    public static void mostrarInverso(char[] le, int lon) {
        for (int j = lon - 1; j >= 0; j--) {
            System.out.print(le[j] + "-");
        }
    }

    public static void buscarLetra(char[] le, int lon) {
        char l;
        int contador = 0;
        System.out.println("Ingrese la letra a buscar:");
        l = TecladoIn.readLineNonwhiteChar();
        for (int j = 0; j < lon; j++) {
            if (le[j] == l) {
                contador++;
            }
        }
        System.out.print("se encontró " + contador + " veces");
    }
}
