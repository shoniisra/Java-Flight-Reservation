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
public class Origen {
 
    private int codigo_aep;
    private int codigo_hor;
    private int codigo_ori;

    public Origen() {
    }

    public Origen(int codigo_aep, int codigo_hor, int codigo_ori) {
        this.codigo_aep = codigo_aep;
        this.codigo_hor = codigo_hor;
        this.codigo_ori = codigo_ori;
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

    public int getCodigo_ori() {
        return codigo_ori;
    }

    public void setCodigo_ori(int codigo_ori) {
        this.codigo_ori = codigo_ori;
    }
    
    
    
}
