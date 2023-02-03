/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author ERICK
 */
public enum CategoriaEmpleado {
    INICIAL("Categoria Básica", 50), MEDIA("Categoria Media", 70), AVANZADA("Categoria profesional", 100);
    
    private String categoria;
    private double euros;
    
    private CategoriaEmpleado(String categoria, double euros){
        this.categoria = categoria;
        this.euros = euros;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public double getEuros(){
        return euros;
    }
    
}
