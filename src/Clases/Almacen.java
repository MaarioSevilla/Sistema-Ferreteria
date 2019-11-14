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
public class Almacen {
    private String nombre_material;
    private String Descripcion;
    private String tipo;
    private int cantidad;
    public Almacen() {
        nombre_material="";
        Descripcion="";
        tipo="";
        cantidad=0;
    }
    
    public Almacen(String nombre_material, String Descripcion, String tipo, int cantidad) {
        this.nombre_material = nombre_material;
        this.Descripcion = Descripcion;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
