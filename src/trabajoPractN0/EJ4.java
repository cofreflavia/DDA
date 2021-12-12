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
public class EJ4 {

    public static void main(String[] args) {
        //Este metodo arroja el dia que le corresponde al numero ingresado por el usuario
        int numero;
        char fin;
        do {
            System.out.println("Ingrese un numero del 1 al 7");
            numero = TecladoIn.readLineInt();
            switch (numero) {
                case 1:
                    System.out.println(" el 1 le corresponde al dia Lunes");
                    break;
                case 2:
                    System.out.println(" el 2 le corresponde al dia Martes");
                    break;

                case 3:
                    System.out.println(" el 3 le corresponde al dia Miercoles");
                    break;

                case 4:
                    System.out.println(" el 4 le corresponde al dia Jueves");
                    break;

                case 5:
                    System.out.println(" el 5 le corresponde al dia Viernes");
                    break;

                case 6:
                    System.out.println(" el 6 le corresponde al dia Sabado");
                    break;

                case 7:
                    System.out.println(" el 7 le corresponde al dia Domingo");
                    break;
                default:
                    System.out.println("numero invalido");
                    break;

            }
            System.out.println("¿Desea ingresar nuevamente? s/n");
            fin = TecladoIn.readLineNonwhiteChar();
        } while (fin == 's');
    }

}
