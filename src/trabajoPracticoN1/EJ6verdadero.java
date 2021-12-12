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
public class EJ6verdadero {
    public static void main (String [] args){
        //
        String multiConjuntoA, multiConjuntoB;
//        char elemento;               
        do{
            System.out.println("Ingrese el multiconjunto A");
            multiConjuntoA=TecladoIn.readLine();
            System.out.println("Ingrese el multiconjunto B");
            multiConjuntoB=TecladoIn.readLine();
        }while(multiConjuntoA.length()!=multiConjuntoB.length());
        menu(multiConjuntoA, multiConjuntoB);
//        do{
//           System.out.println("\nIngrese un elemento el cual quiere saber su ocurrencia en los multiconjunto A y B");
//           elemento=TecladoIn.readLineNonwhiteChar();
//           System.out.println("La multiplicidad de "+elemento+" en el multiconjunto A es de "+multiplicidad(multiConjuntoA, elemento));
//           System.out.println("La multiplicidad de "+elemento+" en el multiconjunto B es de "+multiplicidad(multiConjuntoB, elemento));
//           System.out.println("\n¿Desea continuar encontrando la ocurrencia de otro elemento? si/no");
//           continuar=TecladoIn.readLine();
//        }while(continuar.equalsIgnoreCase("si"));
        
        
    }
    public static void menu(String multiConjuntoA, String multiConjuntoB) {
        String continuar;
        int opcion;
        do{
            do {
            System.out.print("Las opciones son:\n1)INTERSECCION entre A y B.\n2)UNION entre A y B.\n3)DIFERENCIA entre A-B.\n4)DIFERENCIA entre B-A\n\nIngrese la opcion:");
            opcion=TecladoIn.readLineInt();
            }while(opcion>5);
            switch(opcion){
                case 1:System.out.println("La interseccion entre los multiconjuntos A y B es: "+interseccionConjuntos(multiConjuntoA, multiConjuntoB));break;
                case 2:System.out.println("La union entre los multiconjuntos A y B es: "+ unionConjuntos(multiConjuntoA, multiConjuntoB));break;
                case 3 :System.out.println("La diferencia entre A-B es: " + diferenciaConjuntos(multiConjuntoA, multiConjuntoB));break;
                case 4 :System.out.println("La diferencia entre B-A es: " + diferenciaConjuntos(multiConjuntoB, multiConjuntoA));break;
                    
            }
            System.out.println("\n¿Desea realizar otra operacion? si/no");
            continuar=TecladoIn.readLine();
        } while (continuar.equalsIgnoreCase("si"));
        
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

    public static String unionConjuntos(String conjuntoA, String conjuntoB) {
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
        if (union.length()==0) {
            union="{}";
        }
        return union;
    }

    public static String interseccionConjuntos(String conjuntoA, String conjuntoB) {
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
        if (interseccion.length()==0) {
            interseccion="{}";
        }
        return interseccion;
    }

    public static String diferenciaConjuntos(String conjunto1, String conjunto2) {
        String interseccion, diferencia, a, b;
        int repeticiones, i;
        char elemento;
        diferencia = conjunto1;
        interseccion = interseccionConjuntos(conjunto1, conjunto2);
        repeticiones = interseccion.length();
        i = 0;
        if (!interseccion.equals("")) {
            while (repeticiones > 0) {
                elemento = interseccion.charAt(i);
                a=diferencia.substring(0, diferencia.indexOf(elemento));
                b=diferencia.substring(diferencia.indexOf(elemento) + 1);
                diferencia = a+b; 
                i++;
                repeticiones--;
            }
        }
        if (diferencia.length()==0) {
            diferencia="{}";
        }
        return diferencia;
    }
    
}
