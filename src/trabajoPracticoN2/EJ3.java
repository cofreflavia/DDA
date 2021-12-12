/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN2;

import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class EJ3 {
    public static void main(String[] args) {
        String palabraBuscar;
        int numeroBuscar;
//        System.out.print("Ingrese la palabra que quiere encontrar en el arreglo");
//        palabraBuscar=TecladoIn.readLine();
//        String[] palabra={"hola", "adios", "acá", "allá", "donde", "no", "si", "mirá", "arriba", "abajo", "izquierda", "derecha", "alto", "bajo", "paciencia"};
//        if(estaElElemento(palabra,palabraBuscar)){
//            System.out.println("La palabra \""+palabraBuscar+"\" se encuentra en el arreglo");
//        }else{
//            System.out.println("La palabra \""+palabraBuscar+"\" NO se encuentra en el arreglo");
//        }
        
        System.out.print("Ingrese el numero que quiere encontrar en el arreglo: ");
        numeroBuscar=TecladoIn.readLineInt();
         int[] enteroConsecutivo;
        enteroConsecutivo=new int [1000];
        for(int j=0; j<enteroConsecutivo.length; j++){
            enteroConsecutivo[j]=j+1;
        }
        if (estaElNumero(enteroConsecutivo,numeroBuscar)) {
            System.out.println("El numero \""+numeroBuscar+"\" se encuentra en el arreglo");
        } else {
            System.out.println("El numero \""+numeroBuscar+"\" NO se encuentra en el arreglo");
        }
    }

    public static boolean estaElElemento(String[] palabra,String elementoBuscado) {
        int i=0;
        boolean estaElElemento=false;
        while(i< palabra.length && !estaElElemento){
            if(palabra[i].equalsIgnoreCase(elementoBuscado)){
                estaElElemento=true;
            }
            i++;
        }
        return estaElElemento;
    }
    public static boolean estaElNumero(int[] numero,int numeroBuscado){
     int i=0;
        boolean estaElNumero=false;
        while(i< numero.length && !estaElNumero){
            if(numero[i]==numeroBuscado){
                estaElNumero=true;
            }
            i++;
        }
        return estaElNumero;
    }
         
}
