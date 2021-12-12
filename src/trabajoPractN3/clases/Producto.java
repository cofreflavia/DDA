package trabajoPractN3.clases;

public class Producto {
//Atributos

    private String nombre;
    private String marca;
    private int cantidadStock;
    private final String[] ingredientes;
//Constructores 

    public Producto(String n, String m, int cs, String[] ingre) {
        nombre = n;
        marca = m;
        cantidadStock = cs;
        ingredientes = ingre;
    }
//Observadores 

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        //analice en este caso porqué se usa this? es necesario?
        //En este caso no es necesario utilizar this ya que no exite un parametro formal con el mismo nombre
        return this.marca;
    }
    /* Implemente los observadores que faltan
     + getCantidadSock(): int 
     + getIngrediente(int pos): String
     + toString(): String 
     + equals(Producto p): boolean 
     */

    public int getCantidadStock() {
        return cantidadStock;
    }

    public String getIngredientes(int pos) {
        return ingredientes[pos];
    }

    public String aCadena() {
        return ("Producto: " + getNombre() + " Marca: " + getMarca() + " Cantidad de Stock: "
                + getCantidadStock());

    }

    public boolean equals(Producto p) {
        return (nombre.equalsIgnoreCase(p.nombre) && marca.equalsIgnoreCase(p.marca));
    }

//Modificadores 
    public void setNombre(String nombre) {
        //analice en este caso porqué se usa this? es necesario?
        //Es necesario debido a que si no pusieramos la referencias this
        //el atributo primitivo nombre se confundiria con la variable que esta
        //como parametro formal del metodo el cual tiene el mismo nombre
        this.nombre = nombre;
    }

    /* Implemente los modificadores que faltan
     + setMarca(String marca): void 
     + setCantidadSock(int cantidad): void
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCantidadStock(int cantidad) {
        this.cantidadStock = cantidad;
    }

    public void setIngredientes(String ing, int pos) {
        
            ingredientes[pos] = ing;
        
    }
//Propias del tipo 

    public boolean tieneIngrediente(String ingrediente) {
        boolean respuesta = false;
        //implemente el método
        for (int i = 0; i < this.ingredientes.length; i++) {
            if ((getIngredientes(i)).equalsIgnoreCase(ingrediente)) {
                respuesta = true;
                i = this.ingredientes.length;
            }
        }
        return respuesta;
    }


    public String listarIngredientes() {
        String ingredien = "Ingredientes: ";
        for (int i = 0; i < ingredientes.length; i++) {
            ingredien += getIngredientes(i) + "-";
        }
        return ingredien;
    }

// Implemente los métodos que crea necesarios...
}
