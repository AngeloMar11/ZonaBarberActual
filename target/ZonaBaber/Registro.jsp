<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

    <style>
        body{
            background: #2E57A5;
            background: linear-gradient(to right, #333333, #2E57A5)
        }
        .bg{
            background-image: url(img/ZonaBarberlogin.png);
            background-position: center;
            
        }
    </style>
</head>

<body>
    
   <div class="container w-75 mt-5 shadow">
    <div class="row align-items-stretch">
        <div class="col bg d-none d-lg-block col-md-5 col-lg-5 col-xl-6 rounded-2">

        </div>
            <div class="col bg-white p-5 rounded-2">
                <div class="text-end">
                    <img src="img/LogoZonaBarber.png" width="48px" alt="">
                </div>
                <h2 class="fw-bold text-center ">Registrate</h2>

                <!-- registro -->

                <form action="<%=request.getContextPath()%>/registroClientes" class="row m-md-2 needs-validation" novalidate method="post">
                    <div class="mb-1">
                        <label for="name" class="form-label">Nombre</label>
                        <input type="text" class="form-control" name="name" maxlength="20" required >
                        <div class="valid-feedback">
                            ok
                        </div>
                        <div class="invalid-feedback">
                            El nombre es requerido
                        </div>
                    </div>

                    <div class="mb-1">
                        <label for="Address" class="form-label">Apellido</label>
                        <input type="text" class="form-control" name="Address" maxlength="20" required>
                        <div class="valid-feedback">
                            ok
                        </div>
                        <div class="invalid-feedback">
                            El apellido es requerido
                        </div>
                    </div>

                    <div class="mb-1">
                        <label for="Address" class="form-label">Dirección</label>
                        <input type="text" class="form-control" name="Address" maxlength="20" required>
                        <div class="valid-feedback">
                            ok
                        </div>
                        <div class="invalid-feedback">
                            La Direccion es requerida
                        </div>
                    </div>

                    <div class="mb-1">
                        <label for="IdType" class="form-label">Tipo de Documento</label>
                        <select class="form-select" name="IdType" aria-label="Default select" required>
                            <option selected disabled value="">--Tipo de Identificación--</option >
                            <option value="1">Tarjeta de Identidad</option>
                            <option value="2">Cédula de ciudadania</option>
                            <option value="3">Cédula Extranjera</option>
                          </select>
                        <div class="valid-feedback">
                            ok
                        </div>
                        <div class="invalid-feedback">
                            Seleccione un tipo de Documento
                        </div>                        
                    </div>

                    <div class="mb-1">
                        <label for="Address" class="form-label">Número de Documento</label>
                        <input type="text" class="form-control" name="Address" maxlength="10" required="" pattern="[0-9]+">
                        <div class="valid-feedback">
                            ok
                        </div>
                        <div class="invalid-feedback">
                            El Documento es requerido
                        </div>
                    </div>

                    <div class="mb-1">
                        <label for="Address" class="form-label">Telefono</label>
                        <input type="text" class="form-control" name="Address" maxlength="10" required="" pattern="[0-9]+">
                        <div class="valid-feedback">
                            ok
                        </div>
                        <div class="invalid-feedback">
                            El Número de telefono es requerido
                        </div>
                    </div>

                    <div class="mb-1">
                        <label for="email" class="form-label">Correo Electronico</label>
                        <input type="email" class="form-control" name="email" maxlength="20" required>
                        <div class="valid-feedback">
                            ok
                        </div>
                        <div class="invalid-feedback">
                            Ingrese el Correo Electronico
                        </div>
                    </div>
                    <div class="mb-1">
                        <label for="password" class="form-label">contraseña</label>
                        <input type="password" class="form-control" name="password" maxlength="20" required>
                        <div class="valid-feedback">
                            ok
                        </div>
                        <div class="invalid-feedback">
                            Ingrese la Contraseña
                        </div>
                    </div>
                
                    <div class="d-grid">
                        <button type="submit" class="btn btn-primary">Regístrarte</button>
                    </div>

                    <div class="my-3">
                        <span>Ya tienes Cuenta? <a href="index.jsp">Inicia Sesion</a></span> <br>
                    </div>
                
                </form>
            </div>
        </div>
   </div>
   <script>
    // Example starter JavaScript for disabling form submissions if there are invalid fields
    (() => {
        'use strict'

        // Fetch all the forms we want to apply custom Bootstrap validation styles to
        const forms = document.querySelectorAll('.needs-validation')

        // Loop over them and prevent submission
        Array.from(forms).forEach(form => {
            form.addEventListener('submit', event => {
            if (!form.checkValidity()) {
                event.preventDefault()
                event.stopPropagation()
            }

            form.classList.add('was-validated')
            }, false)
        })
    })()

</script>
    
</body>
</html>