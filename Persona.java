/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Protect;

/**
 *
 * @author User
 */
public abstract class Persona {
    private String especialidad;
    public Persona(){
        
    }
    // metodos set y get//
    public void Establecerespecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public String ObtenerEspecialidad(){
        return this.especialidad;
    }
    
    public void imprimirEspecialidad(){
     System.out.println("Especialidad: "+especialidad);
     
     
    }
     // metodos abstractos//
    abstract String getnombre();
    abstract String getexperiencia();
    abstract String direccion();
    
     
    abstract String informacionpersona();
    
}

    
