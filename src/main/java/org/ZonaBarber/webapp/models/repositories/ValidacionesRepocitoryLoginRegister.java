package org.ZonaBarber.webapp.models.repositories;

import org.ZonaBarber.webapp.models.beans.Clientes;
import org.ZonaBarber.webapp.models.beans.Trabajador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidacionesRepocitoryLoginRegister {

    private Connection conn;
    public ValidacionesRepocitoryLoginRegister(Connection conn) {
        this.conn = conn;
    }
    public int existeCliente(Clientes cliente) throws SQLException {
        int existe = 0;
        String sql = "SELECT COUNT(*) FROM tblclientes WHERE Correo=? or identificacion=?";

        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, cliente.getCorreo());
            stm.setString(2, cliente.getIdentificacion());


            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    existe = 1;
                }
            }
        }

        return existe;
    }
    public int existeEmpleado(Trabajador trabajador) throws SQLException {
        int existe = 0;
        String sql = "SELECT COUNT(*) FROM tbltrabajador WHERE Correo=? or Documento=?";

        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, trabajador.getCorreo());
            stm.setString(2, trabajador.getDocumento());


            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    existe = 1;
                }
            }
        }

        return existe;
    }
    public int existeCorreo(Clientes cliente) throws SQLException {
        int existe = 0;
        String sql = "SELECT COUNT(*) FROM tblclientes WHERE Correo=?";

        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, cliente.getCorreo());

            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    existe = 1;
                }
            }
        }

        return existe;
    }
    public int existeCorreoEmple(Trabajador trabajador) throws SQLException {
        int ex = 0;
        String sql = "SELECT COUNT(idTblTrabajador) FROM tbltrabajador WHERE Correo=?";

        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, trabajador.getCorreo());

            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    ex = 1;
                }
            }
        }

        return ex;
    }

    public int ValAdmin(Trabajador trabajador) throws SQLException
    {
        int tipo = 0;
        String sql = "SELECT TipoEmpl FROM tbltrabajador WHERE Correo = ?";
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, trabajador.getCorreo());
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                tipo = rs.getInt("TipoEmpl");
            }
        }
        return tipo;
    }

    public String Decrip(Clientes clientes) throws SQLException
    {
        String contrasena = null;
        String sql = "SELECT convert( aes_decrypt(unhex(Contraseña),'clave')using utf8) AS contrdesc from tblclientes where Correo = ?";

        try (PreparedStatement stm = conn.prepareStatement(sql);){

            stm.setString(1, clientes.getCorreo());
            ResultSet rs = stm.executeQuery();
            if(rs.next())
            {
                String contra= rs.getString("contrdesc");
                contrasena = contra;
            }


        }
        return contrasena;
    }

    public String DecripEm(Trabajador trabajador) throws SQLException
    {
        String contrasena = null;
        String sql = "SELECT convert( aes_decrypt(unhex(Contrasena),'clave')using utf8) AS contrdesc from tbltrabajador where Correo = ?";

        try (PreparedStatement stm = conn.prepareStatement(sql);){

            stm.setString(1, trabajador.getCorreo());
            ResultSet rs = stm.executeQuery();
            if(rs.next())
            {
                String contra= rs.getString("contrdesc");
                contrasena = contra;
            }

            System.out.println("Contraseña obtenida de la base de datos: " + contrasena);
        }

        return contrasena;
    }

    public String MostrarNomC(Clientes clientes) throws SQLException
    {
        String Nombre = null;
        String Apellido = null;
        String sql = "SELECT nombre, apellido  FROM tblclientes where correo = ?";

        try (PreparedStatement stm = conn.prepareStatement(sql);){

            stm.setString(1, clientes.getCorreo());
            ResultSet rs = stm.executeQuery();
            if(rs.next())
            {
                String n= rs.getString("nombre");
                String a= rs.getString("apellido");
                Nombre = n;
                Apellido = a;

            }

        }
        return (Nombre +" "+ Apellido);

    }
    public String MostrarEmpl(Trabajador trabajador) throws SQLException
    {
        String Nombre = null;
        String Apellido = null;
        String sql = "SELECT nombre, apellido  FROM tbltrabajador where correo = ?";

        try (PreparedStatement stm = conn.prepareStatement(sql);){

            stm.setString(1, trabajador.getCorreo());
            ResultSet rs = stm.executeQuery();
            if(rs.next())
            {
                String n= rs.getString("nombre");
                String a= rs.getString("apellido");
                Nombre = n;
                Apellido = a;

            }


        }
        return (Nombre +" "+ Apellido);

    }

}
