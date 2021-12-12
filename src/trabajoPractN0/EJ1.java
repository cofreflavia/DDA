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
public class EJ1 {
    public static void main (String []args){
        //Este algoritmo intercambia los valores de las variables
        int x, y;
        System.out.print("Escribir los valores\nx=");
        x=TecladoIn.readLineInt();
        System.out.print("y=");
        y=TecladoIn.readLineInt();
        x=x-y;
        y=x+y;
        x=y-x;
        System.out.println("Los valores son: de x="+x+"  y="+y);
    }
    
}
