/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN3.test;

import trabajoPractN3.clases.Fecha;
import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class TestFecha {

    public static void main(String[] args) {
        int opcion;
        Fecha fecha=ingresarFecha();
        Fecha f;
        do{
        menu();
        opcion=TecladoIn.readLineInt();
        switch(opcion){
            case 0:;break;
            case 1:listar(fecha);break;
            case 2:System.out.println("Han transcurrido "+ fecha.convertirADias()+" dias");;break;
            case 3:System.out.println("Segunda Fecha");
                f=ingresarFecha();
                if(fecha.esFechaAnterior(f)){
                    System.out.println("La primer fecha es anterior a la segunda fecha");
                }else{
                    System.out.println("La primer fecha es posterior a la segunda fecha");
                };break;
            case 4:System.out.print("Cantidad de dias a sumar: ");
                    int cant=TecladoIn.readLineInt();
                    f=fecha.calculaFecha(cant);
                    listar(f);
                ;break;
            case 5:
                if(fecha.esBisiesto()){
                System.out.println("SI");
                }else{
                    System.out.println("NO");
                }
                ;break;
        }
        }while(opcion != 0);
    }
    
    
    
    public static void menu(){
        System.out.println("----------------------MENU------------------------------------");
        System.out.println("0. Salir");
        System.out.println("1. Listar");
        System.out.println("2. calcula la cantidad de dias que lleva el año hasta la fecha");
        System.out.println("3. Posicion de dos Fechas");
        System.out.println("4. Suma dias y obtiene nueva fecha");
        System.out.println("5. Es año Bisiesto?");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Ingrese: ");
    }
    
    public static Fecha ingresarFecha() {
        //Mejorar hecho despues de hacer Propias del Tipo
        boolean volver;
        int d, m, a;
        Fecha f = new Fecha();
        System.out.println("Ingresar");
        System.out.print("Año: ");
        a = TecladoIn.readLineInt();
        do {
            System.out.print("Mes: ");
            m = TecladoIn.readLineInt();
            volver = (m > 0 && m < 13);
            if (!volver) {
                System.out.println("Incorrecto");
            }
        } while (!volver);
        do{
            System.out.print("Dia: ");
            d = TecladoIn.readLineInt();
            if (m == 4 || m == 6 || m == 9 || m == 11) {
                volver = (d > 0 && d < 31);
                if (!volver) {
                    System.out.println("Incorrecto");
                }
            } else {
                if (m == 2) {
                    if (a % 4 == 0) {
                        volver = (d > 0 && d < 30);
                        if (!volver) {
                               System.out.println("Incorrecto");
                        }
                    } else {
                        volver = (d > 0 && d < 29);
                        if (!volver) {
                           System.out.println("Incorrecto");
                        }
                    }
                }else{
                    volver=(d>0 && d<32);
                    if (!volver) {
                       System.out.println("Incorrecto");
                    }
                }
            }
        }while(!volver);
        
        f.setAño(a);
        f.setMes(m);
        f.setDia(d);
        return f;
    }
    public static void listar(Fecha f){
        System.out.println(f.aCadena());
        System.out.println(f.aNombre());
    }
    

    
}
     