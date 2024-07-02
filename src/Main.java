
// 1. Crear una aplicacion para lanzar compras en una tarjeta de credito.

// 2. Menu para lanzar las compras.

// 3. Exhibicion de la lista de compras realizadas y ordenadas por valor.

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Compras compras = new Compras();

        int opcion = 0;
        ArrayList<String> listaDeArticulos = new ArrayList<>();

        //Menu de opciones
        while (opcion != 4) {
            System.out.println("1 - Ingrese el monto disponible en la tarjeta");
            System.out.println("2 - Ingresar el nombre y costo del producto");
            System.out.println("3 - Mostrar productos adquiridos");
            System.out.println("4 - Salir");

            opcion = scanner.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el monto disponible de la tarjeta");
                        int monto = scanner.nextInt();
                        compras.setLimiteDeDinero(monto);
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre del articulo");
                        String nombreArticulo = scanner.next();
                        System.out.println("Ingrese el costo del articulo");
                        int costo = scanner.nextInt();
                        compras.setCostoArticulo(costo);

                        String articulo = "\n" + nombreArticulo + "   " + compras.getCostoArticulo() + " colones";
                        listaDeArticulos.add(articulo);
                        break;
                    case 3:
                        System.out.println("Los articulos adquiridos son: " + listaDeArticulos);
                        System.out.println();
                        System.out.println("El monto de las compras es: " + compras.getAcumulado());
                        System.out.println();
                        System.out.println("El saldo de la tarjeta es : " + compras.getSaldo());
                        break;
                    case 4:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opcion invalida. Por favor seleccione nuevamente.");

                }

            //Esta linea de codigo es para dar mejor claridad a la interfaz
            System.out.println();
        }
    }
}
