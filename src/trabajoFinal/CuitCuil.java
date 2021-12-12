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
public class CuitCuil {
    
    private final int tipo;
    private final long DNI;
    private final int verificador;

    public CuitCuil(int tipo, long DNI) {
        this.tipo = tipo;
        this.DNI = DNI;
        verificador = modulo11();
    }

    /**
     * Calcula la cantidad de dígitos que tiene un número.
     *
     * @param numero valor de entrada
     * @return número de digitos
     */
    private int cantidadDigitos(long numero) {
        int contador;

        contador = 0;
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }

        return contador;
    }

    /**
     * Este módulo invierte el módulo del DNI y devuelve el valor de la posición
     * indicada en el parámetro.
     *
     * @param pos posicion deseada
     * @return valor de la posición
     */
    private int digito(int pos) {
        String valor = DNI + "";
        String valorInvertido = "";

        for (int i = 0; i < valor.length(); i++) {
            valorInvertido = valor.charAt(i) + valorInvertido;
        }

        return Integer.parseInt(valorInvertido.substring(pos, pos + 1));
    }

    /**
     * Genera el número verificador.
     *
     * @return verificador
     */
    private int modulo11() {
        int control, suma, longitudDNI, mod, cociente;

        suma = 0;
        longitudDNI = cantidadDigitos(DNI);
        for (int i = 0; i < longitudDNI; i++) {
            suma = digito(i) * (i % 6 + 1) + suma;
        }

        mod = suma % 11;
        cociente = suma / 11;

        switch (mod) {
            case 0:
                control = 0;
                break;
            case 1:
                control = cociente % 10 + cociente / 10;
                break;
            default:
                control = 11 - mod;
                break;
        }

        return control;
    }

    public boolean menorQue(CuitCuil x) {
        return Long.parseLong(tipo + "" + DNI) < Long.parseLong(x.tipo + "" + x.DNI);
    }

    public boolean menorIgualQue(CuitCuil x) {
        return Long.parseLong(tipo + "" + DNI) <= Long.parseLong(x.tipo + "" + x.DNI);
    }

    public int getTipo() {
        return tipo;
    }

    public long getDNI() {
        return DNI;
    }

    public int getVerificador() {
        return verificador;
    }

    public boolean esIgualA(CuitCuil x) {
        return tipo == x.tipo && DNI == x.DNI;
    }
}
