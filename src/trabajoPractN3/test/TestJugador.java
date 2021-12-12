/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractN3.test;

import utiles.TecladoIn;
import trabajoPractN3.clases.Jugador;

/**
 *
 * @author Flavia
 */
public class TestJugador {

    public static void main(String[] args) {
        Jugador[] jdores = new Jugador[10];
        inicializar(jdores);
        System.out.println(jdores[0].aCadena());
        System.out.println("Cargue el arreglo de jugadores");

        cargar(jdores);
        listar(jdores);

    }

    public static void inicializar(Jugador[] j) {
        for (int i = 0; i < j.length; i++) {
            j[i] = new Jugador(" ");
        }
    }

    public static void listar(Jugador[] j) {
        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i].aCadena());
        }
    }

    public static void cargar(Jugador[] j) {
        char fin;
        do {
            ingresar(j);
            System.out.println("terminar: s/n");
            fin = TecladoIn.readChar();
        } while (fin != 's');

    }

    public static void ingresar(Jugador[] ju) {
        Jugador j = new Jugador("");
        int p;
        boolean repetir;
        String nom;

        do {
            System.out.print("Nombre: ");
            nom=TecladoIn.readLine();
            System.out.println(nom);
            System.out.println("1");
            j.setNickname(nom);
            System.out.println("2");
            repetir = validarNick(ju, nom);
            System.out.println("3");

            if (!repetir) {
                System.out.println("Nombre duplicado");
            }
            
        } while (!repetir);
        
        j.setNickname(nom);

        System.out.println("Puntos:");
        for (int i = 0; i < 10; i++) {
            p = TecladoIn.readLineInt();
            j.setPuntos(p);
        }
        for (int i = 0; i < ju.length; i++) {
            if (ju[i].getNickname().equalsIgnoreCase(" ")) {
                ju[i] = j;
                i = ju.length;
            }
        }
    }

    public static boolean validarNick(Jugador[] jug, String n) {
        boolean valido = true;
        for (int i = 0; i < jug.length; i++) {
            if (jug[i].getNickname().equalsIgnoreCase(n)) {
                valido = false;
                i = jug.length;
            }
        }
        return valido;
    }

}
