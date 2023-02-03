/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import ejercicio1.Trabajador;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ERICK
 */
public class Empresa {
    private List<Trabajador> trabajadores = new ArrayList<>();
    private String nombre;
    private String cif;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }

    public Empresa() {
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.cif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.cif, other.cif);
    }

    @Override
    public String toString() {
        return "Empresa{" + "trabajadores=" + trabajadores + ", nombre=" + nombre + ", cif=" + cif + '}';
    }
    
    
    public void imprimir(){
//        List<Empresa> lista = new ArrayList<Empresa>();
//        
//        for(Empresa e : lista){
//            System.out.println(e);
//        }
        trabajadores.forEach(System.out :: println);
        
    }
    
    public void contratar(Trabajador t){
        trabajadores.add(t);
    }
    
    public boolean despedir(Trabajador t){
        boolean resultado;
        
        if(trabajadores.contains(t)){
            trabajadores.remove(t);
            resultado = true;
        }else{
            resultado = false;
        }
        
        return resultado;
    }
    
    public List<Integer> buscarTodosNombre(String nombre){
        List<Integer> aux = new ArrayList<>(); // Lista en la que se almacenará el array
        
        for(int i = 0; i < trabajadores.size(); i++){
            // get() accedemos al index
            // getNombre().equalsIgnoreCaase(nombre) comparamos si el dato es el mismo 
            if(trabajadores.get(i).getNombre().equalsIgnoreCase(nombre)){
                aux.add(trabajadores.indexOf(i)); // indexOf devuelve el indice 
            }
        }
        return aux;        
    }
    
    
    
    
}
