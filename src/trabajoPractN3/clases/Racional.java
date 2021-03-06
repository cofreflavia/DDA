/*
 * Implementar el TDA Racional respetando la definición dada en la guía.
 */
package trabajoPractN3.clases;

/**
 *
 * @author Flavia
 */
public class Racional {

    // Atributos

    private int numerador;
    private int denominador;

    // Constructores 
    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Racional(int n, int d) {
        numerador = n;
        denominador = d;

        if (denominador == 0) { // no permitir denominadores nulos 
            denominador = 1;
        }
    }

    // Observadores 
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public double pasarADouble() {
        return (double) numerador / denominador;
    }

    public String aCadena() {
        return numerador + "/" + denominador;
    }

    public boolean igual(Racional r) {
        return numerador == r.numerador && denominador == r.denominador;
    }

    // Modificadores 
    public void setNumerador(int n) {
        numerador = n;
    }

    public void setDenominador(int d) {
        if (d > 0) {
            denominador = d;
        }
    }

    // Propias del tipo 
    public Racional sumar(Racional r) {
        Racional c;
        int denominadorSuma, n1, n2;

        denominadorSuma = denominador * r.denominador;
        n1 = numerador * (denominadorSuma / denominador);
        n2 = r.numerador * (denominadorSuma / r.denominador);

        c = new Racional(n1 + n2, denominadorSuma);

        return c;
    }

    public Racional restar(Racional r) {
        int resto;
        Racional c;

        resto = denominador - r.denominador;

        if (resto == 0) {
            c = null;
        } else {
            c = new Racional(numerador - r.numerador, resto);
        }

        return c;
    }

    public Racional multiplicar(Racional r) {
        Racional c;

        c = new Racional(numerador * r.numerador, denominador * r.denominador);

        return c;
    }

    public Racional dividir(Racional r) {
        Racional c = r;

        if (r.denominador > 0) {
            c = new Racional(numerador * r.denominador, denominador * r.numerador);
        }

        return c;
    }

    public void simplificar() {
        int mcd;

        mcd = mcd(numerador, denominador);
        numerador = numerador / mcd;
        denominador = denominador / mcd;

        if (denominador == 1) {
            System.out.println(numerador);
        } else {
            System.out.println(numerador + "/" + denominador);
        }
    }

    /**
     * Calcula el máximo común divisor entre dos números utilizando el algoritmo
     * de Euclides.
     *
     * @param a numerador
     * @param b denominador
     * @return máximo común divisor entre a y b
     */
    private int mcd(int a, int b) {
        int tmp;

        while (b != 0) {
            tmp = b;
            b = a % b;

            a = tmp;
        }

        return a;
    }
}// Fin de la Clase
