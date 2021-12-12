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
public class EJ5RaizCuadrada {

    public static void main(String[] args) {
        //Este metodo permite calcular las raices de una ecuacion cuadratica
        int a, b, c, discriminante;
        double raiz1, raiz2, parteReal, parteImag;
        do{
        System.out.println("Ingrese el termino cuadratico (RECUERDE que debe ser != de cero)");
        a = TecladoIn.readLineInt();
        }while(a==0);
        System.out.println("Ingrese el termino lineal");
        b = TecladoIn.readLineInt();
        System.out.println("Ingrese el termino independiente");
        c = TecladoIn.readLineInt();
        discriminante = (b * b - 4 * a * c);
        if (discriminante >= 0) {
            raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            if (discriminante > 0) {
                raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuacion cuadratica tiene dos raices reales r1=" + raiz1 + " y r2=" + raiz2);
            } else {
                System.out.println("La ecuacion cuadratica tiene doble raiz real r1=" + raiz1);
            }

        } else {
            parteReal = -b / (2 * a);
            parteImag = Math.sqrt(Math.abs(discriminante)) / (2 * a);
            System.out.println("La ecuacion cudratica tiene dos raices imaginarias r1= " + parteReal + " + " + parteImag + " i y r2= " + parteReal + " - " + parteImag + " i");

        }

    }

}
