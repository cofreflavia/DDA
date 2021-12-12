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
public class EJ6666 {

    public static void main(String[] args) {
        String conjuntoA, conjuntoB;
        System.out.print("Ingrese conjunto A: ");
        conjuntoA = TecladoIn.readLine();
        System.out.print("Ingrese conjunto B: ");
        conjuntoB = TecladoIn.readLine();
        System.out.println("\nUnión de A y B: " + union(conjuntoA, conjuntoB));
        System.out.println("Intersección entre A y B: " + interseccion(conjuntoA, conjuntoB));
        System.out.println("Diferencia entre A y B: " + diferencia(conjuntoA, conjuntoB));
        System.out.println("Diferencia entre B y A: " + diferencia(conjuntoB, conjuntoA));
    }

    public static int multiplicidad(String conjunto, char elemento) {
        int nroMiembros, longitud;
        nroMiembros = 0;
        longitud = conjunto.length();
        for (int i = 0; i < longitud; i++) {
            if (conjunto.charAt(i) == elemento) {
                nroMiembros++;
            }
        }
        return nroMiembros;
    }

    public static String union(String conjuntoA, String conjuntoB) {
        String union;
        int multiplicidadA, multiplicidadB;
        char elementoA, elementoB;
        union = "";
        for (int i = 0; i < conjuntoA.length(); i++) {
            elementoA = conjuntoA.charAt(i);
           
            multiplicidadA = multiplicidad(conjuntoA, elementoA);
            multiplicidadB = multiplicidad(conjuntoB, elementoA);
            
            if (multiplicidadA > multiplicidadB) {
                union += elementoA;
            }
        }
        for (int i = 0; i < conjuntoB.length(); i++) {
            elementoB = conjuntoB.charAt(i);
            multiplicidadA = multiplicidad(conjuntoA, elementoB);
            multiplicidadB = multiplicidad(conjuntoB, elementoB);
            if (multiplicidadB >= multiplicidadA) {
                union += elementoB;
            }
        }
        return union;
    }

    public static String interseccion(String conjuntoA, String conjuntoB) {
        String interseccion;
        String abecedario;
        char letra;
        abecedario = "abcdefghijklmnñopqrstuvwxyz";
        interseccion = "";
        for (int i = 0; i < abecedario.length(); i++) {
            letra = abecedario.charAt(i);
            if (multiplicidad(conjuntoA, letra) >= multiplicidad(conjuntoB, letra)) {
                for (int j = 0; j < multiplicidad(conjuntoB, letra); j++) {
                    interseccion += letra;
                }
            } else {
                for (int j = 0; j < multiplicidad(conjuntoA, letra); j++) {
                    interseccion += letra;
                }
            }
        }
        return interseccion;
    }

    public static String diferencia(String conjuntoA, String conjuntoB) {
        String interseccion, diferencia;
        int repeticiones, i;
        char elemento;
        diferencia = conjuntoA;
        interseccion = interseccion(conjuntoA, conjuntoB);
        repeticiones = interseccion.length();
        i = 0;
        if (!interseccion.equals("")) {
            while (repeticiones > 0) {
                elemento = interseccion.charAt(i);
                diferencia = diferencia.substring(0, diferencia.indexOf(elemento)) + diferencia.substring(diferencia.indexOf(elemento) + 1);
                i++;
                repeticiones--;
            }
        }
        return diferencia;
    }

}
