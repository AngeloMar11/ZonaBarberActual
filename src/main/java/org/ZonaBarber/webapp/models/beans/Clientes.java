package org.ZonaBarber.webapp.models.beans;

public class Clientes {

    private int id;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String identificacion;
    private String Tipo_identificacion;
    private String Celular;
    private String Correo;
    private String Contraseña;

    public Clientes(int id, String nombre, String apellido, String direccion, String identificacion, String tipo_identificacion, String celular, String correo, String contraseña) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        this.identificacion = identificacion;
        Tipo_identificacion = tipo_identificacion;
        Celular = celular;
        Correo = correo;
        Contraseña = contraseña;
    }

    public Clientes() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipo_identificacion() {
        return Tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        Tipo_identificacion = tipo_identificacion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
