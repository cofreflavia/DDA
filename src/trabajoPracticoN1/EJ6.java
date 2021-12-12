/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN1;

import static trabajoPracticoN1.EJ5.diferenciaConjuntos;
import static trabajoPracticoN1.EJ5.interseccionConjuntos;
import static trabajoPracticoN1.EJ5.unionConjuntos;

import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class EJ6 {
    public static void main (String [] args){
        //
        String multiConjuntoA, multiConjuntoB, continuar, cjtoA, cjtoB, interseccion;
        char elemento;               
        
        do{
            System.out.println("Ingrese el multiconjunto A");
            multiConjuntoA=TecladoIn.readLine();
            System.out.println("Ingrese el multiconjunto B");
            multiConjuntoB=TecladoIn.readLine();
        }while(multiConjuntoA.length()!=multiConjuntoB.length());
        
        cjtoA=quitarOcurrencia(multiConjuntoA);
        cjtoB=quitarOcurrencia(multiConjuntoB);
        interseccion=interseccionConjuntos(cjtoA, cjtoB);
        
        System.out.println("La union entre los multiconjuntos A y B eliminando la ocurrencia es: "+ unionConjuntos(cjtoA, cjtoB));
        System.out.println("La diferencia entre A-B eliminando la ocurrencia es: " + diferenciaConjuntos(cjtoA, interseccion));
        System.out.println("La diferencia entre B-A eliminando la ocurrencia es: " + diferenciaConjuntos(cjtoB, interseccion));
    
        do{
           System.out.println("\nIngrese un elemento el cual quiere saber su ocurrencia en los multiconjunto A y B");
           elemento=TecladoIn.readLineNonwhiteChar();
           System.out.println("La multiplicidad de "+elemento+" en el multiconjunto A es de "+multiplicidad(multiConjuntoA, elemento));
           System.out.println("La multiplicidad de "+elemento+" en el multiconjunto B es de "+multiplicidad(multiConjuntoB, elemento));
           System.out.println("\n¿Desea continuar encontrando la ocurrencia de otro elemento? si/no");
           continuar=TecladoIn.readLine();
        }while(continuar.equalsIgnoreCase("si"));
        
        
    }
    public static int multiplicidad (String multiconjunto, char elemento){
        /**
         * 
         */
        int cantElemento=0, i;
        for(i=0; i<multiconjunto.length(); i++){
            if(multiconjunto.charAt(i)==elemento){
                cantElemento++;
            }
        }
        return cantElemento;
    }
    public static String quitarOcurrencia(String multiCjto){
        /**Este metodo le quita al multiconjunto los elementos que estan repetidos, dejando solamente una ves el elmento.
         * multiCjto: representa el multiconjunto ingresado por el usuario
         */
        int i,j;
        char primerElem;                  
        for(i=0;i<multiCjto.length();i++){
            primerElem=multiCjto.charAt(i);
            for(j=i+1;j<multiCjto.length();j++){
                if(primerElem==multiCjto.charAt(j)){
                    multiCjto=multiCjto.substring(0, j)+multiCjto.substring(j+1);
                    j--;
                }
            }
        }
        return multiCjto;
    }//Fin del modulo quitarOcurrencia
}
