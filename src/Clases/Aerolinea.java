/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Anthony
 */
public class Aerolinea {
    
    private int codigo_aer;
    private String nombre_aer;

    public Aerolinea(int codigo_aer, String nombre_aer) {
        this.codigo_aer = codigo_aer;
        this.nombre_aer = nombre_aer;
    }
    
    public Aerolinea(){
        
    }

    public int getCodigo_aer() {
        return codigo_aer;
    }

    public void setCodigo_aer(int codigo_aer) {
        this.codigo_aer = codigo_aer;
    }

    public String getNombre_aer() {
        return nombre_aer;
    }

    public void setNombre_aer(String nombre_aer) {
        this.nombre_aer = nombre_aer;
    }
    
    
    
}

