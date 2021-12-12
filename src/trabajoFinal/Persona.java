/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoFinal;

/**
 *
 * @author Flavia
 */
public class Persona {
    private CuitCuil cuitcuil;
    private String identificacion;
    private String domicilio;
    private int nroDomicilio;
    private String codigoPostal;
    private String provincia;

    public Persona() {

    }

    public Persona(CuitCuil cc, String nom, String dom, int nro, String cod, String prov) {
        cuitcuil = cc;
        identificacion = nom;
        domicilio = dom;
        nroDomicilio = nro;
        codigoPostal = cod;
        provincia = prov;
    }

    public String toString() {
        return "Apellido y nombre o razón social: " + identificacion + "\nCUIT: " + cuitcuil.getTipo() + "-" + cuitcuil.getDNI() + "-"
                + cuitcuil.getVerificador() + "\nDomicilio: " + domicilio + "\nNúmero del domicilio: " + nroDomicilio
                + "\nCódigo Postal: " + codigoPostal + "\nProvincia: " + provincia + "\n";
    }

    public CuitCuil getCuitCuil() {
        return cuitcuil;
    }

    public String getRazonSocial() {
        return identificacion;
    }

    public String getApellido() {
        String apellido;
        int pos, longitud;

        pos = 0;
        longitud = identificacion.length() - 1;
        while (identificacion.charAt(pos) != ' ' && pos < longitud) {
            pos++;
        }

        apellido = identificacion.substring(0, pos);

        return apellido;
    }

    public int getNroDomicilio() {
        return nroDomicilio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }
}
