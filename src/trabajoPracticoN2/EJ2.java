/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN2;

import java.util.Random;


/**
 *
 * @author Flavia
 */
public class EJ2 {
    public static double promedio (int [] entero){
        int sumaPromedio=0;
        for(int p=0; p<entero.length;p++){
            sumaPromedio+=entero[p];
        }
        return sumaPromedio/entero.length;
    }
    public static void main (String[]args){
    //INCISO B
        
        //Declaracion
        int[] enteroConsecutivo;
        //Creacion
        enteroConsecutivo=new int [1000];
        //Inicializacion
        for(int j=0; j<enteroConsecutivo.length; j++){
            enteroConsecutivo[j]=j+1;
//            System.out.print(enteroConsecutivo[j]+"-");
            
        }
        System.out.println("el promedio de enteros consecutivos del 1 al 1000 es de: "+promedio(enteroConsecutivo));
        
        
        //INCISO C
        //Declaracion
        int[] imparConsecutivo;
        imparConsecutivo= new int [19999];
        int numeroInicial=10000;
        for(int k=0;k<imparConsecutivo.length;k++){
            imparConsecutivo[k]=numeroInicial+(2*k+1);
//            System.out.print(imparConsecutivo[k]+"-");
        }
        System.out.println("el promedio de enteros impares consecutivos del 10000 al 50000 es de: "+promedio(imparConsecutivo));

        
        //INCISO E
        int[] enteroAleatorio; 
        enteroAleatorio = new int[50];
        Random r = new Random();
        for (int i = 0; i < enteroAleatorio.length; i++) { 
            enteroAleatorio[i] = r.nextInt(101); 
//            System.out.print(enteroAleatorio[i] + "-");
        }
        System.out.println("El promedio de los 50 numeros enteros aleatorios es de "+promedio(enteroAleatorio));
        
        
        
     //INCISO G
        //Declaracion, creacion e inicializacion
        double[] temperatura={9.0, 5.4, 6.8, 12, 13, 15, 4.9, 7.3, 5.1, 10.3, 50, 23.4, 25.6, 17.54, 2.4};
//        for (int n = 0; n < temperatura.length; n++){
//            System.out.print(temperatura[n] + "° ");
//        }
        System.out.println("El promedio de las 15 temperaturas es de "+promedio2(temperatura));
        
        //INCISO H
        //Declaracion, creacion e inicializacion
        double[] altura={1.51, 1.43, 1.86, 1.23, 1.39, 1.58, 1.90, 1.73, 1.83, 1.60, 1.80, 1.77, 1.54, 1.75};
//        for (int n = 0; n < altura.length; n++){
//            System.out.print(altura[n] + "m ");
//        }
        System.out.println("El promedio de las 14 alturas es de "+ promedio2(altura));
    }
    
        
        public static double promedio2 (double [] real){
        double sumaPromedio=0.0;
        for(int p=0; p<real.length;p++){
            sumaPromedio+=real[p];
        }
        return sumaPromedio/real.length;
    }
        
        
        
         
        
    
     
        
    
}
