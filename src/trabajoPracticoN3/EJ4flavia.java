/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN3;
import utiles.TecladoIn;
import java.util.Random;
/**
 *
 * @author Flavia
 */
public class EJ4flavia {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] expediente = new int[12][15];

        // genero el expediente con valores aleatorios entre el 1 y 50 
        for (int i = 0; i < expediente.length; i++) {
            for (int j = 0; j < expediente[0].length; j++) {
                expediente[i][j] = r.nextInt(101);
            }
        }
        menu(expediente);
    }
    public static void mostrarExpediente(int[][] expediente) {
        System.out.println("2000\t2001\t2002\t2003\t2004\t2005\t2006\t2007\t2008\t2009\t2010\t2011\t2012\t2013\t2014");
        for (int i = 0; i < expediente.length; i++) {
            for (int j = 0; j < expediente[0].length; j++) {
                System.out.printf("%4d\t", expediente[i][j]);
            }
            System.out.println();
        }
    }
    public static int posAñoEnFila(int año) {
        int[] años = {2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014};
        int i, posicion;
        boolean encontrado;
        i = 0;
        posicion = -1;
        encontrado = false;
        while (i < años.length && !encontrado) {
            if (año == años[i]) {
                posicion = i;
                encontrado = true;
            } else {
                i++;
            }
        }
        return posicion;
    }
        public static int sumaExpedientesEnAño(int[][] expediente, int año) {
        int i, suma = 0;
        for (i = 0; i < expediente.length; i++) {
            suma += expediente[i][año];
        }
        return suma;
    }
    public static double promedioDelAño(int[][] expediente, double suma) {
        return suma / expediente.length;
    }
    public static int mesMasExpedientes(int[][] expediente) {
        int mayorMes, i, posicionMes;

        mayorMes = sumaExpedientesDelMes(expediente, 0);
        posicionMes = 0;

        for (i = 1; i < expediente.length; i++) {
            if (mayorMes < sumaExpedientesDelMes(expediente, i)) {
                mayorMes = sumaExpedientesDelMes(expediente, i);
                posicionMes = i;
            }
        }

        return posicionMes;
    }
    public static int sumaExpedientesDelMes(int[][] expediente, int mes) {
        int suma, j;
        suma = 0;
        for (j = 0; j < expediente[0].length; j++) {
            suma += expediente[mes][j];
        }

        return suma;
    }
    public static String elMesEs(int posicionDelMes) {
        String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};

        return mes[posicionDelMes];
    }
    public static int mesMenosExpedientes(int[][] expediente) {
        int menorMes, i, posicionMes;

        menorMes = sumaExpedientesDelMes(expediente, 0);
        posicionMes = 0;

        for (i = 1; i < expediente.length; i++) {
            if (menorMes > sumaExpedientesDelMes(expediente, i)) {
                menorMes = sumaExpedientesDelMes(expediente, i);
                posicionMes = i;
            }
        }
        return posicionMes;
    }
    public static int[] mostrarProduccionMensualDelAño(int [][] expediente, int año){
        int [] añoParticular=new int [12]; 
        for (int i = 0; i < expediente[0].length; i++) {
            System.out.println(añoParticular[i]=expediente[i][año]);
        }
        return añoParticular;
    }
    public static void mostrarAño(int[] añoConMeses) {
        System.out.println("ENERO\tFEBRERO\tMARZO\tABRIL\tMAYO\tJUNIO\tJULIO\nAGOSTO\tSEPTIEMBRE\tOCTUBRE\tNOVIEMBRE\tDICIEMBRE");
        for (int i = 0; i < añoConMeses.length; i++) {
            System.out.printf("%4d\t", añoConMeses[i]);
        }
    }
    
    public static void menu(int[][] expediente) {
        int opcion, mes, indice1, indice2, M, X;

        do {
            System.out.println("1: Mostrar tabla de expedientes.");
            System.out.println("2: Suma de expedientes en un año.");
            System.out.println("3: Promedio de expedientes en un año.");
            System.out.println("4: Calcular mes con mayor cantidad de expedientes.");
            System.out.println("5: Calcular mes con menor cantidad de expedientes.");
            System.out.println("6: Mostrar la producción mensual de un año.");
            System.out.println("7: Obtener la mediana.");
            System.out.println("8: Varianza de expedientes procesados.");
            System.out.println("9: Años para los cuales el desvío standar es superior a M.");
            System.out.println("10: Promedio de expedientes en un mes entre 2000-2014.");
            System.out.println("11: Promedio entre dos años.");
            System.out.println("12: Cantidad de meses para los cuales se procesaron más de X expedientes en un año.");
            System.out.println("13: Cantidad de meses para los cuales se procesaron más de X expedientes en todos los años.");
            System.out.println("14: Determina para un año X si se procesaron más de Y expedientes.");
            System.out.print("Ingrese opción, 0 para terminar: ");
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 1:
                    mostrarExpediente(expediente);
                    break;
                case 2:
                    indice1 = ingresarAñoBuscaPosicion();
                    System.out.println("La suma es " + sumaExpedientesEnAño(expediente, indice1));
                    break;
                case 3:
                    indice1 = ingresarAñoBuscaPosicion();
                    System.out.printf("El promedio de expedientes es %.2f%n", promedioDelAño(expediente, sumaExpedientesEnAño(expediente, indice1)));
                case 4:
                    System.out.println("El mes con mayor cantidad de expedientes fue " + elMesEs(mesMasExpedientes(expediente)));
                    break;
                case 5:
                    System.out.println("El mes con menor cantidad de expedientes fue " + elMesEs(mesMenosExpedientes(expediente)));
                    break;
                case 6:
                    indice1 = ingresarAñoBuscaPosicion();
                    mostrarAño(mostrarProduccionMensualDelAño(expediente, indice1));break;
//                case 7:
//                    indice1 = ingresarAñoBuscaPosicion();
//                    System.out.printf("La mediana es %.2f%n", mediana(expediente, indice1));
//                case 8:
//                    indice1 = ingresarAñoBuscaPosicion();
//                    System.out.printf("La varianza es %.2f%n", varianza(expediente, indice1));
//                    break;
//                case 9:
//                    System.out.print("Ingrese parámetro M: ");
//                    M = TecladoIn.readLineInt();
//                    desviosMayores(expediente, M);
//                    break;
//                case 10:
//                    System.out.print("Ingrese mes para calcular el promedio de expedientes: ");
//                    mes = TecladoIn.readLineInt();
//                    if (mes >= 1 && mes <= 12) {
//                        System.out.printf("El promedio de expedientes es %.2f%n", promedioPorMes(expediente, sumaExpedientesPorMes(expediente, mes - 1)));
//                    } else {
//                        System.out.println("Mes inválido. Debe estar entre 1 y 12.");
//                    }
//                    break;
//                case 11:
//                    System.out.print("Primer año: ");
//                    indice1 = ingresarAñoBuscaPosicion();
//                    System.out.print("Segundo año: ");
//                    indice2 = ingresarAñoBuscaPosicion();
//                    System.out.printf("El promedio entre ambos años es %.2f%n",
//                    (promedioDelAño(expediente, sumaExpedientesEnAño(expediente, indice1)) + promedioDelAño(expediente, sumaExpedientesEnAño(expediente, indice2))) / 2.0);
//                    break;
//                case 12:
//                    indice1 = ingresarAñoBuscaPosicion();
//                    System.out.print("Ingrese cantidad de expedientes: ");
//                    X = TecladoIn.readLineInt();
//                    System.out.println("Cantidad de meses: " + cantidadExpedientesPorAño(expediente, indice1, X));
//                    break;
//                case 13:
//                    System.out.print("Ingrese cantidad de expedientes: ");
//                    X = TecladoIn.readLineInt();
//                    System.out.println("Cantidad de meses: " + cantidadExpedientesTotal(expediente, X));
//                    break;
//                case 14:
//                    indice1 = ingresarAñoBuscaPosicion();
//                    System.out.print("Ingrese cantidad de expedientes: ");
//                    X = TecladoIn.readLineInt();
//                    if (cantidadExpedientesPorAño(expediente, indice1, X) > 0) {
//                        System.out.println("Existen expedientes que cumplen con los requisitos especificados.");
//                    } else {
//                        System.out.println("No hay expedientes.");
//                    }
//                    break;
                default:
                    System.out.println("\nOpción incorrecta. Vuelva a ingresar");
                    break;
            }
        } while (!(opcion>=1&&opcion<=14));
    }
    public static int ingresarAñoBuscaPosicion() {
        //Este metodo permite ingresar el año y llama al metodo posAñoEnFila buscando la poscion del año en la fila de la tabla
        int año;
        do{
        System.out.print("Ingrese el año: ");
        año = TecladoIn.readLineInt();
        if(!(año>=2000 && año<=2014)){
            System.out.println("Año invalido. RECUERDE del 2000 al 2014");
        }
        }while(!(año>=2000 && año<=2014));
        return posAñoEnFila(año);
    }
}
