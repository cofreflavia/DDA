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
public class EJ2 {
    public static void main(String [] args){
        int [][] matriz1=ingresar();
        int [][] matriz2, matrizSuma;
        int opcion;
        System.out.println("MENU\n1 Mostrar Matriz\n2 Verificar si es Cuadrada\n3 Verificar si es Triangular Superio\n4 Verficar si es Triangular Inferior\n5 Verificar si es Diagonal\n6 Suma de Matrices");
        opcion=TecladoIn.readLineInt();
        switch(opcion){
            case 1:mostrar(matriz1);break;
            case 2:System.out.println("Es matriz cuadrada: "+esCuadrada(matriz1));break;
            case 3:System.out.println("Es matriz Triangular Superior: "+esTrianSup(matriz1));break;
            case 4:System.out.println("Es matriz Triangular Inferior: "+esTrianInf(matriz1));break;
            case 5:System.out.println("Es matriz Triangular Diagonal: "+esDiagonal(matriz1));break;
            case 6:
                do{
                System.out.println("Ingrese la 2da matriz de "+matriz1.length+"x"+matriz1[0].length);
                matriz2=ingresar();
                }while(matriz1.length != matriz2.length && matriz1[0].length!=matriz2[0].length);
                matrizSuma=sumaDeMatrices(matriz1, matriz2);
                System.out.println("La matriz suma es:");
                mostrar(matrizSuma);break;
            case 7:System.out.println("Ingrese el escalar: ");break;
            default:;break;
                
                
        }
    }
    public static int [][] sumaDeMatrices(int [][]ma1, int[][] ma2){
        int [][] matrizSum= new int [ma1.length][ma1[0].length];
          for (int i = 0; i < ma1.length; i++) {
            for (int j = 0; j < ma1[0].length; j++) {
                matrizSum[i][j]= ma1[i][j] + ma2[i][j];
            }
        }
          return(matrizSum);
    }
    
    public static boolean esTrianSup(int [][] ma){
        boolean esTrianSup=true;
        if(esCuadrada(ma)){
            for (int i = 0; i < ma.length; i++) {
                for (int j = 0; j < ma[0].length; j++) {
                    if(i>j){
                        if (ma[i][j]!=0) {
                            esTrianSup=false;
                        }
                    }
                    
                }
                
            }
        }else{
            esTrianSup=false;
        }
        return(esTrianSup);
    }
    public static boolean esTrianInf(int [][] ma){
        boolean esTrianInf=true;
        if(esCuadrada(ma)){
            for (int i = 0; i < ma.length; i++) {
                for (int j = 0; j < ma[0].length; j++) {
                    if(i<j){
                        if (ma[i][j]!=0) {
                            esTrianInf=false;
                        }
                    }
                    
                }
                
            }
        }else{
            esTrianInf=false;
        }
        return(esTrianInf);
    }
    
    public static boolean esDiagonal(int [][] ma){
        boolean esDiag=true;
        if(esCuadrada(ma) && esTrianSup(ma) && esTrianInf(ma)){
            for (int i = 0; i < ma.length; i++) {
                for (int j = 0; j < ma[0].length; j++) {
                    if(i==j){
                        if (ma[i][j]==0) {
                            esDiag=false;
                        }
                    }
                    
                }
                
            }
        }else{
            esDiag=false;
        }
        return(esDiag);
    }
    public static boolean esCuadrada(int [][] ma){
        boolean esCuadrada=false;
        if (ma.length == ma[0].length) {
            esCuadrada=true;
        }
        return (esCuadrada);
    }
    public static int [][] ingresar (){
        int fila, columna;
        int [][] matriz;
        System.out.print("Matriz\nIngrese nros de fila:");
        fila=TecladoIn.readLineInt();
        System.out.print("Ingrese nro de columnas: ");
        columna=TecladoIn.readLineInt();
        matriz=new int[fila][columna];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(i+"x"+j+"=");
                matriz[i][j]=TecladoIn.readLineInt();
            }
            
        }
        return(matriz);
    }
    public static void mostrar (int [][] ma){
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                System.out.print(ma[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
