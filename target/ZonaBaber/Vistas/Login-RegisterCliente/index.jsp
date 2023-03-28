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
            background-image: url(img/Zona\ Barber\ login.png);
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
                    <img src="img/LogoZonaBarber.png"  width="48px" alt="">
                </div>
                <h2 class="fw-bold text-center py-5">Bienvenido</h2>

                <!-- login -->

                <form  action="<%=request.getContextPath()%>/loginC" class="row mt-5 g-5 needs-validation" novalidate method="post">
                    <div class="mb-4">
                        <%--@declare id="email"--%><label for="email" class="form-label">Correo Electronico</label>
                        <input type="email" class="form-control" name="email" maxlength="50" required>
                        <div class="valid-feedback">
                            ok
                        </div>
                        <div class="invalid-feedback">
                            Ingrese el Correo Electronico
                        </div>
                    </div>
                    <div class="mb-4">
                        <%--@declare id="password"--%><label for="password" class="form-label">contraseña</label>
                        <input type="password" class="form-control" name="password" maxlength="50" required>
                        <div class="valid-feedback">
                            ok
                        </div>
                        <div class="invalid-feedback">
                            Ingrese la Contraseña
                        </div>
                    </div>
                
                    <div class="d-grid">
                        <button type="submit" class="btn btn-primary">Iniciar Sesión</button>
                    </div>

                    <div class="my-3">
                        <span>No tienes Cuenta? <a href="Registro.jsp">Registrate</a></span> <br>
                        <span><a href="#">Se me olvido la contraseña</a></span>
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