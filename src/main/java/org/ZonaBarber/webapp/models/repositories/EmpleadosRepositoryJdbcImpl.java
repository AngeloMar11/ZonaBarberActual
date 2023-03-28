package org.ZonaBarber.webapp.models.repositories;

import org.ZonaBarber.webapp.models.beans.Trabajador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosRepositoryJdbcImpl implements Repository<Trabajador>{

    private Connection conn;
    public EmpleadosRepositoryJdbcImpl(Connection conn) {
        this.conn = conn;
    }
    @Override
    public List<Trabajador> listar() throws SQLException {
        List<Trabajador> trabajadores = new ArrayList<>();
        String sql;
        sql = "SELECT Nombre, Apellido, Correo, Genero, Servicio, Documento FROM tbltrabajador";
        try (PreparedStatement stm = conn.prepareStatement(sql))
        {

            ResultSet rs = stm.executeQuery();
            while (rs.next())
            {
                Trabajador trabajador = new Trabajador();
                trabajador.setNombre(rs.getString("nombre"));
                trabajador.setApellido(rs.getString("apellido"));
                trabajador.setCorreo(rs.getString("correo"));
                trabajador.setGenero(rs.getString("genero"));
                trabajador.setServicio(rs.getString("servicio"));
                trabajador.setDocumento(rs.getString("documento"));


                trabajadores.add(trabajador);
            }
        }
        return trabajadores;
    }

    @Override
    public Trabajador porId(int id) throws SQLException {


        return null;
    }

    @Override
    public Integer guardar(Trabajador trabajador) throws SQLException {
        String sql;
        if (trabajador.getId() > 0) {
            sql = "update tbltrabajador set nombre=?, precio=?, sku=?, categoria_id=? where id=?";
        }else {
            sql = "INSERT INTO `tbltrabajador` (`Nombre`, `Apellido`, `Correo`, `Contrasena`, `genero`,`Servicio`, `TipoEmpl`, `Documento`) " +
                    "VALUES (UPPER(?), UPPER(?), UPPER(?), hex(aes_encrypt(?,'clave')), UPPER(?), UPPER(?), ?, UPPER(?));";

        }
        int filas;
        try (PreparedStatement stm = conn.prepareStatement(sql)) {



            filas = stm.executeUpdate();
        }
        return filas;

    }

    @Override
    public Integer eliminar(int id) throws SQLException {
        return null;
    }

    @Override
    public Trabajador createObj(ResultSet rs) throws SQLException {
       return null;
    }
}
