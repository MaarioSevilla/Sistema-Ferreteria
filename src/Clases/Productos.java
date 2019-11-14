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
public class Productos {
    private String producto;
    private String descripcion;
    private float costo;
    private int cantidad;

    public Productos() {
        producto="";
        descripcion="";
        costo=0;
        cantidad=0;
    }

    public Productos(String producto, String descripcion, float costo, int cantidad) {
        this.producto = producto;
        this.descripcion = descripcion;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
