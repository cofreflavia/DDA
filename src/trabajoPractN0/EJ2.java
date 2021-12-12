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
public class EJ2 {

    public static void main(String[] args) {
        int x, y, z;
        for (int i = 0; i < 2; i++) {
            System.out.println("ingrese los valores:");
            x = TecladoIn.readLineInt();
            y = TecladoIn.readLineInt();
            z = x * x + y * y;
            System.out.print("El valor de z es: " + z + "\n");

        }
    }
}
