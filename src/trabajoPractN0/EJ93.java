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
public class EJ93 {
    public static void main (String []args){
        int num;
        System.out.println("Ingrese el numero entero: ");
        num=TecladoIn.readLineInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >=i ; j--) {
                if (j==i) {
                    System.out.print(i+"^"+j+"\n");
                }else{
                    System.out.print(i+"^"+j+" ");
                }
                
            }
        }
    }
    
}
