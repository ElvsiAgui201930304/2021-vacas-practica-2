package src.peliculas;

import src.tienda.IngresoDatos;

public class VectorPelicula {

    private Pelicula[] peliculas = new Pelicula[50];
    private int siguiente;

    public VectorPelicula(){
        this.siguiente = 1;
    }

    public void agregarPeliculas(String nombre,String disponible, int año){
        if (siguiente > 50) {
            System.out.println("Ya no cuenta con espacio para mas peliculas");
        } else {
            peliculas[siguiente-1] = new Pelicula(nombre, siguiente, año, disponible);
            siguiente++;
        }

    }

    public void agregarPeli(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la Peliculas: ");
        int año = IngresoDatos.getEntero("Ingrese el año de la Pelicula: ", false);
        agregarPeliculas(nombre,categoria(), año);
    }

    public String categoria(){
        String categoria =  "";
        int catego;
        System.out.println("***Categorias Disponibles***\n");
        System.out.println("1.Familiar\n2.Accion\n3.Romance\n4.Terror\n5.Comedia");
        do{
            catego = IngresoDatos.getEntero("digite el numero de la categoria que desea: ", false);
            switch (catego) {
                case 1:
                    categoria = "Familiar";
                    break;
                case 2:
                    categoria = "Accion";
                    break;
                case 3:
                    categoria = "Romance";
                    break;
                case 4:
                    categoria = "Terror";
                    break;
                case 5:
                    categoria = "Comedia";
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(catego  > 5);
        
        return categoria;
    }
    
    public void ordenPorNombre(){
        Pelicula tem = null;
        int pos = 0;

        for (int i = 0; i < (siguiente-1); i++) {
            tem = peliculas[i];
            pos = i;
            for (int j = i+1; j < (siguiente-1); j++) {
                if (tem.getNombre().compareTo(peliculas[j].getNombre()) > 0 ) {
                    tem = peliculas[j];
                    pos = j;
                }
            }
           
            peliculas[pos] = peliculas[i];
            peliculas[i] = tem;
        }

    }

    public void imprimirPelis(){
        System.out.println("---Peliculas Registradas----\n");
        for (int i = 0; i < (siguiente-1); i++) {
            System.out.println("-"+(i+1)+") "+peliculas[i].motrarInfo());
        }
    }

    public void modificarDatos(){
        System.out.println("---Modificar Datos----\n");
        int idTem = IngresoDatos.getEntero("ingrese el Id de la pelicula que Desea modificar sus datos", false);
        if (existente(idTem)) {
            peliculas[posicion(idTem)].setNombre(IngresoDatos.getTexto("ingrese El nuevo nombre")); 
            peliculas[posicion(idTem)].setAño(IngresoDatos.getEntero("Ingrese el Nuevo año", false));
            peliculas[posicion(idTem)].setId(IngresoDatos.getEntero("Ingrese el Nuevo Id", false));
            
        } else {
            
        }

    }
    public boolean existente(int valor){
        boolean exis = false;
        for (int i = 0; i < (siguiente-1); i++) {
            if (peliculas[i].getId() == valor) {
                exis = true;
                break;
            }
        }
        return exis;
    }
    public int posicion(int valor){
        int pos = 0;

        for (int i = 0; i < (siguiente-1); i++) {
            if (peliculas[i].getId() == valor) {
                pos =i;
                break;
            }
        }
        return pos;

    }
}
