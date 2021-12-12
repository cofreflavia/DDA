/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN3.test;

import trabajoPractN3.clases.Pelicula;

/**
 *
 * @author Flavia
 */
public class Estudio {
    public static void main (String [] args){
        //Creamos una serie de objetos peliculas
        Pelicula [] produjo= new Pelicula [4];
        produjo[0]= new Pelicula("Shrek", 133);
        produjo[1]= new Pelicula("Road to Perdition", 117);
        produjo[2]= new Pelicula("Enigma", 114);
        produjo[3]= new Pelicula("The Truth about ...", 93);
        
        Pelicula Longest= null, Shortest=null;
        int longtime=0, shorttime=0;
        
        for (int i = 0; i < produjo.length; i++) {
            int mins= produjo[i].getMinutos();
            if (i==0) {
                Shortest=Longest=produjo[i];
                shorttime=longtime=mins;
            }else{
                if (mins<shorttime) {
                    shorttime=mins;
                    Shortest=produjo[i];
                }
                if (mins>longtime) {
                    longtime=mins;
                    Longest=produjo[i];
                }
            }
        }
        System.out.println("La pelicula mas larga es "+ Longest.getNombre()+" de "+ longtime+" minutos");
        System.out.println("La pelicula mas corta es "+Shortest.getNombre()+" de "+shorttime+" minnutos");
        

        
    }
    
}
