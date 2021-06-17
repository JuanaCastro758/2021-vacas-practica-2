package src.tienda;

import src.clientes.VectorClientes;
import src.peliculas.VectorPelicula;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private VectorPelicula pelicula=new VectorPelicula();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascendente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5) Ingreso de peliculas");
            System.out.println("6) Mostrar peliculas");
            System.out.println("7) Ordenar peliculas Ascendente");
            System.out.println("8) Ordenar peliculas Descendente");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);
            switch(menu){
                case 1:  //ingreso de datos
                        tablaClientes.agregarCliente();
                    break;
                case 2: //mostrar clientes
                        tablaClientes.mostrarClientes();
                    break;
                case 3: //mostrar clientes
                        System.out.println("Desordenado:");
                        tablaClientes.mostrarClientes();
                        System.out.println("\n\nOrdenado:");
                        tablaClientes.ordenarPorNombre(true);
                        tablaClientes.mostrarClientes();
                    break;
                case 4: //mostrar clientes
                        System.out.println("Desordenado:");
                        tablaClientes.mostrarClientes();
                        System.out.println("\n\nOrdenado:");
                        tablaClientes.ordenarPorNombre(false);
                        tablaClientes.mostrarClientes();
                    break;            
                case 5: //ingreso de nuevas peliculas
                        pelicula.ingresarInformacion();
                    break;
                case 6: //imprime todas la peliculas
                        pelicula.mostrarPeliculas();
                    break;
                case 7: //ordena e imprime las peliculas de forma ascendente
                        System.out.println("Orden Anterior:");
                        pelicula.mostrarPeliculas();
                        System.out.println("orden Actual ascendente:");
                        pelicula.ordenarPeliculas(true);
                        pelicula.mostrarPeliculas();
                    break;
                case 8: System.out.println("Orden Anterior:");
                        pelicula.mostrarPeliculas();
                        System.out.println("orden Actual desendente:");
                        pelicula.ordenarPeliculas(false);
                        pelicula.mostrarPeliculas();
                    break;
            }
        }

    }
}

