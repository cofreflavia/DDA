package utiles;
public class Funciones {

public static int cadenaAEntero(String c)
{
        int aux=0;
        for (int i=0; i < c.length(); i++) {
                aux = aux*10 +((int)c.charAt(i)-48);
        }
        return aux;
}


public static int mcd(int x, int y){
    // calcula el maximo comun divisor entre a y b iterativo
    int a=x, b=y, aux=0;
    while (b != 0){
        aux = a;
        a = b;
        b = aux%b;
    }
    return a;
}

public static String enteroACadena(int n){
    int aux = n;
    String cadena = "";
    while (aux > 0){
        cadena = aux%10 + cadena;
        aux = aux / 10;
    }
    return cadena;
}

public static String aPuntoDecimal(double monto, int decimales){
    String cadena1 = enteroACadena((int)monto)+'.';
    float aux =(float) (monto - (int)monto);
    aux = aux * (float)Math.pow(10,decimales);
    cadena1=cadena1+enteroACadena((int)aux);
    return cadena1;
}



public static void main (String [] arg){
    int n=123;
    String c="2010";
    System.out.println(c+" a entero "+cadenaAEntero(c));
    System.out.println(n+" a cadena "+enteroACadena(n));
    System.out.println("123.3453 a cadena c/ 2 decimales "+ aPuntoDecimal(123.3453,4));
}
}
