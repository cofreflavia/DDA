/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN3.test;

import trabajoPractN3.clases.NumeroComplejo;
import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class TestNumeroComplejo {

    public static void Menu() {
        System.out.println("---------------MENU--------------------------------");
        System.out.println("Ingrese el numero correspondiente a la opcion deseada");
        System.out.println("");
        System.out.println("1. Cargar un numero complejo");
        System.out.println("2. Obtener la parte real del nuemero complejo ingresado");
        System.out.println("3. Obtener la parte imaginaria del nuemro complejo ingresado");
        System.out.println("4. Mostrar por pantalla el numero complejo ingresado");
        System.out.println("5. Hacer una copia del numero complejo");
        System.out.println("6. Ingrese otro numero complejo y sumarlos");
        System.out.println("7. Ingrese otro numero complejo y restarlos");
        System.out.println("8. Ingrese otro numero complejo y multiplicarlos");
        System.out.println("9. Ingrese otro numero complejo y dividirlos");
        System.out.println("10.Ingresa otro numero y compara sin son iguales");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.print("Ingrese: ");
    }

    public static void main(String[] args) {
        int op = 23;
        NumeroComplejo n1 = new NumeroComplejo();
        NumeroComplejo n2;
        while (op != 0) {
            Menu();
            op = TecladoIn.readLineInt();
            switch (op) {
                case 0:System.out.println("Chauuu");break;
                case 1:
                    n1 = ingresarNroComplejo();
                    break;
                case 2:
                    System.out.println("La parte real del complejo es = " + n1.getparteReal());
                    break;
                case 3:
                    System.out.println("La parte imaginaria del complejo es = " + n1.getparteImaginaria());
                    break;
                case 4:
                    System.out.println("El nuemro complejo ingresado es = " + n1.aCadena());
                    break;
                case 5:
                    n1.Clonar();
                    break;
                case 6:
                    n2 = ingresarNroComplejo();
                    System.out.println("Suma= " + (n1.suma(n2)).aCadena());
                    break;
                case 7:
                    n2 = ingresarNroComplejo();
                    System.out.println("Resta= " + (n1.resta(n2)).aCadena());
                    break;
                case 8:
                    n2 = ingresarNroComplejo();
                    System.out.println("Producto= " + (n1.producto(n2)).aCadena());
                    break;
                case 9:
                    n2 = ingresarNroComplejo();
                    System.out.println("Division= " + (n1.division(n2).aCadena()));
                    break;
                case 10:
                    n2 = ingresarNroComplejo();
                    System.out.println("Son iguales= " + n1.equals(n2));
                    break;
                default:
                    System.out.println("Opcion incorrecta verifique y reingrese");
                    break;

            }
        }

    }

    public static NumeroComplejo ingresarNroComplejo() {
        NumeroComplejo nro = new NumeroComplejo();
        System.out.println("Ingrese la parte real del complejo");
        double real = TecladoIn.readLineDouble();
        System.out.println("Ingrese la parte imaginaria del complejo");
        double imaginaria = TecladoIn.readLineDouble();
        nro.setparteReal(real);
        nro.setparteImaginaria(imaginaria);
        return nro;
    }
}
