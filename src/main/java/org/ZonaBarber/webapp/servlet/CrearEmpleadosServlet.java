package org.ZonaBarber.webapp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.ZonaBarber.webapp.models.beans.Trabajador;
import org.ZonaBarber.webapp.models.repositories.EmpleadosRepositoryJdbcImpl;
import org.ZonaBarber.webapp.models.repositories.ValidacionesRepocitoryLoginRegister;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/registroEmpleados")
public class CrearEmpleadosServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Connection conn = (Connection) req.getAttribute("conn");

        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String genero = req.getParameter("genero");
        String servicio = req.getParameter("servicio");
        String tipoempl = req.getParameter("tipoempl");
        String documento = req.getParameter("documento");

        Trabajador trabajador = new Trabajador();

        trabajador.setNombre(nombre);
        trabajador.setApellido(apellido);
        trabajador.setCorreo(email);
        trabajador.setContrasena(password);
        trabajador.setGenero(genero);
        trabajador.setServicio(servicio);
        trabajador.setTipoEmpl(Integer.parseInt(tipoempl));
        trabajador.setDocumento(documento);

        EmpleadosRepositoryJdbcImpl empleadosR = new EmpleadosRepositoryJdbcImpl(conn);
        ValidacionesRepocitoryLoginRegister validacionR = new ValidacionesRepocitoryLoginRegister(conn);

        try {
            if(validacionR.existeCorreoEmple(trabajador) > 0) {
                req.setAttribute("mensajeExistente", "El usuario que desea crear ya existe");
                RequestDispatcher dispatcher = req.getRequestDispatcher("/CrearUsuAdmin.jsp");
                dispatcher.forward(req, resp);
            }else if (empleadosR.guardar(trabajador) == 1) {
                String Nombre = validacionR.MostrarEmpl(trabajador);
                req.setAttribute("nombreCliente", Nombre);
                req.setAttribute("empleadocreado", "Usuario creado correctamente");
                RequestDispatcher dispatcher = req.getRequestDispatcher("/CrearUsuAdmin.jsp");
                dispatcher.forward(req, resp);
            } else {

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
