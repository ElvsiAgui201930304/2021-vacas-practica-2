package src.tienda;

import src.clientes.VectorClientes;
import src.peliculas.VectorPelicula;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }
    private VectorPelicula tablaPelis = new VectorPelicula();
    private VectorClientes tablaClientes = new VectorClientes();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5) Ingreso de Peliculas");
            System.out.println("6) Ordenar peliculas Ascente");
            System.out.println("7) Modificar Datos pelicula");
            System.out.println("8) Mostrar Peliculas");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            switch (menu) {
                case 1:
                    tablaClientes.agregarCliente();
                    break;
                case 2:
                    tablaClientes.mostrarClientes();
                    break; 
                case 3:
                    System.out.println("Desordenado:");
                    tablaClientes.mostrarClientes();
                    System.out.println("\n\nOrdenado:");
                    tablaClientes.ordenarPorNombre(true);
                    tablaClientes.mostrarClientes();
                    break;
                case 4:
                    System.out.println("Desordenado:");
                    tablaClientes.mostrarClientes();
                    System.out.println("\n\nOrdenado:");
                    tablaClientes.ordenarPorNombre(false);
                    tablaClientes.mostrarClientes();
                    break;
                case 5:
                    tablaPelis.agregarPeli();
                    break;
                case 6:
                    tablaPelis.imprimirPelis();
                    tablaPelis.ordenPorNombre();
                    break;
                case 7:
                    tablaPelis.modificarDatos();
                    break;
                case 8:
                    tablaPelis.imprimirPelis();
                    break;
                default:
                
                    break;
            }

        }

    }

    
}
