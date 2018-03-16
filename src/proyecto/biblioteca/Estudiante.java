
package proyecto.biblioteca;

import java.util.List;


public class Estudiante {
    private String Nombre;
    private String Carnet;
    private int Morosidades = 0; //Comienza sin morosidades
    private List<Libro> Libros_Alquilados;
    
    //Constructor
    public Estudiante(String nombre, String carnet) {
        super();
        Nombre = nombre;
        Carnet = carnet;

    }
    
    //Setters y Getters
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
    public String getCarnet() {
        return Carnet;
    }
    
    public void setCarnet(String carnet) {
        Carnet = carnet;
    }
   
    
    public int getMorosidades() {
        return Morosidades;
    }
    
    public void setMorosidades(int morosidades) {
        Morosidades = morosidades;
    }
    
    public List<Libro> getLibros_Alquilados() {
        return Libros_Alquilados;
    }
    
    public void setLibros_Alquilados(List<Libro> libros_Alquilados) {
        Libros_Alquilados = libros_Alquilados;
    }
    
    //Funcion para agregar un libro a un estudiante
    public void agrega_Libro(Libro libro_PA){
        this.Libros_Alquilados.add(libro_PA);
    }

    
    
}
