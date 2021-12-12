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
public class EJ5 {

    public static void main(String[] args) {
        //Este metodo le pide al usuario que ingrese dos conjuntos con la misma cantidad de elementos y muestra la union, interseccion y la diferencia de dichos conjuntos.
        String conjuntoA, conjuntoB;
        do {
            do {
                System.out.println("Ingrese los elementos del conjunto A");
                conjuntoA = TecladoIn.readLine();

            } while (verificarConjunto(conjuntoA));
            do {
                System.out.println("Ingrese los elementos del conjunto B");
                conjuntoB = TecladoIn.readLine();

            } while (verificarConjunto(conjuntoB));

        } while (conjuntoA.length() != conjuntoB.length());

        System.out.println("A=" + mostrar(conjuntoA));
        System.out.println("B=" + mostrar(conjuntoB));

        System.out.println("La intersecion entre A y B es: " + interseccionConjuntos(conjuntoA, conjuntoB));
        System.out.println("La union entre A y B es: " + unionConjuntos(conjuntoA, conjuntoB));
        System.out.println("La diferencia entre A-B es: " + diferenciaConjuntos(conjuntoA, interseccionConjuntos(conjuntoA, conjuntoB)));
        System.out.println("La diferencia entre B-A es: " + diferenciaConjuntos(conjuntoB, interseccionConjuntos(conjuntoA, conjuntoB)));

    }

    public static String mostrar(String conjunto) {
        String m;
        int n, i;
        m = "";
        n = conjunto.length();

        for (i = 0; i < n; i++) {
            m = m + conjunto.charAt(i) + ",";
        }
        return ("{"+m.substring(0, m.length()-1)+"}");
    }

    public static boolean verificarConjunto(String conjunto) {
        /**Este metodo verifica si el conjunto que ingreso el usuario es valido, es decir, no tiene elementos repetidos.
         *conjunto: representa el conjunto 
         */
        int i, j, longConjunto= conjunto.length();
        boolean verificacion = false;
        for (i = 0; i < longConjunto; i++) {
            for (j = i + 1; j < longConjunto; j++) {
                if (conjunto.charAt(i) == conjunto.charAt(j)) {
                    j = longConjunto;
                    i = longConjunto;
                    verificacion = true;
                }
            }
        }
        return verificacion;
    }//Fin del modulo verificarConjunto

    public static String unionConjuntos(String conjuntoA1, String conjuntoB1) {
        /**Este metodo realiza la union de los dos conjuntos ingresados como parametro formales.
         *conjuntoA1: representa el conjunto A ingresado por el usuario.
         *conjuntoB1: representa el conjunto B ingresado por el usuario.
         */
        int i;
        String union = conjuntoA1;

        for (i = 0; i < conjuntoB1.length(); i++) {
            if (conjuntoA1.indexOf(conjuntoB1.charAt(i)) == -1) {
                union += conjuntoB1.charAt(i);
            }
        }
        return union;
    }//Fin del modulo unionConjuntos

    public static String interseccionConjuntos(String conjuntoA1, String conjuntoB1) {
        /**Este metodo realiza la union de los dos conjuntos ingresados como parametros formales.
         *conjuntoA1: representa el conjunto A ingresado por el usuario.
         *conjuntoB1: representa el conjunto B ingresado por el usuario.
         */
        int i;
        String interseccion = "";
        for (i = 0; i < conjuntoB1.length(); i++) {
            if (conjuntoA1.indexOf(conjuntoB1.charAt(i)) != -1) {
                interseccion += conjuntoB1.charAt(i);
            }
        }
        if(interseccion.length()==0){
            interseccion="{}";
        }
        return interseccion;
    }//Fin de modulo interseccionConjuntos

    public static String diferenciaConjuntos(String conjunto1, String interseccion) {
        /**Este metodo calcula la diferencia entre dos conjuntos.
         * conjunto1: representa un conjunto.
         * interseccion: representa la interseccion entre dos conjuntos.
         */
        int i, posicionN;
        String caracter;
        if(interseccion.length()!=0){
            for(i=0;i<interseccion.length();i++){
                caracter=interseccion.charAt(i)+"";         
                posicionN=conjunto1.indexOf(caracter);                           
                conjunto1=conjunto1.substring(0, posicionN)+conjunto1.substring(posicionN+1);           
                if(conjunto1.length()==0){
                    conjunto1="{}";
                }
            }
        }
        
        return conjunto1;
//    El código que sigue se puede remplazar por una sola línea de código: 
//        return conjunto1.replaceAll(interseccion, ""); 
    }  
}//Fin del programa
