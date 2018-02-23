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
public class Tarifa {
     
    private int codigo_tar;
    private int codigo_vue;
    private String clase_tar;
    private float precio_tar;

    public Tarifa() {
    }

    public Tarifa(int codigo_tar, int codigo_vue, String clase_tar, float precio_tar) {
        this.codigo_tar = codigo_tar;
        this.codigo_vue = codigo_vue;
        this.clase_tar = clase_tar;
        this.precio_tar = precio_tar;
    }

    public int getCodigo_tar() {
        return codigo_tar;
    }

    public void setCodigo_tar(int codigo_tar) {
        this.codigo_tar = codigo_tar;
    }

    public int getCodigo_vue() {
        return codigo_vue;
    }

    public void setCodigo_vue(int codigo_vue) {
        this.codigo_vue = codigo_vue;
    }

    public String getClase_tar() {
        return clase_tar;
    }

    public void setClase_tar(String clase_tar) {
        this.clase_tar = clase_tar;
    }

    public float getPrecio_tar() {
        return precio_tar;
    }

    public void setPrecio_tar(float precio_tar) {
        this.precio_tar = precio_tar;
    }


    
    
}