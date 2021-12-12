package trabajoPractN3.test;

import trabajoPractN3.clases.Especie;
import utiles.TecladoIn;

public class TestEspecie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Especie[] especie;
        int cantidad, opcion, posicion;
        System.out.print("Cuantas especies va a cargar?: ");
        cantidad = TecladoIn.readLineInt();
        especie = new Especie[cantidad];
        cargarEspecie(especie);
        do {
            opcion = menu();
            switch (opcion) {
                case 0:;break;
                case 1:
                    mostrarEspecie(especie);
                    break;
                case 2:
                    do {
                        System.out.println("-------------------------------------------MODIFICAR--------------------------------------");
                        System.out.println("0. Salir    1. Nombre de la especie     2. Poblacion de la especie  3. Tasa de Crecimiento");
                        System.out.println("------------------------------------------------------------------------------------------");
                        opcion = TecladoIn.readLineInt();
                        switch (opcion) {
                            case 0:;
                                break;
                            case 1:
                                posicion = buscarEspecie(especie);
                                if (posicion != -1) {
                                    System.out.print("Nuevo Nombre: ");
                                    String nuevoNombre = TecladoIn.readLine();
                                    especie[posicion].setNombre(nuevoNombre);
                                } else {
                                    System.out.println("Especie no encontrada");
                                }
                                ;
                                break;
                            case 2:
                                posicion = buscarEspecie(especie);
                                if (posicion != -1) {
                                    System.out.print("Nuevo Valor de Poblacion: ");
                                    int nuevaPoblacion = TecladoIn.readLineInt();
                                    especie[posicion].setPoblacion(nuevaPoblacion);
                                } else {
                                    System.out.println("Especie no encontrada");
                                }
                                ;
                                break;
                            case 3:
                                posicion = buscarEspecie(especie);
                                if (posicion != -1) {
                                    System.out.print("Nuevo Valor de Tasa de Crecimiento: ");
                                    double nuevaTasa = TecladoIn.readLineDouble();
                                    especie[posicion].setTasaDeCrecimiento(nuevaTasa);
                                } else {
                                    System.out.println("Especie no encontrada");
                                }
                                ;
                                break;
                            default:
                                System.out.println("Opcion Incorrecta");
                                ;
                                break;
                        }
                    } while (opcion != 0);
                    opcion = 2;
                    ;
                    break;
                case 3:
                    int e1, e2;
                    do {
                        e1 = buscarEspecie(especie);
                        if (e1 == -1) {
                            System.out.println("Especie no encontrada repita");
                        }
                    } while (e1 == -1);

                    do {
                        e2 = buscarEspecie(especie);
                        if (e2 == -1) {
                            System.out.println("Especie no encontrada repita");
                        }
                    } while (e2 == -1);
                    if (!especie[e1].equals(especie[e2])) {
                        System.out.println("La primera especie va a superar "
                                + "a la segunda especie en "
                                + calculaCrecimiento(especie[e1], especie[e2]) + " años");
                    } else {
                        System.out.println("Especies iguales");
                    }
                    ;
                    break;
                case 4:
                    int e3 = buscarEspecie(especie);
                    if (e3 != -1) {
                        System.out.print("Ingrese la cantidad de años a proyectar: ");
                        int años = TecladoIn.readLineInt();
                        System.out.println("La poblacion será de: " + especie[e3].poblacionProyectada(años));
                    } else {
                        System.out.println("Especie no encontrada");
                    }
                    ;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;

            }

        } while (opcion != 0);
    }

    private static String ingresarNombre() {
        String esp;
        System.out.print("Ingrese el nombre de la especie: ");
        esp = TecladoIn.readLine();
        return esp;
    }

    private static int buscarEspecie(Especie[] arreglo) {
        String ejemplar = ingresarNombre();
        int pos = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].getNombre().equalsIgnoreCase(ejemplar)) {
                pos = i;
                i = arreglo.length;
            }
        }
        return pos;
    }

    public static int menu() {
        int opcion;
        System.out.println("-----------------------MENU-----------------------------------------");
        System.out.println("0. SALIR");
        System.out.println("1. Mostrar las Especies y sus detalles");
        System.out.println("2. Modificar algun detalle de la Especie");
        System.out.println("3. Calcular en cuantos años una especie superará a otra en poblacion");
        System.out.println("4. Poblacion Proyectada ");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Ingresar:  ");
        opcion = TecladoIn.readLineInt();
        return opcion;
    }

    public static void cargarEspecie(Especie[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = leerEspecie();
        }
    }

    private static Especie leerEspecie() {
        Especie e = new Especie();

        System.out.print("Nombre de la especie: ");
        String nom = TecladoIn.readLine();
        System.out.print("Poblacion actual: ");
        int pob = TecladoIn.readLineInt();
        System.out.print("Tasa anual de crecimiento: ");
        double tasa = TecladoIn.readLineDouble();
        e.setNombre(nom);
        e.setPoblacion(pob);
        e.setTasaDeCrecimiento(tasa);
        return e;
    }

    private static void mostrarEspecie(Especie[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i].aCadena());
            System.out.println("");
        }

    }

    private static int calculaCrecimiento(Especie x, Especie y) {
        // calcula la diferencia en anios entre las tasas de crecimiento de ambas especies
        int anios = 0;
        int p1 = x.getPoblacion();
        int p2 = y.getPoblacion();
        while (p1 <= p2 && anios < 100) {
            p1 = p1 + (int) (p1 * x.getTasaDeCrecimiento());
            p2 = p2 + (int) (p2 * y.getTasaDeCrecimiento());
            anios++;
        }
        return anios;
    }
}
