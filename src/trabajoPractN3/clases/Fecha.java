/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN3.clases;

/**
 *
 * @author Flavia
 */
public class Fecha {
    // Atributos
    private int dia;
    private int mes;
    private int año;
    //Constructores
    public Fecha(int d, int m, int anio){
        dia=d;
        mes=m;
        año=anio;
    }
    public Fecha(){
        dia=1;
        mes=1;
        año=1998;
    }
    //Observadores
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }
    public String aCadena(){
        return(dia+"/"+mes+"/"+año);
    }
    public boolean equals(Fecha f){
        return(dia==f.dia && mes==f.mes && año==f.año);
    }
    //Modificadores
    public void setDia(int day){
        dia=day;
    }
    public void setMes(int me){
        mes=me;
    }
    public void setAño(int a){
        año=a;
    }
    //Propias del tipo
    public String aNombre(){
        String me;
        switch(mes){
            case 1:me="Enero";break;
            case 2:me="Febrero";break;
            case 3:me="Marzo";break;
            case 4:me="Abril";break;
            case 5:me="Mayo";break;
            case 6:me="Junio";break;
            case 7:me="Julio";break;
            case 8:me="Agosto";break;
            case 9:me="Septiembre";break;
            case 10:me="Octubre";break;
            case 11:me="Noviembre";break;
            case 12:me="Diciembre";break;
            default: me="";break;
        }
         return (dia+" de "+me+" del "+año);   
    }
    public boolean esFechaAnterior(Fecha f1){
        boolean es=false;
        if(año <= f1.año && mes<=f1.mes && dia<=f1.dia){
            es=true;
        }
        return es;
    }

    public int convertirADias(){
        int sumar=dia;
        for (int i = 1; i < mes; i++) {
                if(i==4 || i==6 || i==9 || i==11){
                    sumar+=30;
                }else{
                    if(i==2){
                        if (año%4==0) {
                            sumar+=29;
                        }else{
                            sumar+=28;
                        }
                    }else{
                        sumar+=31;
                    }
                }
        }
        return sumar;
    }
    
    public int devolverCantDiasMes(){
        int m=mes;
        int nroDias;
        if (m==4 || m==6 || m==9 || m==11) {
            nroDias=30;
        }else{
            if (m==2) {
                if (año% 4 ==0) {
                    nroDias=29;
                }else{
                    nroDias=28;
                }
            }else{
                nroDias=31;
            }
        }
        return nroDias;
    }
    
    
    public boolean esBisiesto(){
        return(año%4 == 0);
    }
    
    
    
    public Fecha calculaFecha(int cant){
        Fecha f1= new Fecha();
        int falta;
        int a=año;
        int m=mes;
        int d=dia;
        falta= devolverCantDiasMes()-d;
        if (cant>falta) {
            d=1;
            cant=cant-falta;
            if (m<12) {
                m++;
            }else{
                m=1;
                a++;
            }
        }else{
            d=d+cant;
            cant=0;
        }
        f1.setDia(d);
        f1.setMes(m);
        f1.setAño(a);   
        while(cant>0){
        if (cant>f1.devolverCantDiasMes() ) {
            d=1;
            cant=cant-f1.devolverCantDiasMes();
            if (m<12) {
                m++;
            }else{
                m=1;
                a++;
            }
        }else{
            d=d+cant-1;
            cant=0;
        }
        f1.setDia(d);
        f1.setMes(m);
        f1.setAño(a);
        
        }
        return f1;
    }
    
    
}
