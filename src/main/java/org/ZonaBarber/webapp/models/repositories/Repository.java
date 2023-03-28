package org.ZonaBarber.webapp.models.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    List<T> listar() throws SQLException;
    T porId(int id) throws SQLException;
    Integer guardar(T t) throws SQLException;
    Integer eliminar(int id) throws SQLException;

    T createObj(ResultSet rs) throws SQLException;

}
