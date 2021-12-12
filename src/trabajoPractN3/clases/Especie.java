package trabajoPractN3.clases;

public class Especie {

// Atributos
    private String nombre;
    private int poblacion;
    private double tasaDeCrecimiento; // es el promedio anual y está en punto decimal

// Constructoras
    public Especie() {
        nombre = null;
        poblacion = 0;
        tasaDeCrecimiento = 0.0;
    }

    public Especie(String n, int p, double t) {
        nombre = n;
        poblacion = p;
        tasaDeCrecimiento = t;
    }
//Observadoras

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public double getTasaDeCrecimiento() {
        return this.tasaDeCrecimiento;
    }

    public String aCadena() {
        return nombre + " Poblacion: " + poblacion + " Tasa anual: " + tasaDeCrecimiento;
    }

    public boolean equals(Especie e) {
        return nombre.equalsIgnoreCase(e.getNombre())
                && poblacion == e.getPoblacion()
                && Math.abs(tasaDeCrecimiento - e.getTasaDeCrecimiento()) < 0.001;

    }
//Modificadoras

    public void setNombre(String n) {
        nombre = n;
    }

    public void setPoblacion(int p) {
        poblacion = p;
    }

    public void setTasaDeCrecimiento(double t) {
        this.tasaDeCrecimiento = t;
    }
//Propia del tipo

    public int poblacionProyectada(int anios) {
        int poblacionAnual;
        int i;
        i = 1;
        poblacionAnual = (int) Math.round(this.poblacion + (this.poblacion * this.tasaDeCrecimiento / 100.0));

        while (i < anios) {
            poblacionAnual = poblacionAnual + (int) Math.round(poblacionAnual * this.tasaDeCrecimiento / 100.0);
            i++;
        }

        return poblacionAnual;
    }

}// Fin de la Clase
