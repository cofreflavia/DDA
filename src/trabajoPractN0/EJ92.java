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
public class EJ92 {
    public static void main (String [] args){
        int base, exponente, resultado=1;
        System.out.print("Ingrese la base: ");
        base=TecladoIn.readLineInt();
        
        System.out.print("Ingrese el exponente: ");
        exponente=TecladoIn.readLineInt();
        switch  (exponente){
            case 0: resultado=1;break;
            case 1: resultado=base;break;
            default: 
                for (int i = 0; i < exponente ; i++) {
                    resultado= resultado*base;
                    
                }
                
        }
        System.out.println("el resultado es: "+ resultado);
               
    }
}
