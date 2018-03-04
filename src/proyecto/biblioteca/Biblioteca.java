
package proyecto.biblioteca;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Biblioteca {

    public Biblioteca() {
    }
    private Estudiante[] Estudiantes;
    private Libro[][] Libros;
    private static int COBRO_MOROSIDAD = 50; //CUANTO COBRA POR DIA MOROSO
    
    //Getters y Setters
    public Estudiante[] getEstudiantes() {
        return Estudiantes;
    }
    public void setEstudiantes(Estudiante[] estudiantes) {
        Estudiantes = estudiantes;
    }
    public Libro[][] getLibros() {
        return Libros;
    }
    public void setLibros(Libro[][] libros) {
        Libros = libros;
    }
    
    //Funciones Principales
    
    //Funcion para encontrar un estudiante
    public int buscaEstudiante(String carnet){
        int result = -1;
        
        for (int i = 0; i < Estudiantes.length; i++){
            if (Estudiantes[i].getCarnet() == carnet){
                return i;
            }
        }
        
        return result;
    }
    
    //Funcion para saber la diferencia de dias entre dos fechas
    public int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
    
    //Funcion para verificar morosidades
    public void morosidades(String carnet){
        int result = 0;
        
        //Primero buscamos al estudiante en la lista de estudiantes
        Estudiante sujeto = Estudiantes[buscaEstudiante(carnet)];
        
        Libro[] alquilados = sujeto.getLibros_Alquilados();
        
        //Despues vemos si tiene algun libro alquilado
        if (alquilados.length == 0){
            
            //Si no tiene libros no tiene morosidades
            
        }else{
            
            //Si tiene libros se deben verificar las fechas de entrega
            Calendar hoy = Calendar.getInstance();
            hoy.setTime(new Date()); //Obtiene la fecha actual
            
            //Comparamos la fecha de entrega de cada libro para ver que no este moroso
            for (int x = 0; x < alquilados.length; x++){
                if (hoy.before(alquilados[x].getFecha_Devolucion()) || hoy.equals(alquilados[x].getFecha_Devolucion())){
                    //Si no esta tarde para la devolucion no hay morosidad
                }else{
                    //Si esta tarde se calcula la morosidad
                    int dias =  daysBetween(hoy.getTime(), alquilados[x].getFecha_Devolucion().getTime());
                    result += dias * COBRO_MOROSIDAD;
                }
            }
        }
        //Actualizamos las morosidades del estudiante
        sujeto.setMorosidades(result);
        
    }
    
    //Funcion para alquilar un libro
    public void alquilar_Libro(){
        //Primero le pedimos el carnet al estudiante
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor Ingrese su carnet: ");
        String carnet = scanner.nextLine();
        
        //Verificamos que el carnet si se encuentre en los estudiantes
        int pos_Sujeto = buscaEstudiante(carnet); //indice en el que se encuentra el est en la lista
        if (pos_Sujeto >= 0){
            
            //Si el estudiante si existe se procede a verificar sus morosidades
            morosidades(carnet);
            Estudiante sujeto = Estudiantes[pos_Sujeto];
            if (sujeto.getMorosidades() <= 0){
                
                //Si no tiene morosidades si puede alquilar libros
                //Se imprime la lista de libros disponibles
            }
        }
    }
}
