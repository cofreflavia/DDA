/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN3;

import utiles.TecladoIn;

/**
 *
 * @author Flavia
 */
public class EJ1 {

    public static void main(String[] args) {
        //Este metodo invoca al metodo menu
        menu();
    }

    public static void menu() {
        //Este metodo invoca a cada uno de los modulos de las operaciones para matrices
        int opcion, escalar, fila, columna;
        String seguir;
        int [][] matriz1;
        int [][] matriz2;
        int[][] matriz = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        do {
            System.out.println("Ingrese la opcion de la operacion que desea efectuar:");
            System.out.println("1) Crear una matriz\n2) Mostrar la matriz\n3) Verificar si la matriz ingresada es cuadrada\n4) Verificar si la matriz es Triangular Superior\n5) Verificar si la matriz es Triangular Inferior\n6)Verificar si la matriz es Escalar\n7)Verificar si la matriz es Diagonal\n8)Suma de matrices\n9)Producto por un Escalar\n10)Transponer una matriz\n11)Sumar los elementos de una fila\n12)Sumar los elementos de una columna\n13)Multiplicacion de matrices");
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 1:
                    matriz=crearMatriz();break;
                case 2:
                    mostrarMatriz(matriz);break;
                case 3:
                    if (esMatrizCuadrada(matriz)) {
                        System.out.println("La matriz es cuadrada");
                    }else{
                        System.out.println("La matriz no es cuadrada");
                    };break;
                case 4:
                    if (esMatrizCuadrada(matriz)) {
                        if(esTriangularSuperior(matriz)){
                            System.out.println("La matriz es Triangular Superior");
                        }else{
                            System.out.println("La matriz no es Triangular Superior");
                        }
                    }else{
                        System.out.println("La matriz ingresada no es cuadrada por lo que no puede ser trinagular Superior");
                    };break;
                case 5:
                    if (esMatrizCuadrada(matriz)) {
                        if(esTriangularInferior(matriz)){
                            System.out.println("La matriz es Triangular Inferior");
                        }else{
                            System.out.println("La matriz no es Triangular Inferior");
                        }
                    }else{
                        System.out.println("La matriz ingresada no es cuadrada por lo que no puede ser trinagular Inferior");
                    };break;
                case 6:
                    if (esTriangularInferior(matriz) && esTriangularSuperior(matriz)){
                        if (esEscalar(matriz)) {
                       System.out.println("La matriz es Escalar");     
                        }else{
                            System.out.println("La matriz no es Escalar");
                        }
                    }else{
                        System.out.println("La matriz no es Escalar");
                    };break;
                case 7:
                    if (esDiagonal(matriz)) {
                        System.out.println("La matriz es diagonal");
                    }else{
                        System.out.println("La matriz no es diagonal");
                    }
                    ;break;
                case 8:
                    do{
                        System.out.println("RECUERDE QUE LAS MATRICES TIENEN QUE SER mxn\n1ra MATRIZ");
                        matriz1=crearMatriz();
                        System.out.println("2da MATRIZ");
                        matriz2=crearMatriz();
                    }while(matriz1.length!=matriz2.length && matriz1[0].length!=matriz2[0].length);
                    System.out.println("La suma de las matrices es: ");
                    mostrarMatriz(sumaMatrices(matriz1, matriz2));break;
                case 9:
                    System.out.print("Ingrese un escalar: ");
                    escalar=TecladoIn.readLineInt();
                    System.out.println("El producto de la matriz por el escalar es:");
                    mostrarMatriz(escalarPorMatriz(matriz, escalar));break;
                case 10:
                    System.out.println("La matriz transpuesta es: ");
                    mostrarMatriz(transponerMatriz(matriz));break;
                case 11:
                    System.out.println("de cual fila quiere realizar la suma de sus elementos");
                    fila=TecladoIn.readLineInt();
                    System.out.println("La suma de los elementos de la fila "+fila+" es de:"+sumaElemFila(matriz, fila));break;
                case 12:
                    System.out.println("de cual columna quiere realizar la suma de sus elementos");
                    columna=TecladoIn.readLineInt();
                    System.out.println("La suma de los elementos de la columna "+columna+" es de:"+sumaElemColum(matriz, columna));break;
                case 13:
                    do{
                        System.out.println("RECUERDE!! la primer matriz tiene que tener la misma cantidad de columnas que la cantidad de filas de la segunda matriz");
                        System.out.println("1ra MATRIZ mxn");
                        matriz1=crearMatriz();
                        System.out.println("2da MATRIZ nxo");
                        matriz2=crearMatriz();
                    }while(matriz1[0].length!=matriz2.length);
                    System.out.println("La multiplicacion entre las matrices es de: ");
                    mostrarMatriz(multiplicacionMatrices(matriz1, matriz2));break;
                default:
                    System.out.println("opcion incorrecta");break;
            }
            System.out.println("¿Desea realizar otra operaacion? si/no");
            seguir = TecladoIn.readLine();
        } while (seguir.equalsIgnoreCase("si"));
    }

    public static int[][] crearMatriz() {
        //Este metodo crea una matriz
        int cantFilas, cantColumnas;
        System.out.print("Ingrese la cantidad de filas de su matriz: ");
        cantFilas = TecladoIn.readLineInt();
        System.out.print("Ingrese la cantidad de columnas de su matriz: ");
        cantColumnas = TecladoIn.readLineInt();
        //Declaracion y Construccion de la matriz
        int[][] matriz = new int[cantFilas][cantColumnas];
        //Inicializando de la matriz
        for (int i = 0; i < cantFilas; i++) {
            System.out.println("Ingrese los elementos de la fila " + (i + 1));
            for (int j = 0; j < cantColumnas; j++) {
                matriz[i][j] = TecladoIn.readLineInt();
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        /**Este metodo muestra el arreglo o matriz creado en el modulo crearMatriz o muestra la matriz creada como defecto
         * matriz: es el arreglo o matriz ingresada como parametro
         */
        int cantFilas = matriz.length;
        int cantColumnas = matriz[0].length;
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantColumnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean esMatrizCuadrada(int [][]matriz){
        /**Este metodo verifica si la matriz ingresada como parametro es cuadrada retornando en dicho caso true
         * matriz: se trata de un arreglo de numeros enteros
         */
        return(matriz.length==matriz[0].length);
    }
    public static boolean esTriangularSuperior(int [][] matriz){
        /**Este metodo verifica si una matriz es triangular superior en dicho caso arroja true
         * matriz: es el arreglo o matriz de enteros ingresado como parametro
         */
        int fila=0, columna, cantFilas, cantColumnas;
        boolean esTriangSup=true;
        cantFilas=matriz.length;
        cantColumnas=matriz[0].length;
        while(fila<cantFilas && esTriangSup){
            columna=0;
            while(columna<cantColumnas && esTriangSup && fila>columna){
                if (matriz[fila][columna]!=0) {
                    esTriangSup=false;
                }
                columna++;
            }
            fila++;
        }
        return esTriangSup;
    }
    public static boolean esTriangularInferior(int [][] matriz){
        /**Este metodo verifica si una matriz es triangular inferior en dicho caso arroja true
         * matriz: es el arreglo o matriz de enteros ingresado como parametro
         */
        int fila=0, columna, cantFilas, cantColumnas;
        boolean esTriangInf=true;
        cantFilas=matriz.length;
        cantColumnas=matriz[0].length;
        while(fila<cantFilas && esTriangInf){
            columna=1;
            while(columna<cantColumnas && esTriangInf && fila<columna){
                if (matriz[fila][columna]!=0) {
                    esTriangInf=false;
                }
                columna++;
            }
            fila++;
        }
        return esTriangInf;
    }
    public static boolean esEscalar(int[][]matriz){
        /**Este metodo verifica si la matriz es escalar, es decir es triangular superior e inferior y su diagonal principal consta de numeros iguales
         * matriz: es el arreglo o matriz de enteros ingresado como parametro
         */
        int elemento=matriz[0][0], fila=1, columna=1;
        boolean esEscalar=true;
        while(esEscalar){
            if (elemento!=matriz[fila][columna]) {
                esEscalar=false;
            }
            fila++;
            columna++;
        }
        return esEscalar;
    }
    public static boolean esDiagonal(int [][]matriz){
    /**Este metodo verifica si la matriz es diagonal, es decir su diagonal principal consta de numeros distinto de cero
     * matriz: es el arreglo o matriz de enteros ingresados como parametros
     */
        return(esTriangularSuperior(matriz) && esTriangularInferior(matriz));
    }
    public static int[][] sumaMatrices(int [][]matriz1,int [][]matriz2){
        /**Este metodo realiza la suma de dos matrices
         * matriz1: es el primer arreglo o matriz de enteros ingresado como parametro
         * matriz2: es el segundo arreglo o matriz de enteros ingresado como parametro
         */
        int [][]sumaMatrices= new int [matriz1.length][matriz1[0].length];
        for (int i = 0; i <matriz1.length ; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                sumaMatrices[i][j]=matriz1[i][j]+matriz1[i][j];
            }
        }
        return sumaMatrices;
    }
    public static int[][] escalarPorMatriz(int[][]matriz, int escalar){
        /**Este metodo realiza el producto de la matriz por un escalar entero
         * matriz: es el arreglo o matriz de enteros ingresado como parametro
         * escalar: es un numero entero ingresado como paramtro
         */
        int[][]matrizPorEscalar=new int [matriz.length][matriz[0].length];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                matrizPorEscalar[fila][columna]=escalar*matriz[fila][columna];
            }
        }
        return matrizPorEscalar;
    }
    public static int[][] transponerMatriz (int[][] matriz){
        /**Este metodo se encarga de transponer una matriz
         * matriz: es el arreglo o matriz de enteros ingresada como parametro
         */
        int[][] transpuesta=new int [matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
              transpuesta[j][i]=matriz[i][j];  
            }
        }
        return transpuesta;
    }
    public static int sumaElemFila(int [][] matriz, int fila){
        /**Este metodo realiza la suma de los elemento de una fila determinada por el usuario
         * matriz: es el arreglo o matriz de enteros ingresada como parametro
         * fila: es la fila de la cual se obtendra la suma de sus elementos 
         */
        int sumaFila=0;
        for (int columna = 0; columna < matriz[0].length; columna++) {
            sumaFila+=matriz[fila-1][columna];
        }
        return sumaFila;
    }
    public static int sumaElemColum(int [][] matriz, int columna){
        /**Este metodo realiza la suma de los elemento de una columna determinada por el usuario
         * matriz: es el arreglo o matriz de enteros ingresada como parametro
         * columna: es la columna de la cual se obtendra la suma de sus elementos 
         */
        int sumaColum=0;
        for (int fila = 0; fila < matriz.length; fila++) {
            sumaColum+=matriz[fila][columna-1];
        }
        return sumaColum;
    }
    
    public static int[][] multiplicacionMatrices(int [][]matriz1,int [][]matriz2){
        /**Este metodo realiza la multiplicacion entre dos matrices
         * matriz1: es el primer arreglo o matriz de enteros ingresado como parametro
         * matriz2: es el segundo arreglo o matriz de enteros ingresado como parametro
         */
        int [][]multiMatrices= new int [matriz1.length][matriz2[0].length];
        int suma;
        for (int i = 0; i <matriz1.length ; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                suma=0;
                for (int k = 0; k < matriz2.length; k++) {
                     suma+=matriz1[i][k]*matriz2[k][j];
                }
               multiMatrices[i][j]=suma;
            }
        }
        return multiMatrices;
    }

}
            
