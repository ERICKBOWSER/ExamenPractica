/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author ERICK
 */
public class Trabajador {
    
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador("Brayan", "Luis",LocalDate.of(1983, 3, 22), CategoriaEmpleado.AVANZADA);
        
        System.out.println(t1);
    }
    
    // Encapsulación de datos
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado catEmpleado;  // enum

    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado catEmpleado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        try{
            this.fechaNacimiento = fechaNacimiento;
        }catch(IllegalArgumentException iae){
            System.out.println("El tipo de dato introducido como fecha es erroneo");
        }
        
        this.catEmpleado = catEmpleado;
    }

    public Trabajador() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public CategoriaEmpleado getCatEmpleado() {
        return catEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCatEmpleado(CategoriaEmpleado catEmpleado) {
        this.catEmpleado = catEmpleado;
    }

    @Override
    public String toString() {
        String resultado= """
               %s, %s       F.Nac: %s/%s/%s
               Categoria: %s
               Fecha Jubilación: %s
               Sueldo actual: %s
               """.formatted(apellidos, nombre, fechaNacimiento.getDayOfMonth(), 
                       fechaNacimiento.getMonthValue(), fechaNacimiento.getYear(), catEmpleado.MEDIA.getCategoria(),
                            fechaJubilacion(this), calcularSueldo(1707));
        
        return resultado;
    }
    
    
    // Comprobar edad
//    public long comprobarEdad(LocalDate fechaNacimiento){
//        long diferenciaDias = ChronoUnit.DAYS.between(fechaNacimiento, LocalDate.now());
//        
//        return diferenciaDias;
//    }
//    
//    public String edad(){
//        String resultado;
//        try{
//            long comprobarEdad = comprobarEdad(fechaNacimiento);
//            
//        
//            if(comprobarEdad < 16){
//                resultado = "El usuario es menor de edad";
//            }else{
//                resultado = "El usuario no es menor de edad";
//            }
//        }catch(IllegalArgumentException IAE){
//            resultado = "El tipo de dato introducido es erroneo";
//        };
//        return resultado;
//    }
    
    // Constructor copia   
    public Trabajador(Trabajador t){
        this.nombre = t.nombre;
        this.apellidos = t.apellidos;
        this.catEmpleado = t.catEmpleado;
        this.fechaNacimiento = t.fechaNacimiento;
    }
    
    // Devolver el sueldo 
    public double calcularSueldo(double sueldo){
        return sueldo + catEmpleado.MEDIA.getEuros();
    }
    
    // Devuelve la fecha en la que se jubilara el usuario
    public LocalDate fechaJubilacion(Trabajador trabajador){
        
        return trabajador.fechaNacimiento.plusYears(66);
    }
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
