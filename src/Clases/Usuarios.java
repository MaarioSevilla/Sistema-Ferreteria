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
public class Usuarios {
    private String usuario;
    private String password;
    private String tipoUser;
    private String estado;
    private String nombre;
    private String apellidos;
    private String sexo;
    private String fechaNac;
    private String correo;
    private String nTelefono;
    private String idioma;

    public Usuarios() {
        usuario="";
        password="";
        tipoUser="";
        estado="";
        nombre="";
        apellidos="";
        sexo="";
        fechaNac="";
        correo="";
        nTelefono="";
        idioma="";        
    }

    public Usuarios(String usuario, String password, String tipoUser, String estado, String nombre, String apellidos, String sexo, String fechaNac, String correo, String nTelefono, String idioma) {
        this.usuario = usuario;
        this.password = password;
        this.tipoUser = tipoUser;
        this.estado = estado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.correo = correo;
        this.nTelefono = nTelefono;
        this.idioma = idioma;
    }

    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
