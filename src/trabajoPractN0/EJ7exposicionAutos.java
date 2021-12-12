/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN0;

import utiles.TecladoIn;

/**
 *
 * @author alumno
 */
public class EJ7exposicionAutos {

    public static void main(String[] args) {//

        String patente, marca, color, seguir;
        int capacidad, añoFab, cantAutos = 0, a = 0, b = 0, c = 0, d = 0, cantidad = 0;
        double sumaCapacidad = 0;
        boolean mal;
        do {
            System.out.print("Ingrese patente: ");
            patente = TecladoIn.readLine();
            System.out.print("Ingrese año de fabricacion: ");
            añoFab = TecladoIn.readLineInt();
            System.out.print("Ingrese el color: ");
            color = TecladoIn.readLine();
            if (color.equalsIgnoreCase("rojo")) {
                cantidad++;
            }
            System.out.print("Ingrese la capacidad que tiene el auto: ");
            capacidad = TecladoIn.readLineInt();
            sumaCapacidad = sumaCapacidad + capacidad;
            cantAutos++;
            do {
                System.out.print("Solo en mayuscula, ingrese la marca del auto (FIAT, FORT, PEUGEOT, RENAULT): ");
                marca = TecladoIn.readLine();

                switch (marca) {
                    case "FIAT":
                        a++;
                        mal = false;
                        break;
                    case "FORT":
                        b++;
                        mal = false;
                        break;
                    case "PEUGEOT":
                        c++;
                        mal = false;
                        break;
                    case "RENAULT":
                        d++;
                        mal = false;
                        break;
                    default:
                        mal = true;
                        System.out.println("Ingreso mal la marca  ");

                }
            } while (mal);

            System.out.print("¿Desea continuar? si/no: ");
            seguir = TecladoIn.readLine();
        } while (seguir.equalsIgnoreCase("si"));

        System.out.println("La cantidad de autos rojos es: : " + cantidad);
        System.out.println("La capacidad de autos exhibidos es: " + EJ3.promedio(sumaCapacidad, cantAutos));
        System.out.println("La/s marca/s mas exhibida/s es/son: " + elMayor(a, b, c, d));
        
    }

    public static String elMayor(int a, int b, int c, int d) {
        int mayor;
        String auto;
        auto = "";
        mayor = 0;

        if (a > b && a > c && a > d) {
            mayor = a;
        } else {
            if (b > a && b > c && b > d) {
                mayor = b;
            } else {
                if (c > a && c > b && c > d) {
                    mayor = c;
                } else {
                    if (d > a && d > b && d > c) {
                        mayor = d;
                    }
                }
            }
        }
        if (mayor == a) {
            auto = "FIAT";
            if (mayor == b) {
                auto = "FIAT Y FORT";
                if (mayor == c) {
                    auto = "FIAT, FORT Y PEUGEOT";
                    if (mayor == d) {
                        auto = "FIAT,FORT,PEUGEOT Y RENAULT";
                    }
                } else {
                    if (mayor == d) {
                        auto = "FIAT, FORT Y RENAULT";
                    }
                }
            } else {
                if (mayor == c) {
                    auto = "FIAT Y PEUGEOT";
                    if (mayor == d) {
                        auto = "FIAT, PEUGEOT Y RENAULT";
                    }
                } else {
                    if (mayor == d) {
                        auto = "FORT Y RENAULT";
                    }
                }
            }
        }
        if (mayor == b) {
            auto = "FORT";
            if (mayor == c) {
                auto = "FORT Y PEUGEOT";
                if (mayor == d) {
                    auto = "FORT, PEUGEOT Y RENAULT";
                }
            } else {
                if (mayor == d) {
                    auto = "FORT Y RENAULT";
                }
            }
        }

        if (mayor == c) {
            auto = "PEUGEOT";
            if (mayor == d) {
                auto = "PEUGEOT Y RENAULT";
            }
        }

        if (mayor == d) {
            auto = "RENAULT";
        }
        System.out.println(mayor);

        return auto;
    }
}