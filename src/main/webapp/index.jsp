<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>App Creditos</title>

        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath}/css/signin.css" rel="stylesheet">
    </head>

    <body class="text-center">
        <form class="form-signin"
              action="${pageContext.servletContext.contextPath}/RegistrarServlet"
              method="post">
            <img class="mb-4" src="http://economiaes.com/wp-content/uploads/2011/04/Credito-transferible.jpeg" alt="" width="72" height="72">
            <h1 class="h3 mb-3 font-weight-normal">App Creditos</h1>
            <label for="inputCredito" class="sr-only">Numero Credito</label>
            <input type="text" id="inputEmail" name="txtcredito" class="form-control" placeholder="Numero Credito" required autofocus>
            <label for="inputDocumento" class="sr-only">Documento</label>
            <input type="text" id="inputPassword" name="txtdocumento" class="form-control" placeholder="Documento" required>
            <label for="inputNombre" class="sr-only">Nombre completo</label>
            <input type="text" id="inputPassword" name="txtnombre" class="form-control" placeholder="Nombre completo" required>
            <label for="inputMonto" class="sr-only">Monto a prestar</label>
            <input type="text" id="inputPassword" name="txtmonto" class="form-control" placeholder="Monto a prestar" required>
            <select name="txttipotrabajador" id="inputState" class="form-control" required>
                <option selected>Tipo Trabajador</option>
                <option value="independiente">Independiente</option>
                <option value="dependiente" >Dependiente</option>
            </select>
            <select name="txttipocredito" id="inputState" class="form-control" required>
                <option selected>Tipo Credito</option>
                <option value="vivienda">Vivienda</option>
                <option value="estudio" >Estudio</option>
                <option value="libreinversion" >Libre inversion</option>
            </select>
            <select name="txttrabaja" id="inputState" class="form-control" required>
                <option selected>Trabaja en la compañia?</option>
                <option value="si">Si</option>
                <option value="no" >No</option>
            </select><br>
            <button name="accion" value="crear" 
                                        type="submit" 
                                        class="btn btn-primary">
                                    Registrar</button>
            <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
        </form><br>
    <center>
        <a class="btn btn-primary"
           href="${pageContext.servletContext.contextPath}/views/listar.jsp">Listar Opciones</a> </center>    
    </body>
</html>

