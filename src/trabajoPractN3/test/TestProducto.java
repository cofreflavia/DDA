package trabajoPractN3.test;

import utiles.Aleatorio;
import trabajoPractN3.clases.Producto;
import utiles.TecladoIn;

public class TestProducto {
    
    public static void main(String [] args){
        int opcion;
        boolean tiene;
        //declaracion del arreglo de productos
        Producto[] productos;
        //creacion del arreglo para que tenga capacidad para almacenar 100 productos
        productos=new Producto[5];
        cargarProductos(productos);
        System. out.println("Se realizó la carga de productos adecuadamente");
        System.out.println("Los productos en venta son: ");
        //Implementar e invocar a un modulo que muestra el arreglo de productos
        mostrarProductos(productos);
        do{
            opcion=menu();
            //implementar el switch para analizar la opcion elegida y hacer lo convenido
            switch(opcion){
                case 0:;break;
                case 1:mostrarProductos(productos);
                    ;break;
                case 2: 
                    String nbre=ingreseNombreDeProducto();
                int posicion=buscarProducto(productos, nbre);
                    if (posicion != -1) {
                        System.out.println("Producto Hallado!!!!!");
                        System.out.println("Detalles:");
                        System.out.println(productos[posicion].aCadena());
                        System.out.println(productos[posicion].listarIngredientes());
                    }else{
                        System.out.println("No exite el producto");
                    }
                ;break;
                case 3:
                    nbre=ingreseNombreDeProducto();
                    posicion=buscarProducto(productos, nbre);
                     if (posicion != -1) {
                         System.out.print("Ingrese el ingrediente: ");
                         nbre=TecladoIn.readLine();
                         tiene=productos[posicion].tieneIngrediente(nbre);
                         if (tiene) {
                             System.out.println("El producto SI contiene el ingrediente");
                         }else{
                             System.out.println("El producto NO contiene el ingrediente");
                         }
                     }else{
                         System.out.println("No existe el producto");
                     }
                ;break;
                case 4: nbre=ingreseNombreDeProducto();
                    posicion=buscarProducto(productos, nbre);
                    if (posicion != -1) {
                        do{System.out.println("-----------------------cambiar----------------------");
                            System.out.println("0.Salir  1.Marca 2.Cantidad de Stock 3.Ingredientes");
                            System.out.println("----------------------------------------------------");
                            System.out.print("Ingrese: ");
                        opcion=TecladoIn.readLineInt();
                        switch(opcion){
                            case 0:;break;
                            case 1: System.out.print("Nueva Marca: ");
                                nbre=TecladoIn.readLine();
                                productos[posicion].setMarca(nbre);
                                break;
                            case 2: System.out.print("Nueva Cantidad de Stock: ");
                                opcion=TecladoIn.readLineInt();
                                productos[posicion].setCantidadStock(opcion);
                                break;
                            case 3: System.out.println("Ingrese nuevos ingredientes:");
                                for (int i = 0; i <5 ; i++) {
                                    nbre=TecladoIn.readLine();
                                    productos[posicion].setIngredientes(nbre, i);
                                }
                            ;break;
                            default: System.out.println("Opcion Incorrecta");;break;
                        }
                        }while(opcion != 0);
                        opcion=1;
                    }else{ 
                        System.out.println("No existe el producto");
                    };break;
                default:
                        break;
            }
            
        }while(opcion !=0);
     
    }
    public static String ingreseNombreDeProducto(){
        System.out.print("Ingrese el producto: ");
                String n=TecladoIn.readLine();
                return n;
    }
    public static int buscarProducto(Producto[] pro, String n){
        int respuesta=-1;
        for (int i = 0; i < pro.length; i++) {
            if((pro[i].getNombre()).equalsIgnoreCase(n)){
                respuesta=i;
                i=pro.length;
            }
        }
        return respuesta;
    }
    public static void mostrarProductos(Producto [] prod){
            for (int i = 0; i < prod.length; i++) {
                System.out.println("");
                System.out.println((prod[i]).aCadena());
                System.out.println(prod[i].listarIngredientes());
                
            }
        }
    public static int menu(){
        int opcion;
        //implementar el menÃº de opciones y leer una opciÃ³n verificando que sea vÃ¡lida
        System.out.println("--------------------------MENU-------------------------------");
        System.out.println("0. Salir");
        System.out.println("1. Listar los Productos y detalles");
        System.out.println("2. Buscar Producto");
        System.out.println("3. Preguntar si un producto tiene un ingrediente");
        System.out.println("4. Cambiar marca/cantidad de stock/ingredientes de un producto");
        System.out.println("--------------------------------------------------------------");
        System.out.print("Ingrese: ");
        opcion=TecladoIn.readLineInt();
        return opcion;
    }
    
    public static void cargarProductos(Producto[] arreglo){
        //este modulo realiza la carga de los productos del arreglo
        //el usuario debe poder decidir si carga los 100 o solo algunos
        //Complete el cÃ³digo para poder realizar esta funcionalidad
       
        String[] nombres = {
            "budin",
            "pan lactal",
            "pizza",
            "milanesas",
            "galletitas",
            "empanadas",
            "fideos",
            "canelones",
            "puré instantaneo",
            "jugo",
            "pasta rellena"};
        String[] marcas ={
            "Exquisita",
            "La serenisima",
            "Tang",
            "Cepita",
            "Matarazzo",
            "Lenovo",
            "LG",
            "Pepsico",
            "Knorr"};
        String[] ingredientes = {
            "huevo",
            "lentejas",
            "sal",
            "harina",
            "pescado",
            "naranja",
            "sémola",
            "tomate",
            "queso",
            "cebolla",
            "papa",
            "ají",
            "choclo",
            "pan rallado",
            "espinaca",
            "ricota",
            "palmitos",
            "anana",
            "atún",
            "verdeo",
            "aceituna",
            "aceite",
            "vinagre",
            "maní"};
        int i, j;
        String nombre, marca;
        int stock;
        for(i = 0; i < arreglo.length; i++){
            nombre = nombres[Aleatorio.intAleatorio(0, nombres.length)];
            marca = marcas[Aleatorio.intAleatorio(0, marcas.length)];
            stock = Aleatorio.intAleatorio(0, 100);
            String[] ings = new String[5];
            for(j = 0; j < 5; j++){
                ings[j] = ingredientes[Aleatorio.intAleatorio(0, ingredientes.length)];
            }
            arreglo[i] = new Producto(nombre, marca, stock, ings);
        }
    }
}
