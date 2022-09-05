/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HP
 */
abstract class Persona {
    private String nit,nombres,apellidos,direccion,telefono,fn;

    public Persona(){}

    public Persona(String nombres, String direccion, String apellidos, String telefono, String fn ) { 
      this.nombres = nombres;
        this.direccion = direccion;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fn = fn;
        
    }

    
    
    public String getNombres() {
        return nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }
    
    protected void agregar(){}
    protected void actualizar(){}
    protected void eliminar(){}
}
