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
public class Horario {

    private int codigo_hor;
    private String fecha_hor;
    private String hora_hor;

    public Horario() {
    }

    public Horario(int codigo_hor, String fecha_hor, String hora_hor) {
        this.codigo_hor = codigo_hor;
        this.fecha_hor = fecha_hor;
        this.hora_hor = hora_hor;
    }

    public int getCodigo_hor() {
        return codigo_hor;
    }

    public void setCodigo_hor(int codigo_hor) {
        this.codigo_hor = codigo_hor;
    }

    public String getFecha_hor() {
        return fecha_hor;
    }

    public void setFecha_hor(String fecha_hor) {
        this.fecha_hor = fecha_hor;
    }

    public String getHora_hor() {
        return hora_hor;
    }

    public void setHora_hor(String hora_hor) {
        this.hora_hor = hora_hor;
    }

    
    
    
}
