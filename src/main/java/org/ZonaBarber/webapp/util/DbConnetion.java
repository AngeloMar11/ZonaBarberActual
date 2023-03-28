package org.ZonaBarber.webapp.util;

import java.sql.*;

//import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DbConnetion {


    public class DBconnection {

        private static final String URL = "jdbc:mysql://localhost/zonabarber?serverTimezone=America/Santiago";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "Admin123";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
    }
}
