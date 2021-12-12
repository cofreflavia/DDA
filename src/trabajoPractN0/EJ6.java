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
public class EJ6 {

    public static void main(String[] args) {
        //Este metodo 
        String nombre, estadoCivil, ganador = "";
        int edad, paises, cantEncuestas = 0, sumaEdades = 0, masVisitas = 0;
        char fin;
        System.out.println("Encuesta Turismo Argentar\nComencemos!");
        do {

            System.out.print("Nombre y apellido: ");
            nombre = TecladoIn.readLine();
            System.out.print("Edad:");
            edad = TecladoIn.readLineInt();
            System.out.print("Cantidad de paises visitados: ");
            paises = TecladoIn.readLineInt();
            System.out.print("Estado civil: ");
            estadoCivil = TecladoIn.readLine();
            sumaEdades += edad;
            cantEncuestas++;
            if (edad >= 45 && edad <= 65 && estadoCivil.equalsIgnoreCase("soltero")) {
                System.out.println("Enhorabuena! ya se encuentra participando por un viaje a las Cataratas");
                if (paises >= masVisitas) {
                    if (paises > masVisitas) {
                        masVisitas = paises;
                        ganador = nombre;
                    } else {
                        ganador = ganador + "-" + nombre;
                    }
                }
            } else {
                System.out.println("No participa del sorteo");
            }

            System.out.println("Seguir encuestando? s/n");
            fin = TecladoIn.readLineNonwhiteChar();
        } while (fin == 's');
        System.out.println("El promedio de edad de los " + cantEncuestas + " encuestados es de: " + EJ3.promedio(sumaEdades, cantEncuestas));
        System.out.println("la/s persona/s que mas paises visitó (" + masVisitas + ") es/son:" + ganador);

    }
}
