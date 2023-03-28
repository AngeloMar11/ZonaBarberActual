<%--
  Created by IntelliJ IDEA.
  User: Angel
  Date: 20/03/2023
  Time: 5:35 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Crear Usuario</title>
    <link rel="shortcut icon" href="img/LogoSolo.png">
    <!-- Agrega los enlaces a los archivos de Bootstrap CSS y JS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>


        body::before
        {
            content: "";
            background-image: url("img/FondoZonaBarber.png");
            background-size: cover; /* Ajusta el tamaño de la imagen para cubrir el área del cuerpo */
            background-repeat: no-repeat; /* Evita que la imagen se repita en la página */
            background-attachment: fixed; /* Mantiene la imagen en su lugar mientras se desplaza la página */
            position: absolute; /* Establece la posición absoluta de la capa */
            top: 0; /* Ajusta la posición superior de la capa */
            left: 0; /* Ajusta la posición izquierda de la capa */
            width: 100%; /* Establece el ancho de la capa para cubrir todo el cuerpo */
            height: 100%; /* Establece la altura de la capa para cubrir todo el cuerpo */
            opacity: 0.68; /* Establece la opacidad de la capa en 80% */
            z-index: -1; /* Coloca la capa detrás de todo el contenido del cuerpo */

        }

        .navbar-brand{
            width: 80px;
            height: 80px;
            background-color: rgb(255, 255, 255);
        }
        .navbar-brand img {
            height: 60px;
            margin-right: 10px;
            margin-top: -10px;
            width:80px;
        }
        .Nav_Nombre
        {
            margin-left: 50px;
        }

        /* Agrega estilos para la barra lateral plegable */
        .sidebar {
            margin-top: 80px;
            height: 100%;
            width: 0;
            position: fixed;
            z-index: 1;
            top: 0;
            left: 0;
            background-color: #21242a;
            overflow-x: hidden;
            transition: 0.5s;
            padding-top: 60px;
        }

        .sidebar a {
            padding: 8px 8px 8px 32px;
            text-decoration: none;
            font-size: 25px;
            color: #ffffff;
            display: block;
            transition: 0.3s;
        }

        .sidebar a:hover {
            color: #03636e;
        }

        .sidebar .closebtn {
            position: absolute;
            top: 0;
            right: 25px;
            font-size: 36px;
            margin-left: 50px;
        }

        /* Agrega estilos para el botón de abrir la barra lateral */
        .openbtn {
            font-size: 20px;
            cursor: pointer;
            background-color: #f1f1f1;
            color: black;
            padding: 10px 15px;
            border: none;
            margin-top: 10px;
            margin-left: 30px;
        }

        .openbtn:hover {
            background-color: #03636e;
        }

        /* Agrega estilos para el contenido principal */
        .main {
            transition: margin-left .5s;
            padding: 20px;
            margin-left: 30px;
        }

        /* Agrega estilos para la barra de navegación */
        .navbar-default {
            margin-bottom: 0px;
            width: 100%;
        }
        /* Agrega estilos para el texto "Mi sitio web" */
        .navbar-brand span {
            font-size: 30px;
            vertical-align: middle;
        }
        .Seciones {
            margin-top: 20px;

        }
        .glyphicon-user,.glyphicon-log-out {
            margin-top: 13px;
            font-size: 17px; /* cambia el tamaño de la letra */
            color: #737373; /* cambia el color de la letra en formato hexadecimal */
        }

        #form-label, #form-control,
        #form-label1, #form-control1,
        #form-label2, #form-control2,
        #form-label3, #form-control3,
        #form-label4, #form-control4,
        #form-label5, #form-control5,
        #form-label6, #form-control6,
        #form-label7, #form-control7 {
            margin-bottom: 10px;
        }

        #form-label, #form-label1, #form-label2,
        #form-label3, #form-label4, #form-label5,
        #form-label6, #form-label7 {
            display: inline-block;
            width: 150px;
            text-align: left;
            margin-right: 30px;
            margin-top: 20px;
            margin: 15px;
        }

        #form-control, #form-control1, #form-control2,
        #form-control3, #form-control4, #form-control5,
        #form-control6, #form-control7 {
            display: inline-block;
            width: 300px;
            margin-left: 30px;
        }


    </style>
    <script>
        /* Función para abrir la barra lateral */
        function openNav() {
            document.getElementById("mySidebar").style.width = "250px";
            document.getElementById("main").style.marginLeft = "250px";
        }

        /* Función para cerrar la barra lateral */
        function closeNav() {
            document.getElementById("mySidebar").style.width = "0";
            document.getElementById("main").style.marginLeft = "0";
        }

    </script>
</head>
<body>
<!-- Barra de navegación superior -->
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <!-- Agrega el botón de abrir la barra lateral -->

            <button class="openbtn" onclick="openNav()">☰ Opciones</button>

            <label class="Nav_Nombre">Bienvenido<%=request.getAttribute("nombreCliente") %></label>

            <a class="navbar-brand" href="#">
                <img src="img/LogoSolo.png">

            </a>
        </div>
        <div  class="Seiones">
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> Mi cuenta</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Cerrar sesión</a></li>
        </ul>
        </div>
    </div>
</nav>

<!-- Barra lateral plegable -->
<div id="mySidebar" class="sidebar">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="#">Inicio</a>
    <a href="#">Perfil</a>
    <a href="#">Configuración</a>
</div>

<!-- Contenido principal -->
<form action="<%=request.getContextPath()%>/registroEmpleados" method="post">
<div class="main">
    <h1 class="page-header text-center">Registro de Trabajador</h1>
    <p>Ingrese todos los campos.</p>
    <div>
        <%--@declare id="nombre"--%><%--@declare id="apellido"--%><label for="nombre" id="form-label">Nombre</label>
        <input type="text" id="form-control" name="nombre" maxlength="50" required>
        <label for="apellido" id="form-label1">Apellido</label>
        <input type="text" id="form-control1" name="apellido" maxlength="50" required>
    </div>
    <div>
        <%--@declare id="email"--%><%--@declare id="password"--%><label for="email" id="form-label2">Correo Electrónico</label>
        <input type="email" id="form-control2" name="email" maxlength="50" required>
        <label for="password" id="form-label3">Contraseña</label>
        <input type="password" id="form-control3" name="password" maxlength="50" required>
    </div>
    <div>
        <%--@declare id="idtype"--%><%--@declare id="servicio"--%><label for="IdType" id="form-label4">Género</label>
        <select id="form-control4" name="genero" aria-label="Default select" required>
            <option selected disabled value="">--Género--</option>
            <option value="Hombre">Hombre</option>
            <option value="Mujer">Mujer</option>
            <option value="Otro">Otro</option>
        </select>
        <label for="servicio" id="form-label5">Servicio</label>
            <select id="form-control5" name="servicio" aria-label="Default select" required>
                <option selected disabled value="">--Servicio--</option>
                <option value="Barbero">Barbero</option>
                <option value="Estilista">Estilista</option>
                <option value="Otro">Otro</option>
            </select>
    </div>
    <div>
        <%--@declare id="tipo_empleado"--%><%--@declare id="documento"--%><label for="IdType" id="form-label6">Tipo de Empleado</label>
        <select id="form-control6" name="tipoempl" aria-label="Default select" required>
            <option selected disabled value="">--Tipo de empleado--</option>
            <option value="1">Administrador</option>
            <option value="2">Empleado</option>
        </select>
        <label for="documento" id="form-label7">Documento</label>
        <input type="text" id="form-control7" name="documento" maxlength="50" required>
    </div>
    <div>
        <br>
        <button type="submit" class="btn btn-primary">Crear usuario</button>
        <% if(request.getAttribute("mensajeExistente") != null) { %>
        <span style="color:red"><%= request.getAttribute("mensajeExistente") %></span>
        <% } %>
        <% if(request.getAttribute("empleadocreado") != null) { %>
        <span style="color:green"><%= request.getAttribute("empleadocreado") %></span>
        <% } %>
    </div>
</div>
</form>
<!-- Agrega los enlaces a los archivos de jQuery y Bootstrap JS al final del body para que la página cargue más rápido -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Agrega el script para abrir y cerrar la barra lateral plegable -->
<script>
    function openNav() {
        document.getElementById("mySidebar").style.width = "250px";
        document.getElementsByClassName("main")[0].style.marginLeft = "250px";
    }

    function closeNav() {
        document.getElementById("mySidebar").style.width = "0";
        document.getElementsByClassName("main")[0].style.marginLeft = "0";
    }
</script>
</body>
</html>