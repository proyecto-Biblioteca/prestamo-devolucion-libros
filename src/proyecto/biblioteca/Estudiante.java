
package proyecto.biblioteca;


public class Estudiante {
    private String Nombre;
    private String Carnet;
    private String Clave;
    private int Morosidades = 0; //Comienza sin morosidades
    private Libro[] Libros_Alquilados;
    
    //Constructor
    public Estudiante(String nombre, String carnet, String clave) {
        super();
        Nombre = nombre;
        Carnet = carnet;
        Clave = clave;
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
    
    public String getClave() {
        return Clave;
    }
    
    public void setClave(String clave) {
        Clave = clave;
    }
    
    public int getMorosidades() {
        return Morosidades;
    }
    
    public void setMorosidades(int morosidades) {
        Morosidades = morosidades;
    }
    
    public Libro[] getLibros_Alquilados() {
        return Libros_Alquilados;
    }
    
    public void setLibros_Alquilados(Libro[] libros_Alquilados) {
        Libros_Alquilados = libros_Alquilados;
    }

    
    
    
}
