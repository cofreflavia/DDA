/*
 *
 */
package trabajoPracticoN1;

import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class EJ4 {

    public static void main(String[] args) {
        //Este metodo permite ingresar un numero binario, el cual se muestra en su forma decimal, su complemento a uno y su complemento a dos
        String cadena;
        do{
        System.out.println("Ingrese un numero binario: ");
        cadena = TecladoIn.readLine();
        }while(!verificacionBinario(cadena));
        System.out.println("El numero binario " + cadena + " en notacion decimal es: " + binarioDecimal(cadena));
        System.out.println("El complemento a uno de " + cadena + " es: " + complemento1(cadena));
        System.out.println("El complemento a dos de " + cadena + " es: " + complemento2(cadena));
    }//Fin del algoritmo principal
    public static boolean verificacionBinario (String binario){
        /**Este metodo verifica si el numero ingresado corresponde efectivamente a un numero binario.
         * binario: representa el numero binario ingresado como parametro formal
         */
        int i, longBinario=binario.length();
        boolean verificacion=true;
        for(i=0; i<longBinario;i++){
            if(binario.charAt(i)!='1'&& binario.charAt(i)!='0'){
                verificacion=false;
                i=longBinario;
            }
            
        }
        return verificacion;
    }//Fin del modulo verificacionBinario

    public static double binarioDecimal(String binario) {
        /**Este metodo transforma el numero de binario a notacion decimal
         * binario: representa el numero binario como una cadena de caracteres.
         */
        int longitudBinario, i, expPotencia;
        double resultado=0;
        longitudBinario = binario.length();
        expPotencia = longitudBinario - 1;
        for (i = 0; i < longitudBinario; i++) {
            if (binario.charAt(i) == '1') {
                resultado += Math.pow(2, expPotencia);
            }
            expPotencia--;
        }
        return resultado;
    }//Fin del modulo binarioDecimal

    public static String complemento1(String binario) {
        /**Este metodo transforma el numero binario a complemento a uno.
         * binario: representa el numero binario como una cadena de caracteres.
         */
        int i, longBinario;
        String resultado="";
        longBinario = binario.length();

        for (i = 0; i < longBinario; i++) {

            if (binario.charAt(i) == '1') {
                resultado += '0';
            } else {
                resultado += '1';
            }
        }

        return resultado;
    }//Fin del modulo complemento1

    public static String complemento2(String binario) {
        /**Este metodo transforma el numero binario a complemento a dos.
         * binario: representa el numero binario como una cadena de caracteres.
         */
        int i, longBinario;
        String cadenaNueva="";
        longBinario=binario.length();

        for (i = (longBinario - 1); i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                cadenaNueva = complemento1(binario.substring(0, i))+ binario.substring(i);
                i = -1;
            }
        }
        return (cadenaNueva);
    }//Fin del modulo complemento2

}//Fin del programa

