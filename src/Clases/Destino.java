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
public class Destino {
    private int codigo_des;
    private int codigo_aep;
    private int codigo_hor;

    public Destino() {
    }

    public Destino(int codigo_des, int codigo_aep, int codigo_hor) {
        this.codigo_des = codigo_des;
        this.codigo_aep = codigo_aep;
        this.codigo_hor = codigo_hor;
    }

    public int getCodigo_des() {
        return codigo_des;
    }

    public void setCodigo_des(int codigo_des) {
        this.codigo_des = codigo_des;
    }

    public int getCodigo_aep() {
        return codigo_aep;
    }

    public void setCodigo_aep(int codigo_aep) {
        this.codigo_aep = codigo_aep;
    }

    public int getCodigo_hor() {
        return codigo_hor;
    }

    public void setCodigo_hor(int codigo_hor) {
        this.codigo_hor = codigo_hor;
    }
    
        
    
    
}
