/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN2;

import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class EJ1 {

    public static void main(String[] args) {
        int fila, columna;
        
        System.out.print("Matriz de Numeros Enteros\nIngrese la cantidad de filas: ");
        fila = TecladoIn.readLineInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        columna = TecladoIn.readLineInt();
        int[][] arregloEntero = new int[fila][columna];
        menu(arregloEntero);
    }

    public static void cargarFilaNro(int[][] arr, int nro) {
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print("cargar " + nro + "x" + i + "=");
            arr[nro][i] = TecladoIn.readLineInt();
        }
    }

    public static void mostrarColumnaNro(int[][] arr, int nro) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "x" + nro + "=" + arr[i][nro] + " ");
        }
    }
    
    public static void menu(int arreglo[][]){
        int opcion, nro;
        String seguir;
        do {
            System.out.println("MENU\n1 Cargar una Fila\n2 Cargar matriz Completa\n3 Mostrar una Columna\n4 Mostrar la Matriz Completa");
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 1:
                    do {
                        System.out.print("ingrese la fila (0-" + (arreglo.length - 1) + ") a cargar: ");
                        nro = TecladoIn.readLineInt();
                    } while (nro > arreglo.length && nro < 0);
                    cargarFilaNro(arreglo, nro);
                    break;

                case 2:
                    for (int i = 0; i < arreglo.length; i++) {
                        cargarFilaNro(arreglo, i);
                    }
                    ;
                    break;

                case 3:
                    do {
                        System.out.print("ingrese la columna (0-" + (arreglo[0].length - 1) + ") a mostrar: ");
                        nro = TecladoIn.readLineInt();
                    } while (nro > arreglo[0].length && nro < 0);
                    mostrarColumnaNro(arreglo, nro);
                    System.out.println("");
                    ;
                    break;

                case 4:
                    for (int i = 0; i < arreglo[0].length; i++) {
                        mostrarColumnaNro(arreglo, i);
                        System.out.println("");
                    }
                    ;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    ;
                    break;
            }
            System.out.print("Mostrar Menu? si/no ----->");
            seguir = TecladoIn.readLine();
        } while (seguir.equalsIgnoreCase("si"));
    }

}
