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
public class Doctor extends Persona {
    //variable para encapsular

    private int edad;
    public String nombre;
    public String direccion;
    public String experiencia;

    public Doctor(int edad) {
        this.edad = edad;
        Establecerespecialidad("especialidad"+ nombre);
    }

    public void imprimiredad() {
        System.out.println("La edad es: " + edad);
    }
    
    public void setnombre(String name) {
        this.nombre=name;
    }
    
    public void setexperiencia(String name) {
        this.experiencia=name;
    }
    public void setdireccion(String name) {
        this.direccion=name;
    }
    @Override
    public String getnombre() {
        return nombre;
    }

    @Override
    public String getexperiencia() {
        return experiencia;
    }

    @Override
    public String direccion() {
        return direccion;
    }

    @Override
    public String informacionpersona() {
        return "Doctor";
    }

}

    

