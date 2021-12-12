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
public class Pelicula {
    //Atributos
    private final String nombre;
    private int minutos;
    
    //Constructor de dos parametros formales
    public Pelicula (String titulo, int longitud){
        nombre= titulo;
        minutos= longitud;
        
    }
    //Observadores
    public int getMinutos(){
        return minutos;
    }
    public String getNombre(){
        return nombre;
    }
    //Modificadores
    public void setMinutos(int lon){
        minutos=lon;
    }
}
