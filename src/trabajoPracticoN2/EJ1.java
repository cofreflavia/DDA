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
 * 
 * 
 */
public class EJ1 {
    public static void main (String [] args){
        //INCISO A
        //Declaracion
        char[] vocal;
        //Creacion
        vocal=new char[5];
        //Inicializacion
        vocal[0]='a';
        vocal[1]='e';
        vocal[2]='i';
        vocal[3]='o';
        vocal[4]='u';
        
        for(int i=0; i< vocal.length;i++){
            System.out.print(vocal[i]+" ");
        }
        
        System.out.println();
        
        //INCISO B
        //Declaracion
        int[] enteroConsecutivo;
        //Creacion
        enteroConsecutivo=new int [1000];
        //Inicializacion
        for(int j=0; j<enteroConsecutivo.length; j++){
            enteroConsecutivo[j]=j+1;
            System.out.print(enteroConsecutivo[j]+"-");
        }
        
        System.out.println();
        
        //INCISO C
        //Declaracion
        int[] imparConsecutivo;
        imparConsecutivo= new int [19999];
        int numeroInicial=10000;
        for(int k=0;k<imparConsecutivo.length;k++){
            imparConsecutivo[k]=numeroInicial+(2*k+1);
            System.out.print(imparConsecutivo[k]+"-");
        }
        
        System.out.println();
        
        //INCISO D
        int numero;
        //Declaracion
        char [] letraAbecedario;
        //Creacion
        letraAbecedario= new char [26];
        for(int l=0; l<letraAbecedario.length;l++){
            numero=97+l;
            //Inicializacion
            letraAbecedario[l]=(char)numero;
            System.out.print(letraAbecedario[l]+"-");
        }
        System.out.println();
         

        //INCISO E
        int[] enteroAleatorio; 
        enteroAleatorio = new int[50];
        Random r = new Random();
        for (int i = 0; i < enteroAleatorio.length; i++) { 
            enteroAleatorio[i] = r.nextInt(101); 
            System.out.print(enteroAleatorio[i] + "-");
        }
        System.out.println(); 
        
        //INCISO F
        //Declaracion, creacion e inicializacion
        String[] palabra={"hola", "adios", "acá", "allá", "donde", "no", "si", "mirá", "arriba", "abajo", "izquierda", "derecha", "alto", "bajo", "paciencia"};
        for (int m = 0; m < palabra.length; m++){
            System.out.print(palabra[m] + " ");
        }
        System.out.println();  
        
        //INCISO G
        //Declaracion, creacion e inicializacion
        double[] temperatura={9.0, 5.4, 6.8, 12, 13, 15, 4.9, 7.3, 5.1, 10.3, 50, 23.4, 25.6, 17.54, 2.4};
        for (int n = 0; n < temperatura.length; n++){
            System.out.print(temperatura[n] + "° ");
        }
        System.out.println();
        
        //INCISO H
        //Declaracion, creacion e inicializacion
        double[] altura={1.51, 1.43, 1.86, 1.23, 1.39, 1.58, 1.90, 1.73, 1.83, 1.60, 1.80, 1.77, 1.54, 1.75};
        for (int n = 0; n < altura.length; n++){
            System.out.print(altura[n] + "m ");
        }
        System.out.println();
         
        
    }
}
    
    
    

