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
public class Aeropuerto {
    
    private int codigo_aep;
    private String nombre_aep,ciudad_aep;

    public Aeropuerto() {
    }

    public Aeropuerto(int coddigo_aep, String nombre_aep, String ciudad_aep) {
        this.codigo_aep = coddigo_aep;
        this.nombre_aep = nombre_aep;
        this.ciudad_aep = ciudad_aep;
    }

    public int getCoddigo_aep() {
        return codigo_aep;
    }

    public void setCoddigo_aep(int coddigo_aep) {
        this.codigo_aep = coddigo_aep;
    }

    public String getNombre_aep() {
        return nombre_aep;
    }

    public void setNombre_aep(String nombre_aep) {
        this.nombre_aep = nombre_aep;
    }

    public String getCiudad_aep() {
        return ciudad_aep;
    }

    public void setCiudad_aep(String ciudad_aep) {
        this.ciudad_aep = ciudad_aep;
    }
    
    
}