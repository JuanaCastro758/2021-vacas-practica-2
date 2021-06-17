package src.peliculas;

import src.tienda.*;

/**
 *VectorPelicula
 */
public class VectorPelicula {
    private Pelicula[] pelicula=new Pelicula[50];
    private int codigoId;
    public VectorPelicula(){
        codigoId=0;
    }
    //Agregar nuevas peliculas
    public void crearPelicula(String nombre,int anio,String categoria){
        if(codigoId>=100){
            System.out.println("Espacio en memoria insuficiente");
        }else{
            pelicula[codigoId]=new Pelicula(codigoId,nombre,anio,categoria);
        }
        codigoId++;
    }
    public void ingresarInformacion(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula: ");
        int anio = IngresoDatos.getEntero("Ingrese el año de estreno: ", false);
        String categoria = IngresoDatos.getTexto("Ingrese la categoria: ");
        crearPelicula(nombre,anio,categoria);
    }
    //Mostrar Peliculas
    public void mostrarPeliculas(){
        System.out.println("\n\n Peliculas de memorabilia");
        for(int i=0;i<codigoId;i++){
            System.out.println((i+1)+".- "+pelicula[i].toString());
        }
        System.out.println("\n\n");
    }
    public void ordenarPeliculas(boolean ascendente){
        boolean cambio=true;
        
        for(int i=1;i<codigoId;i++){
            for(int j=0;j<(codigoId-i);j++){
                if(ascendente){
                    cambio=(pelicula[j].getNombre().compareTo(pelicula[j+1].getNombre())>0);
                }else{
                    cambio=(pelicula[j].getNombre().compareTo(pelicula[j+1].getNombre())<0);
                }
                if(cambio){
                    Pelicula aux=pelicula[j];
                    pelicula[j]=pelicula[j+1];
                    pelicula[j+1]=aux;
                }
            }
        }
    }
}
