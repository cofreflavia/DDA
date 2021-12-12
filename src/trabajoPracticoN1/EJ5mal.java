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
public class EJ5mal {

    public static void main(String[] args) {
        //
        String conjuntoA, conjuntoB;
        do {
            System.out.println("Ingrese los elementos del conjunto A");
            conjuntoA = TecladoIn.readLine();
            System.out.println("Ingrese los elementos del conjunto B");
            conjuntoB = TecladoIn.readLine();
        } while (verificarConjunto(conjuntoB)||verificarConjunto(conjuntoA)||conjuntoA.length()!=conjuntoB.length());
        System.out.println("La intersecion entre A y B es: "+ interseccionConjuntos(conjuntoA, conjuntoB));
        System.out.println("La union entre A y B es: "+ unionConjuntos(conjuntoA, conjuntoB));
        System.out.println("La diferencia entre A-B es: "+ diferenciaConjuntos(conjuntoA, conjuntoB));
        System.out.println("La diferencia entre B-A es: "+ diferenciaConjuntos(conjuntoB, conjuntoA));


    }

    public static boolean verificarConjunto(String conjunto) {
        /**
         *
         */
        int i, j;
        boolean verificacion=false;
        for (i = 0; i < conjunto.length(); i++) {
            for (j = i + 1; j < conjunto.length(); j++) {
                if(conjunto.charAt(i)==conjunto.charAt(j)){
                    j = conjunto.length();
                    i = conjunto.length();
                    verificacion=true;
                }
            }
        }
        return(verificacion);
    }
    public static String unionConjuntos (String conjuntoA1, String conjuntoB1){
       /**
        * 
        */
        int i;
        String union="";

        for(i=0; i<conjuntoB1.length(); i++){
            if(conjuntoA1.indexOf(conjuntoB1.charAt(i))==-1){
                union= conjuntoB1.charAt(i)+union;
            } 
        }
        return(conjuntoA1+union.trim());
    }
    public static String interseccionConjuntos (String conjuntoA2, String conjuntoB2){
       /**
        * 
        */
        int i;
        String interseccion="";
        for(i=0; i<conjuntoB2.length(); i++){
            if(conjuntoA2.indexOf(conjuntoB2.charAt(i))!=-1){
                interseccion+=conjuntoB2.charAt(i);
            }
        }
        return (interseccion.trim());
    }
    public static String diferenciaConjuntos(String conjunto1, String conjunto2){
        /**
         * 
         */
        int i,j;
        char pivote, posicionConjunto;
        String interseccion, diferencia="";
        interseccion= interseccionConjuntos(conjunto1, conjunto2);
        for(i=0; i<interseccion.length(); i++){
            pivote=interseccion.charAt(i);
            for(j=0; j<conjunto1.length(); j++){
                posicionConjunto=conjunto1.charAt(j);
                if(pivote!= posicionConjunto){
                    diferencia+=conjunto1.charAt(j);
                }
            }
        }
        return(diferencia.trim());
    }
}
//    /**
//         *
//         */
//        //int i, j
//        char x, y;
//        String interseccion, diferencia = "";
//        interseccion = interseccionConjuntos(conjunto1, conjunto2);
//
//        for (i = 0; i < interseccion.length(); i++) {
//            x = interseccion.charAt(i);
//
//            for (j = 0; j < conjunto1.length(); j++) {
//                y = conjunto1.charAt(j);
//
//                if (x != y) {
//                    diferencia += y;
//                }
//
//            }
//        }
//
//        return (diferencia);
    
    
    
    
    
    
    
    
//    
//    public static String diferencia(String conjuntoA, String conjuntoB) { 
//127         String interseccion; 
//128         String diferencia; 
//129         char elementoInter, elementoConjA; 
//130         boolean estaPresente; 
//131         int i, j; 
//132          
//133         interseccion = interseccion(conjuntoA, conjuntoB); 
//134         diferencia = ""; 
//135         estaPresente = false; 
//136          
//137         /* 
//138         El código que sigue se puede remplazar por una sola línea de código: 
//139          
//140         return conjuntoA.replaceAll(interseccion, ""); 
//141         */ 
//142          
//143         for (i = 0; i < conjuntoA.length(); i++) { 
//144             elementoConjA = conjuntoA.charAt(i);  // indice del conjuto A 
//145              
//146             j = 0; 
//147             while (!estaPresente && j<interseccion.length()) { 
//148                 elementoInter = interseccion.charAt(j); 
//149                 if (elementoConjA == elementoInter) { 
//150                     estaPresente = true; 
//151                 } 
//152                      
//153                 j++; 
//154             } 
//155                  
//156             if (!estaPresente) { 
//157                 diferencia += elementoConjA; 
//158             } 
//159              
//160             estaPresente = false; 
//161         } 
//162 
// 
//163         return diferencia; 
//164     } 
//165      
//}
