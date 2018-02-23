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
public class Avion {
    
    private int codigo_avi;
    private String modelo_avi;
    private int numAsietnos_avi;

    public Avion(int codigo_avi, String modelo_avi, int numAsietnos_avi) {
        this.codigo_avi = codigo_avi;
        this.modelo_avi = modelo_avi;
        this.numAsietnos_avi = numAsietnos_avi;
    }

    public Avion() {
    }

    public int getCodigo_avi() {
        return codigo_avi;
    }

    public void setCodigo_avi(int codigo_avi) {
        this.codigo_avi = codigo_avi;
    }

    public String getModelo_avi() {
        return modelo_avi;
    }

    public void setModelo_avi(String modelo_avi) {
        this.modelo_avi = modelo_avi;
    }

    public int getNumAsietnos_avi() {
        return numAsietnos_avi;
    }

    public void setNumAsietnos_avi(int numAsietnos_avi) {
        this.numAsietnos_avi = numAsietnos_avi;
    }
    
    
}
