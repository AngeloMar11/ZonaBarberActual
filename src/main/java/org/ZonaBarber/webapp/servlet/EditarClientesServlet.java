package org.ZonaBarber.webapp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.ZonaBarber.webapp.models.beans.Trabajador;
import org.ZonaBarber.webapp.models.repositories.EmpleadosRepositoryJdbcImpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/editarEmpl")
public class EditarClientesServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Connection conn = (Connection) req.getAttribute("conn");
        EmpleadosRepositoryJdbcImpl trabajador = new EmpleadosRepositoryJdbcImpl(conn);

        try {
            List<Trabajador> trabajadores = trabajador.listar();
            req.setAttribute("trabajadores", trabajadores);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/EditarEmpl.jsp");
            dispatcher.forward(req, resp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
