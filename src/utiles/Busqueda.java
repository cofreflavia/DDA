/*
 * libreria de los metodos de busqueda vistos
 */
package utiles;

/**
 *
 * @author Flavia
 */
public class Busqueda {

    public static int busquedaSecuencial(int[] a, int nro) {
        int posicion, i, longArreglo;
        boolean encontrado;
        
        posicion=-1;
        i=0;
        encontrado = false;
        longArreglo=a.length;

        while (!encontrado && i <longArreglo) {
            if (a[i] == nro) {
                encontrado = true;
                posicion = i;
            } else {
                i++;
            }
        }
        return posicion;
    }

    public static int busquedaBinaria(int[] a, int k) {
        int inicio, fin, resultado, medio;
        
        inicio=0;
        fin=a.length-1;
        resultado=-1;
        
        while(inicio<=fin){
            medio=(inicio+fin)/2;
            if (k==a[medio]) {
                resultado=medio;
                inicio=fin+1;
            }else{
                if (k<a[medio]) {
                    fin=medio-1;//intercambiar esta linea de codigo por la 48 para recibir un arreglo ordenado decreciente
                }else{
                    inicio=medio+1;//48
                }
            }
        }
        return resultado;
    }

}
