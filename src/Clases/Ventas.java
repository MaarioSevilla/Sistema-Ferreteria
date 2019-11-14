/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author sevilla
 */
public class Ventas {
    private int idProducto;
    private String descripcion;
    private String nomCliente;
    private String fecha;
    private int idUsuario;

    public Ventas() {
        idProducto=0;
        descripcion="";
        nomCliente="";
        fecha="";
        idUsuario=0;
    }

    public Ventas(int idProducto, String descripcion, String nomCliente, String fecha, int idUsuario) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.nomCliente = nomCliente;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
