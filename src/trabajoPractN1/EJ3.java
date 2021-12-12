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
public class EJ3 {
    
    public static void main(String[] args) {
        int espacio, inicio = 0, posicion = 0, longitud;
        String frase, palabra;
        String[] arregloPalabra = new String[30];
        System.out.println("Ingrese el texto:");
        frase = TecladoIn.readLine();
        frase = frase + " ";
        longitud = frase.length();
        
        while (inicio != longitud) {
            espacio = frase.indexOf(" ", inicio);
            palabra = frase.substring(inicio, espacio);
            arregloPalabra[posicion] = palabra;
            inicio = espacio + 1;
            posicion++;
        }
        do {
            System.out.println("MENU\n1 buscar el contenido de una posicion\n2 Buscar la posicion de una palabra\nIngrese:");
            inicio = TecladoIn.readLineInt();
            switch (inicio) {
                case 1:
                    buscarContDePosicion(arregloPalabra, posicion);
                    ;
                    break;
                case 2:
                    buscarPosicionDePalabra(arregloPalabra, posicion);
                    ;
                    break;
                default:
                    System.out.println("Incorrecto");
                    break;
            }
            System.out.println("Volver a MENU? SI/NO");
            frase = TecladoIn.readLine();
            
        } while (frase.equalsIgnoreCase("SI"));

    }
    
    public static void buscarContDePosicion(String[] arr, int lon) {
        int ubicacion = 0;
        String seguir;
        do {
            do {
                System.out.println("Ingrese la posicion (1-" + lon + ")");
                ubicacion = TecladoIn.readLineInt();
            } while (ubicacion < 1 || ubicacion > lon);
            System.out.println("la posicion " + ubicacion + " contiene " + arr[ubicacion - 1]);
            
            System.out.println("Seguir? SI/NO");
            seguir = TecladoIn.readLine();
        } while (seguir.equalsIgnoreCase("SI"));
    }
    
    public static void buscarPosicionDePalabra(String[] arr, int lon) {
        String palabra;
        int posicion;
        do {
            System.out.println("ingrese la palabra a buscar: ");
            palabra = TecladoIn.readLine();
            for (int i = 0; i < lon; i++) {
                if (palabra.equals(arr[i])) {
                    posicion = i + 1;
                    System.out.println("La palabra -" + palabra + "- está en la posicion -" + posicion + "-");
                    i = lon;
                } else {
                    if (i == lon - 1) {
                        System.out.println("No se encuentra");
                    }
                }
                
            }
            System.out.println("Seguir? SI/NO");
            palabra = TecladoIn.readLine();
        } while (palabra.equalsIgnoreCase("SI"));
    }
    
}
