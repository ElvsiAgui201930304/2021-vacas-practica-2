package src.peliculas;

public class Pelicula{

    private String nombre;
    private int id;
    private int año;
    private String categoria;
    private boolean disponible;

    public Pelicula(String nombre, int id, int año, String categoria) {
        this.nombre = nombre;
        this.id = id;
        this.año = año;
        this.categoria = categoria;
    }
    
    public String motrarInfo(){
        String retorno;
        retorno = "id: "+ this.id +" nombre: "+ this.nombre+" año: "+ this.año+" categoria: "+ this.categoria;
        return retorno;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año = año;
    }
    public boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }


}