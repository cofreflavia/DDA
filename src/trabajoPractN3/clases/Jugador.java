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
public class Jugador {
    // Atributos
    private String nickname;
    private final int [] puntos;
    // Constructores
    public Jugador (String nom){
        nickname=nom;
        puntos= new int[10];
        for (int i = 0; i < 10; i++) {
            puntos [i]=0;
        }
    }
    //Observadores 
    public String getNickname(){
        return nickname;
    }
    public int [] getPuntos(){
        return puntos;
    }
    public String aCadena(){
        String ptos=" Los puntajes son: ";
        for (int i = 0; i < 10; i++) {
            ptos+=puntos[i]+" - ";
        }
        return("Nombre: "+nickname+ptos);
    }
    public boolean equals(Jugador p){
        return (nickname.equalsIgnoreCase(p.nickname));
    }
    // Modificadores
    public void setNickname(String n){
        this.nickname=n;
    }
    public void setPuntos(int d){
        int menor=puntos[0];
        int posicion=0;
        for (int i = 1; i < puntos.length; i++) {
            if (menor > puntos[i]) {
                posicion=i;
                menor=puntos[i];
            }
        }
        if(d>menor){
            puntos[posicion]=d;
        }
    }
    // Propias del tipo
    public void sumarPuntos(int mas){
        for (int i = 0; i < puntos.length; i++) {
            puntos[i]=puntos[i]+mas;
        }
    }
    
    public int mayorPuntaje(){
         int mayor=puntos[0];
        for (int i = 1; i < puntos.length; i++) {
            if (mayor<puntos[i]) {
                mayor=puntos[i];
            }
        }
        return mayor;
    }
    
    
}// Fin de la Clase
