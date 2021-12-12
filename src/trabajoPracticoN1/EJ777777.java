/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN1;

import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class EJ777777 {

    public static void main(String[] args) {
        String conjunto;
        char elemento;
        int seleccion;
        System.out.print("Ingrese elementos del conjunto: ");
        conjunto = TecladoIn.readLine();
        while (hayElementoRepetido(conjunto)) {
            System.out.println("Hay elementos repetidos en el conjunto.");
            System.out.print("Ingrese elementos del conjunto: ");
            conjunto = TecladoIn.readLine();
        }
        do {
            menu();
            seleccion = TecladoIn.readLineInt();
            switch (seleccion) {
                case 1:
                    System.out.println("Elementos del conjunto: ");
                    listar(conjunto);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ingrese elemento: ");
                    elemento = TecladoIn.readLineNonwhiteChar();
                    if (estaElElemento(elemento, conjunto)) {
                        System.out.println("El elemento " + elemento + " está presente en el conjunto");
                    } else {
                        System.out.println("Elemento " + elemento + " no está presente en el conjunto");
                    }
                    break;
                case 3:
                    System.out.println(ordenar(conjunto));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        } while (seleccion != 4);
    }

    public static void listar(String conjunto) {
        int longitud;
        longitud = conjunto.length();
        for (int i = 0; i < longitud; i++) {
            System.out.print(conjunto.charAt(i) + " ");
        }
    }

    public static boolean hayElementoRepetido(String texto) {
        int longitud;
        char letraInicial;
        boolean estaRepetido;
        longitud = texto.length();
        estaRepetido = false;
        for (int i = 0; i < longitud; i++) {
            letraInicial = texto.charAt(i);
            for (int j = i + 1; j < longitud; j++) {
                if (letraInicial == texto.charAt(j)) {
                    estaRepetido = true;
                }
            }
        }
        return estaRepetido;
    }

    public static void menu() {
        System.out.println("\n¿Qué operación desea realizar? Presione:");
        System.out.println("1 para listar los elementos del conjunto");
        System.out.println("2 para verificar la existencia de un elemnto");
        System.out.println("3 para ordenar los elementos");
        System.out.println("4 para terminar");
    }

    public static boolean estaElElemento(char elemento, String conjunto) {
        boolean hayCoincidencia;
        hayCoincidencia = false;
        for (int i = 0; i < conjunto.length(); i++) {
            if (conjunto.charAt(i) == elemento) {
                hayCoincidencia = true;
            }
        }
        return hayCoincidencia;
    }

    public static String ordenar(String conjunto) {
        String B;
        String menorElemento, siguienteElemento;
        B = "";
        while (!conjunto.equals("")) {
            menorElemento = conjunto.substring(0, 1);
// busco el menor elemento 
            for (int i = 1; i < conjunto.length(); i++) {
                siguienteElemento = conjunto.substring(i, i + 1);
                if (menorElemento.compareTo(siguienteElemento) > 0) {
                    menorElemento = conjunto.substring(i, i + 1);
                }
            }
// elimino el menor elemento del conjunto 
            conjunto = conjunto.replaceAll(menorElemento, "");
// inserto el elemento en el conjunto vacío 
            B += menorElemento;
        }
        return B;
    }

}
