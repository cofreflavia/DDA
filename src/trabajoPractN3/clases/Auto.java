 /* 
 * Una empresa de alquiler de autos almacena la información de los autos que 
 * tiene para alquilar de la siguiente manera: cada auto está identificado 
 * por su patente (String de 6 caracteres), número registrado en el cuentaKilometro, 
 * modelo y si está disponible o no. Aplicando los conceptos vistos en teoría,
 * implementar en Java la clase Auto de acuerdo a las esquema UML dado. 
 */
package trabajoPractN3.clases;

/**
 *
 * @author Flavia
 */
public class Auto {
    // Atributos
    private int cuentaKm;
    private boolean disponible;
    private final String patente;
    private String modelo;

    // Constructores 
    public Auto(String pat) {
        if (pat.length()== 6) {
            patente = pat;
        }else{
            patente=pat.substring(0,6);
        }
        
        disponible = true;
    }

    public Auto(String pat, int km, String mod, boolean dispo) {
        if (pat.length()== 6) {
            patente = pat;
        }else{
            patente=pat.substring(0,6);
        }
        cuentaKm = km;
        modelo = mod;
        disponible = dispo;
    }

    // Modificadores 
    public void setCuentaKm(int km) {
        cuentaKm = km;
    }

    public void setModelo(String mod) {
        modelo = mod;
    }

    public void setDisponible(boolean disp) {
        disponible = disp;
    }

    // Observadores 
    public String getPatente() {
        return patente;
    }

    public int getCuentaKm() {
        return cuentaKm;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public String aCadena() {
        String texto;

        if (disponible) {
            texto = "Sí";
        } else {
            texto = "No";
        }

        return "Modelo: " + modelo + "\nPatente: " + patente + "\nDisponible: "
                + texto + "\nKilómetros recorridos: " + cuentaKm;
    }

    public boolean igual(Auto a) {
        return cuentaKm == a.cuentaKm && disponible == a.disponible
                && modelo.equalsIgnoreCase(a.modelo) && patente.equalsIgnoreCase(a.patente);
    }
}// Fin de la Clase


