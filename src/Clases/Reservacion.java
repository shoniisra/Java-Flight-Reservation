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
public class Reservacion {
    
    private int codigo_pas;
    private int codigo_res;
    private String fecha_res;
    private int codigo_tar;
    
    public Reservacion() {
    }

    public Reservacion(int codigo_pas, int codigo_res, String fecha_res, int codigo_tar) {
        this.codigo_pas = codigo_pas;
        this.codigo_res = codigo_res;
        this.fecha_res = fecha_res;
        this.codigo_tar = codigo_tar;
    }

    public int getCodigo_pas() {
        return codigo_pas;
    }

    public void setCodigo_pas(int codigo_pas) {
        this.codigo_pas = codigo_pas;
    }

    public int getCodigo_res() {
        return codigo_res;
    }

    public void setCodigo_res(int codigo_res) {
        this.codigo_res = codigo_res;
    }

    public String getFecha_res() {
        return fecha_res;
    }

    public void setFecha_res(String fecha_res) {
        this.fecha_res = fecha_res;
    }

    public int getCodigo_tar() {
        return codigo_tar;
    }

    public void setCodigo_tar(int codigo_tar) {
        this.codigo_tar = codigo_tar;
    }
    
    

    
    

    
    

    
}
