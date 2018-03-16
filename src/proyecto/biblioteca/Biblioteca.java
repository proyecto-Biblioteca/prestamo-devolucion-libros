
package proyecto.biblioteca;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Biblioteca {

    public Biblioteca() {
    }
    private List<Estudiante> Estudiantes;
    private List<List<Libro>> Libros;
    private static int COBRO_MOROSIDAD = 50; //CUANTO COBRA POR DIA MOROSO
    private static int DIAS_ALQUILER = 7;
    
    //Getters y Setters
    public List<Estudiante> getEstudiantes() {
        return Estudiantes;
    }
    public void setEstudiantes(List<Estudiante> estudiantes) {
        Estudiantes = estudiantes;
    }
    public List<List<Libro>> getLibros() {
        return Libros;
    }
    public void setLibros(List<List<Libro>> libros) {
        Libros = libros;
    }
    
    //Funciones Principales
    
    //Funcion para encontrar un estudiante devuelve -1 si no se encuentra el estudiante
    public int buscaEstudiante(String carnet){
        int result = -1;
        
        for (int i = 0; i < Estudiantes.size(); i++){
            if (Estudiantes.get(i).getCarnet() == carnet){
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
        Estudiante sujeto = Estudiantes.get(buscaEstudiante(carnet));
        
        List<Libro> alquilados = sujeto.getLibros_Alquilados();
        
        //Despues vemos si tiene algun libro alquilado
        if (alquilados.isEmpty()){
            
            //Si no tiene libros no tiene morosidades
            
        }else{
            
            //Si tiene libros se deben verificar las fechas de entrega
            Calendar hoy = Calendar.getInstance();
            hoy.setTime(new Date()); //Obtiene la fecha actual
            
            //Comparamos la fecha de entrega de cada libro para ver que no este moroso
            for (int x = 0; x < alquilados.size(); x++){
                if (hoy.before(alquilados.get(x).getFecha_Devolucion()) || hoy.equals(alquilados.get(x).getFecha_Devolucion())){
                    //Si no esta tarde para la devolucion no hay morosidad
                }else{
                    //Si esta tarde se calcula la morosidad
                    int dias =  daysBetween(hoy.getTime(), alquilados.get(x).getFecha_Devolucion().getTime());
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
            Estudiante sujeto = Estudiantes.get(pos_Sujeto);
            if (sujeto.getMorosidades() <= 0){
                
                //Si no tiene morosidades si puede alquilar libros
                //Se imprime la lista de libros disponibles
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Porfavor Ingrese su carnet: ");
                int libro_Deseado = Integer.parseInt(scanner2.nextLine()); //Convertimos la opcion en int
                
                //Ahora tomamos uno de los libros diponibles y se lo asignamos al estudiante
                Libro alquilado = Libros.get(libro_Deseado).get(0); //Tomamos el primero (indice 0)
                Calendar hoy = Calendar.getInstance();
                hoy.setTime(new Date()); //Toma el dia actual
                alquilado.setFecha_Entregado(hoy); //Se pone que dia fue alquilado
                hoy.add(Calendar.DATE, DIAS_ALQUILER); //Modificamos la fecha para su devolucion
                alquilado.setFecha_Devolucion(hoy); //Se pone la fecha de devoluvion
                
                //Ahora le asignamos el libro al estudiante
                sujeto.agrega_Libro(alquilado);
                System.out.println("El libro fue alquilado de manera correcta");
            }else{
                System.out.println("Primero debe pagar las morosidades");
            }
        }
    }
    
    //Funcion para volver a agregar un libro a los disponibles
    public void devolver_A_Biblioteca(Libro devolucion){
        boolean bandera = false;
        for (int x = 0; x < Libros.size(); x++) {
            if (Libros.get(x).get(0).getNombre() == devolucion.getNombre()){
                //Si encuentra donde debe ir se agrega donde debe ir
                Libros.get(x).add(devolucion);
                bandera = true;
                break;
            }else{
                //No haga nada
            }
        }
        //Si no lo encontro entonces hace una nueva lista y se agrega
        if (bandera){
            //No haga nada
        }else{
            List<Libro> nueva = new ArrayList<Libro>();
            nueva.add(devolucion);
            Libros.add(nueva);
        }
        
    }
    
    //Funcion para devolver un libro
    public void devolver_Libro(){
        //Solicitamos el carnet del estudiante
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor Ingrese su carnet: ");
        String carnet = scanner.nextLine();
        
        //Verificamos que el carnet si se encuentre en los estudiantes
        int pos_Sujeto = buscaEstudiante(carnet); //indice en el que se encuentra el est en la lista
        if (pos_Sujeto >= 0){
            
            //Si si existe
            Estudiante sujeto = Estudiantes.get(pos_Sujeto);
            //Despues se imprimen los libros alquilados por el estudiante
            List<Libro> alquilados = sujeto.getLibros_Alquilados();
            
            //Se escoge uno de ellos
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Porfavor escoga un libro por devolver: ");
            int devolucion = Integer.parseInt(scanner2.nextLine());
            //Se revisan las morosidades
            morosidades(carnet);
            //Si tiene libros se deben verificar las fechas de entrega
            Calendar hoy = Calendar.getInstance();
            hoy.setTime(new Date()); //Obtiene la fecha actual
            
            //Se verifica que el libro si se entrega a tiempo
            Libro devuelto = alquilados.get(devolucion);
            if (hoy.before(devuelto.getFecha_Devolucion()) || hoy.equals(devuelto.getFecha_Devolucion())){
                //Si no esta tarde para la devolucion no hay morosidad y se puede devolver
                //Se elimina el libro del estudiante y se borran las fechas; luego se vuelve a anadir a la lista de libros 
                devuelto.setFecha_Devolucion(null);
                devuelto.setFecha_Entregado(null);
                alquilados.remove(devuelto); //Eliminamos el libro de la lista
                sujeto.setLibros_Alquilados(alquilados); //Se actualiza la lista del estudiante
                //Se anade a la biblioteca de nuevo
                devolver_A_Biblioteca(devuelto);
            }else{
                System.out.println("Porfavor pague sus morosidades");
            }
        }else{
            System.out.println("Porfavor ingrese un carnet valido");
        }
    }
    
    public void pagar_Morosidad(String carnet){
        int indice_est = buscaEstudiante(carnet);
        if (indice_est >= 0){
            Estudiantes.get(indice_est).setMorosidades(0); //Se ponen las moridades en 0
        }else{
            System.out.println("Porfavor seleccione otro carnet");
        }
    }

}
