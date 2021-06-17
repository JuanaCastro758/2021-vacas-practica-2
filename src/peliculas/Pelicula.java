package src.peliculas;
/**
 * Pelicula
 */
public class Pelicula {
    private int id;
    private String nombre;
    private int anio;
    private String categoria;
    private boolean disponible;
    
    public Pelicula(int id,String nombre,int anio,String categoria){
        this.id=id;
        this.nombre=nombre;
        this.anio=anio;
        this.categoria=categoria;
        this.disponible=true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "ID:  " + id + "    Nombre: " + nombre + "   Año: " + anio + "   Categoria: " + categoria+ "   Disponible: " + disponible;
    }
}
