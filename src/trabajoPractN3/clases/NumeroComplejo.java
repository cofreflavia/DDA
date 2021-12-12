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
public class NumeroComplejo {
    
    //Atributos
    private double parteImaginaria;
    private double parteReal;
    //Constructores
    public NumeroComplejo(){
        this.parteImaginaria=0.0;
        this.parteReal=0.0;
    }
    public NumeroComplejo(double a, double b){
        this.parteImaginaria=b;
        this.parteReal=a;
    }
    //Observadores
    public double getparteReal(){
        return this.parteReal;
    }
    public double getparteImaginaria(){
        return this.parteImaginaria;
    }
    public String aCadena(){
        String cadena=this.parteReal+" + "+this.parteImaginaria+" i";
        return cadena;
    }
    
    //Modificadores
    public void setparteReal(double Real){
        this.parteReal=Real;
    }
    public void setparteImaginaria(double Imaginaria){
        this.parteImaginaria=Imaginaria;
    }
    public NumeroComplejo Clonar(){
        NumeroComplejo x= new NumeroComplejo(this.parteReal, this.parteImaginaria);
        return x;
    }
    public boolean equals(NumeroComplejo a){
        return(parteReal==a.parteReal && parteImaginaria==a.parteImaginaria);
    }
    public NumeroComplejo suma (NumeroComplejo a){
        NumeroComplejo x= new NumeroComplejo();
        x.setparteReal(parteReal+a.parteReal);
        x.setparteImaginaria(parteImaginaria+a.parteImaginaria);
        return x;
    }
    public NumeroComplejo resta (NumeroComplejo a){
         NumeroComplejo x= new NumeroComplejo();
        x.setparteReal(parteReal-a.parteReal);
        x.setparteImaginaria(parteImaginaria-a.parteImaginaria);
        return x;
    }
    public NumeroComplejo producto (NumeroComplejo a){
         NumeroComplejo x= new NumeroComplejo();
        x.setparteReal((parteReal*a.parteReal)-(parteImaginaria*a.parteImaginaria));
        x.setparteImaginaria((parteReal*a.parteImaginaria)+(parteImaginaria*a.parteReal));
        return x;
    }
    public NumeroComplejo division (NumeroComplejo a){
        NumeroComplejo x= new NumeroComplejo();
        x.setparteReal(((parteReal*a.parteReal)+(parteImaginaria*a.parteImaginaria))/(Math.pow(a.parteReal, 2)+Math.pow(a.parteImaginaria, 2)));
        x.setparteImaginaria(((parteImaginaria*a.parteReal)-(parteReal*a.parteImaginaria))/(Math.pow(a.parteReal, 2)+Math.pow(a.parteImaginaria, 2)));
        return x;
    }
}//Fin de la Clase