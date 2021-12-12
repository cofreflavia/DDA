/**
 * Definir y especificar el TDA Ingrediente que guarda una descripción de un
 * ingrediente y la cantidad medida en tazas (por ejemplo: harina, ¼ taza) que
 * se utilizará en una receta de cocina.
 */
package trabajoPractN3.clases;

public class Ingrediente {

    // ATRIBUTOS

    private String ingrediente;
    private Racional cantidad;
    private String unidadDeMedida;

    // CONSTRUCTORAS
    public Ingrediente() {
        ingrediente = null;
        cantidad = null;
        unidadDeMedida = null;
    }

    // MODIFICADORAS
    public void setIngrediente(String ing) {
        this.ingrediente = ing;
    }

    public void setCantidad(Racional r) {
        this.cantidad = r;
    }

    public void setUnidadDeMedida(String unid) {
        this.unidadDeMedida = unid;
    }

    //OBSERVADORAS
    public String getIngrediente() {
        return this.ingrediente;
    }

    public Racional getCantidad() {
        return this.cantidad;
    }

    public String getUnidadDeMedida() {
        return this.unidadDeMedida;
    }

    public String aCadena() {
        return ("Ingrediente: " + this.getIngrediente()
                + " Cantidad: " + this.getCantidad().aCadena()
                + " " + this.getUnidadDeMedida() + "\n");
    }

    public static void main(String[] args) {
        Ingrediente i1 = new Ingrediente();
        i1.setIngrediente("Harina");
        Racional r = new Racional(1, 2);
        i1.setCantidad(r);
        i1.setUnidadDeMedida("taza");
        System.out.println(i1.aCadena());
    }

}
