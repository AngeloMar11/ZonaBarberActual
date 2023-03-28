package org.ZonaBarber.webapp.models.beans;

public class Trabajador {

    private int id;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Contrasena;
    private String Genero;

    private String Servicio;
    private int TipoEmpl;
    private String Celular;
    private String Direccion;
    private String Documento;

    public Trabajador(int id, String nombre, String apellido, String correo, String contrasena, String genero, String servicio, int tipoEmpl, String celular, String direccion, String documento) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Correo = correo;
        Contrasena = contrasena;
        Genero = genero;
        Servicio = servicio;
        TipoEmpl = tipoEmpl;
        Celular = celular;
        Direccion = direccion;
        Documento = documento;
    }

    public Trabajador() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String servicio) {
        Servicio = servicio;
    }

    public int getTipoEmpl() {
        return TipoEmpl;
    }

    public void setTipoEmpl(int tipoEmpl) {
        TipoEmpl = tipoEmpl;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }
}

