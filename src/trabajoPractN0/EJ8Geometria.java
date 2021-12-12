/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN0;

import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class EJ8Geometria {

    public static void main(String[] args) {
        int opcion, lado1, lado2;
        System.out.print("1 Cuadrado\n2 Rectangulo\n3 Triangulo Equilatero\n4 Circulo\nIngrese la opcion:");
        opcion = TecladoIn.readLineInt();
        switch (opcion) {
            case 1:
                System.out.print("CUADRADO\nIngrese la longitud del lado:");
                lado1 = TecladoIn.readLineInt();
                switch (calculo()) {
                    case 1:
                        System.out.println("perimetro=" + calcularPerimetroCuadrado(lado1));
                        ;
                        break;
                    case 2:
                        System.out.println("area=" + calcularAreaCuadrado(lado1));
                        break;
                    default:
                        System.out.println("Opcion Incorrecta");
                }
                ;
                break;
            case 2:
                System.out.println("RECTANGULO\nIngrese las longitudes de los lados:");
                lado1 = TecladoIn.readLineInt();
                lado2 = TecladoIn.readLineInt();
                switch (calculo()) {
                    case 1:
                        System.out.println("perimetro=" + calcularPerimetroRectangulo(lado1, lado2));
                        ;
                        break;
                    case 2:
                        System.out.println("area=" + calcularAreaRectangulo(lado1, lado2));
                        break;
                    default:
                        System.out.println("Opcion Incorrecta");
                        ;
                        break;
                }
                ;
                break;
            case 3:
                System.out.print("TRIANGULO EQUILATERO\nIngrese la longitud del lado:");
                lado1 = TecladoIn.readLineInt();
                switch (calculo()) {
                    case 1:
                        System.out.println("perimetro=" + calcularPerimetroTriangulo(lado1));
                        ;
                        break;
                    case 2:
                        System.out.println("area=" + calcularAreaTriangulo(lado1));
                        break;
                    default:
                        System.out.println("Opcion Incorrecta");
                        ;
                        break;
                }
                ;
                break;
            case 4:
                System.out.print("CIRCULO\nIngrese el radio:");
                lado1 = TecladoIn.readLineInt();
                switch (calculo()) {
                    case 1:
                        System.out.println("perimetro=" + calcularPerimetroCirculo(lado1));
                        ;
                        break;
                    case 2:
                        System.out.println("area=" + calcularAreaCirculo(lado1));
                        break;
                    default:
                        System.out.println("Opcion Incorrecta");
                        break;
                }
                ;
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;

        }

    }

    public static int calculo() {
        int cal;
        System.out.println("Calcular:\n1 Perimetro\n2 Area");
        cal = TecladoIn.readLineInt();
        return (cal);
    }

    public static int calcularPerimetroCuadrado(int x) {
        return (4 * x);
    }

    public static int calcularAreaCuadrado(int x) {
        return (x * x);
    }

    public static int calcularPerimetroRectangulo(int x, int y) {
        return (2 * x + 2 * y);
    }

    public static int calcularAreaRectangulo(int x, int y) {
        return (x * y);
    }

    public static int calcularPerimetroTriangulo(int x) {
        return (3 * x);
    }

    public static double calcularAreaTriangulo(int x) {
        return (Math.pow(x, 2) * Math.sqrt(3) / 4);
    }

    public static double calcularPerimetroCirculo(int x) {
        return (2 * Math.PI * x);
    }

    public static double calcularAreaCirculo(int x) {
        return (Math.PI * Math.pow(x, 2));
    }

}
