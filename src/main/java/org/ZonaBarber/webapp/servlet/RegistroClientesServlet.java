package org.ZonaBarber.webapp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.ZonaBarber.webapp.models.beans.Clientes;
import org.ZonaBarber.webapp.models.repositories.ClientesRepositoryJdbcImpl;
import org.ZonaBarber.webapp.models.repositories.ValidacionesRepocitoryLoginRegister;


import javax.print.DocFlavor;
import java.io.IOException;
import java.sql.*;

@WebServlet("/registroClientes")
public class RegistroClientesServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Connection conn = (Connection) req.getAttribute("conn");


        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String direccion = req.getParameter("direccion");
        String identificacion = req.getParameter("identificacion");
        String tipo_identificacion = req.getParameter("tipo_identificacion");
        String celular = req.getParameter("celular");
        String correo = req.getParameter("correo");
        String contrasena = req.getParameter("contrasena");

        Clientes clientes = new Clientes();

        clientes.setNombre(nombre);
        clientes.setApellido(apellido);
        clientes.setDireccion(direccion);
        clientes.setIdentificacion(identificacion);
        clientes.setTipo_identificacion(tipo_identificacion);
        clientes.setCelular(celular);
        clientes.setCorreo(correo);
        clientes.setContraseña(contrasena);


        ClientesRepositoryJdbcImpl clienteR = new ClientesRepositoryJdbcImpl(conn);
        ValidacionesRepocitoryLoginRegister validacionR = new ValidacionesRepocitoryLoginRegister(conn);


        try {
            if (validacionR.existeCliente(clientes) > 0) {
                req.setAttribute("mansajeUsuarioEx", "El usuario ya se encuentra registrado, pruebe iniciando sesión");
                RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
                dispatcher.forward(req, resp);
            } else if (clienteR.guardar(clientes) == 1) {
                req.setAttribute("mansajeUsuarioC", "El usuario ha sido creado correctamente");
                RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
                dispatcher.forward(req, resp);
            } else {
                resp.sendRedirect("error.jsp");
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }


}


