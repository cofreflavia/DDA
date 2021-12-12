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
public class EJ2 {

    public static void main(String[] args) {
        int nro, longitud = 0, opcion;
        double primer, segundo;
        char fin;
        int[] numero = new int[30];
        System.out.println("Arreglo de Numeros Enteros.");
        do {
            System.out.print("Ingrese:");
            nro = TecladoIn.readLineInt();
            numero[longitud] = nro;
            longitud++;
            System.out.print("Continuar? S/N ----->");
            fin = TecladoIn.readLineNonwhiteChar();
        } while (longitud < 30 && fin == 'S');

        do {
            System.out.println("MENU\n1 Mostrar cuantos numeros pares se ingresaron\n2 Suma de los numeros enteros ingresados\n3 Buscar un numero en el arreglo\n4 Menor numero ingresado\nIngrese:");
            opcion = TecladoIn.readLineInt();
            switch (opcion) {
                case 1:
                    System.out.print("Existen " + contarNrosPares(numero, longitud) + " numeros pares");
                    break;
                case 2:
                    System.out.print("la suma de los numeros del arreglos es de: " + sumatoria(numero, longitud));
                    break;
                case 3:
                    System.out.print("Ingrese el numero que desea encontrar: ");
                    nro = TecladoIn.readLineInt();
                    System.out.print("El numero se encuentra " + buscarNro(numero, longitud, nro) + " veces en el arreglo");
                    break;
                case 4:
                    System.out.print("El menor numero del arreglo es: " + posicionMenorNro(numero, longitud));
                    break;
                case 5:
                    if (longitud % 2 == 0) {
                        nro = longitud / 2;
                        System.out.println("" + nro + longitud);
                        primer = promedio(numero, 0, nro, nro);
                        segundo = promedio(numero, nro, longitud, nro);
                        System.out.println("Primer mitad, promedio=" + primer);
                        System.out.println("Segunda mitad, promedio=" + segundo);
                        if (primer >= segundo) {
                            if (primer > segundo) {
                                System.out.println("El promedio de la primer mitad es mayor que la segunda ");
                            } else {
                                System.out.println("Los promedios de ambas mitades son iguales");
                            }
                        } else {
                            System.out.println("El promedio de la segunda mitad es mayor que la primer mmitad");
                        }

                    } else {
                        System.out.println("Ingresó un arreglo con una cantidad impar de numeros");
                    }
                default:
                    ;
                    break;

            }
            System.out.println("\n------\n1 Menu\n2 fin");
            opcion = TecladoIn.readLineInt();
        } while (opcion
                == 1);

    }

    public static int contarNrosPares(int[] num, int lon) {
        int contador = 0;
        for (int i = 0; i < lon; i++) {
            if (num[i] % 2 == 0) {
                contador++;
            }
        }
        return (contador);

    }

    public static int sumatoria(int[] num, int lon) {
        int suma = 0;
        for (int i = 0; i < lon; i++) {
            suma += num[i];

        }
        return (suma);
    }

    public static int buscarNro(int[] num, int lon, int x) {
        int contador = 0;
        for (int i = 0; i < lon; i++) {
            if (num[i] == x) {
                contador++;
            }
        }
        return (contador);
    }

    public static int posicionMenorNro(int[] num, int lon) {
        int posicion = 0, menor = num[0];
        for (int i = 1; i < lon; i++) {
            if (num[i] < menor) {
                menor = num[i];
                posicion = i;
            }
        }
        return (posicion);
    }

    public static double promedio(int[] num, int inicio, int fin, int divisor) {
        int suma = 0;
        for (int i = inicio; i < fin; i++) {
            suma += num[i];
        }
        return (suma / divisor);
    }
}
