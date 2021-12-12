package trabajoPractN3.test;

/**
 * Escribir un programa para probar la clase Ingrediente que defina un arreglo
 * que contenga la información de todos los ingredientes de una receta de
 * cocina.
 */
import trabajoPractN3.clases.Ingrediente;
import trabajoPractN3.clases.Racional;
import utiles.TecladoIn;
import utiles.Validaciones;
import utiles.Funciones;

public class Receta {

    public static void main(String[] args) {

        System.out.println("RECETA: cantidad de ingredientes? ");
        int cant = TecladoIn.readLineInt();

        Ingrediente[] arrReceta = new Ingrediente[cant];

        for (int i = 0; i < arrReceta.length; i++) {
            arrReceta[i] = cargaIngrediente();
        }
        System.out.println("RECETA:");

        for (int i = 0; i < arrReceta.length; i++) {
            System.out.print(arrReceta[i].aCadena());
        }
    }

    private static Ingrediente cargaIngrediente() {
        int numEntero = 0, denEntero = 0;
        String cadena, cadenaAux;

        Ingrediente ing = new Ingrediente();

        System.out.print("\nIngrediente: ");
        cadena = TecladoIn.readLineWord();
        ing.setIngrediente(cadena);

        boolean cargaOK = false;

        while (!cargaOK) {
            System.out.print("Cantidad (formato xx/xx): ");
            cadena = TecladoIn.readLine();

            if (Validaciones.esFraccion(cadena)) // es fraccion
            {
                cadenaAux = cadena.substring(0, cadena.indexOf("/"));
                numEntero = Funciones.cadenaAEntero(cadenaAux);
                cadenaAux = cadena.substring(cadena.indexOf("/") + 1);
                denEntero = Funciones.cadenaAEntero(cadenaAux);
                cargaOK = true;
            } else // es un numero entero
            if (Validaciones.esNumeroEntero(cadena)) {
                numEntero = Funciones.cadenaAEntero(cadena);
                denEntero = 1;
                cargaOK = true;
            } else {
                System.out.println("ERROR en el formato");
            }
        } //del while

        Racional r = new Racional(numEntero, denEntero);
        ing.setCantidad(r);

        System.out.print("Unidad de Medida: ");
        cadena = TecladoIn.readLineWord();
        ing.setUnidadDeMedida(cadena);

        return ing;
    }
}
