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
public class Pasajero {
    
    private int codigo_pas;
    private String nombre_pas;
    private String cedula_pas;
    private String direccion_pas;
    private String fecha_nac_pas;
    private String usuario_pas;
    private String contrasena_pas;
    private String numero_tarjeta_pas;

    public Pasajero() {
    }

    public Pasajero(int codigo_pas, String nombre_pas, String cedula_pas, String direccion_pas, String fecha_nac_pas, String usuario_pas, String contrasena_pas, String numero_tarjeta_pas) {
        this.codigo_pas = codigo_pas;
        this.nombre_pas = nombre_pas;
        this.cedula_pas = cedula_pas;
        this.direccion_pas = direccion_pas;
        this.fecha_nac_pas = fecha_nac_pas;
        this.usuario_pas = usuario_pas;
        this.contrasena_pas = contrasena_pas;
        this.numero_tarjeta_pas = numero_tarjeta_pas;
    }

    public int getCodigo_pas() {
        return codigo_pas;
    }

    public void setCodigo_pas(int codigo_pas) {
        this.codigo_pas = codigo_pas;
    }

    public String getNombre_pas() {
        return nombre_pas;
    }

    public void setNombre_pas(String nombre_pas) {
        this.nombre_pas = nombre_pas;
    }

    public String getCedula_pas() {
        return cedula_pas;
    }

    public void setCedula_pas(String cedula_pas) {
        this.cedula_pas = cedula_pas;
    }

    public String getDireccion_pas() {
        return direccion_pas;
    }

    public void setDireccion_pas(String direccion_pas) {
        this.direccion_pas = direccion_pas;
    }

    public String getFecha_nac_pas() {
        return fecha_nac_pas;
    }

    public void setFecha_nac_pas(String fecha_nac_pas) {
        this.fecha_nac_pas = fecha_nac_pas;
    }

    public String getUsuario_pas() {
        return usuario_pas;
    }

    public void setUsuario_pas(String usuario_pas) {
        this.usuario_pas = usuario_pas;
    }

    public String getContrasena_pas() {
        return contrasena_pas;
    }

    public void setContrasena_pas(String contrasena_pas) {
        this.contrasena_pas = contrasena_pas;
    }

    public String getNumero_tarjeta_pas() {
        return numero_tarjeta_pas;
    }

    public void setNumero_tarjeta_pas(String numero_tarjeta_pas) {
        this.numero_tarjeta_pas = numero_tarjeta_pas;
    }
    
}
