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
public class Puntos {
    //Atributos
    private String nombre;
    private int puntos;
    //Constructores
    public Puntos(String nom){
        nombre=nom;
        puntos=0;
    }
    //Observadores
    public String getNombre(){
        return nombre;
    }
    public int getPuntos(){
        return puntos;
    }
    public String aCadena(){
        return("Nombre: "+nombre+", Cantidad de Puntos: "+puntos);
    }
    public boolean equals(Puntos p){
        return(nombre.equalsIgnoreCase(p.nombre) && puntos== p.puntos);
    }
    //modificadores
    public void setNombre(String n){
        nombre=n;
    }
    public void setPuntos(int d){
        puntos=d;
    }
    //Propias del Tipo
    public void sumarPuntos(int mas){
        puntos+=mas;
    }
    public boolean canjearPuntos(int canje){
        boolean canjeado=false;
        if (puntos>=canje) {
          puntos-=canje; 
          canjeado=true;
        }
        return canjeado;
    }
}//Fin de la Clase
