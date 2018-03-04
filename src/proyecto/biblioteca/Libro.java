
package proyecto.biblioteca;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Libro {
     private String Nombre;
    private String Autor;
    private String Serie;
    private Calendar Fecha_Entregado;
    private Calendar Fecha_Devolucion;
	
	
    //Funcion para obtener la fecha como un str
    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); //Obtiene la fecha actual
        return dateFormat.format(c);
    }
    
    //Getters y Setters
    
    public String getNombre() {
        return Nombre;
    }
    
    
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
    
    public String getAutor() {
        return Autor;
    }
    
    
    public void setAutor(String autor) {
        Autor = autor;
    }
    
    
    public String getSerie() {
        return Serie;
    }
    
    
    public void setSerie(String serie) {
        Serie = serie;
    }
    
    
    public Calendar getFecha_Entregado() {
        return Fecha_Entregado;
    }
    
    
    public void setFecha_Entregado(Calendar fecha_Entregado) {
        Fecha_Entregado = fecha_Entregado;
    }
    
    
    public Calendar getFecha_Devolucion() {
        return Fecha_Devolucion;
    }


    public void setFecha_Devolucion(Calendar fecha_Devolucion) {
	Fecha_Devolucion = fecha_Devolucion;
    }

    
}
