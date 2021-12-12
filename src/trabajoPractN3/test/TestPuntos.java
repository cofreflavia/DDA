/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN3.test;


import utiles.TecladoIn;
import trabajoPractN3.clases.Puntos;

/**
 *
 * @author Flavia
 */
public class TestPuntos {
    public static void main (String []args){
        Puntos ptos, ptosAux;
        ptos=ingresarPuntos();
        int opcion, pts;
        do{
        menu();
        opcion=TecladoIn.readLineInt();
        switch(opcion){
            case 0:;break;
            case 1: System.out.println(ptos.aCadena());break;
            case 2:System.out.println("Ingrese cantidad de puntos a sumar: ");
                pts=TecladoIn.readLineInt();
                ptos.sumarPuntos(pts);
                System.out.println("Ahora posee "+ptos.getPuntos()+" puntos");;break;
            case 3:System.out.println("Ingrese la cantidad de puntos a canjear: ");
                pts=TecladoIn.readLineInt();
                if (ptos.canjearPuntos(pts)) {
                    System.out.println("Se realizo el canje!");
                }else
                    System.out.println("No tiene la cantidad de puntos para el canje");
                ;break;
            case 4:ptosAux=ingresarPuntos();
                    if (ptos.equals(ptosAux)) {
                        System.out.println("Es el mismo cliente");
                    }else{
                        System.out.println("Distinto Cliente");
                    };break;
            default:System.out.println("Opcion Incorrecta");;break;
        }
        }while(opcion != 0);
    }
    public static void menu (){
        System.out.println("----------------MENU-----------------");
        System.out.println("0. Salir");
        System.out.println("1. Listar nombre y cantidad de puntos");
        System.out.println("2. Sumar puntos");
        System.out.println("3. Canjear Puntos");
        System.out.println("4. Ingrese otro cliente y compara si son iguales");
        System.out.println("-------------------------------------");
    }
    public static Puntos ingresarPuntos(){
        int pts;
        String nom;
        Puntos p = new Puntos("");
        System.out.println("Ingrese datos del Cliente");
        System.out.print("Nombre: ");
        nom=TecladoIn.readLine();
        System.out.print("Puntos: ");
        pts=TecladoIn.readLineInt();
        p.setNombre(nom);
        p.setPuntos(pts);
        return p;
    }
}
