/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import ejercicio1.CategoriaEmpleado;
import ejercicio1.Trabajador;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author ERICK
 */
public class Prueba {
    public static void main(String[] args) {
        Empresa empresaA = new Empresa("Doritos", "89234323H");
        Empresa empresaB = new Empresa("Monster", "09232398U");
        
        Trabajador t2 = new Trabajador("Irina", "Jersi", LocalDate.of(2000, Month.JULY, 22), CategoriaEmpleado.AVANZADA);
        Trabajador t3 = new Trabajador("Obi-wan", "Kenovi", LocalDate.of(1950, 3, 10), CategoriaEmpleado.INICIAL);
        Trabajador t4 = new Trabajador("Jake", "Adams", LocalDate.of(2005, Month.MARCH, 1), CategoriaEmpleado.INICIAL);
        Trabajador t5 = new Trabajador("Maik", "Guasouski", LocalDate.of(1995, Month.JANUARY, 12), CategoriaEmpleado.AVANZADA);
        
        
        // Copiar trabajador
        Trabajador t6 = new Trabajador(t3);
        System.out.println(t6);
        
        // Contratar
        empresaA.contratar(t2);
        empresaA.contratar(t3);
        
        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);
        
        // Imprimir empresas
        empresaA.imprimir();
        empresaB.imprimir();
        
        empresaB.despedir(t5);
        empresaB.imprimir();
        
        empresaA.contratar(t5);
        
        
    }
}
