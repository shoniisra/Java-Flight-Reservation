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
public class Vuelo {
    
    private int codigo_vue;
    private int codigo_avi;
    private int codigo_aer;
    private int codigo_ori;
    private int codigo_des;

    public Vuelo() {
    }

    public Vuelo(int codigo_vue, int codigo_avi, int codigo_aer, int codigo_ori, int codigo_des) {
        this.codigo_vue = codigo_vue;
        this.codigo_avi = codigo_avi;
        this.codigo_aer = codigo_aer;
        this.codigo_ori = codigo_ori;
        this.codigo_des = codigo_des;
    }

    public int getCodigo_vue() {
        return codigo_vue;
    }

    public void setCodigo_vue(int codigo_vue) {
        this.codigo_vue = codigo_vue;
    }

    public int getCodigo_avi() {
        return codigo_avi;
    }

    public void setCodigo_avi(int codigo_avi) {
        this.codigo_avi = codigo_avi;
    }

    public int getCodigo_aer() {
        return codigo_aer;
    }

    public void setCodigo_aer(int codigo_aer) {
        this.codigo_aer = codigo_aer;
    }

    public int getCodigo_ori() {
        return codigo_ori;
    }

    public void setCodigo_ori(int codigo_ori) {
        this.codigo_ori = codigo_ori;
    }

    public int getCodigo_des() {
        return codigo_des;
    }

    public void setCodigo_des(int codigo_des) {
        this.codigo_des = codigo_des;
    }

    
   
    
}
