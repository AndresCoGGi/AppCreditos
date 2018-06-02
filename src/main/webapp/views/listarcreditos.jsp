<%-- 
    Document   : Menu
    Created on : 02-may-2018, 18:37:10
    Author     : ANDRESCOGI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Menu</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#">AppCreditos</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>


        </nav>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">

                    <table class="table">
                        <caption>Lista de Creditos</caption>
                        <thead>
                            <tr>
                                <th scope="col">Numero Credito</th>
                                <th scope="col">Documento</th>
                                <th scope="col">Nombres</th>
                                <th scope="col">Monto</th>
                                <th scope="col">Tipo Trabajador</th>
                                <th scope="col">Tipo Credito</th>
                                <th scope="col">Trabaja</th>

                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="usuario" items="${sessionScope.LISTADO}">
                                <tr>
                                    <td><c:out value="${usuario.getCredito()}"/></td>
                                    <td><c:out value="${usuario.getDocumento()}"/></td>
                                    <td><c:out value="${usuario.getNombre()}"/></td>
                                    <td><c:out value="${usuario.getMonto()}"/></td>
                                    <td><c:out value="${usuario.getTipotrabajador()}"/></td>
                                    <td><c:out value="${usuario.getTipocredito()}"/></td>
                                    <td><c:out value="${usuario.getTrabaja()}"/></td>
                                    <td></td>

                                </tr>
                        </c:forEach><br>
                        <a class="btn btn-primary" href="${pageContext.servletContext.contextPath}/index.jsp">Regresar</a>
                        </tbody>
                    </table>
                </div>
            </div>

            <!-- Example row of columns -->

            <hr>

            </div> <!-- /container -->

        </main>

        <footer class="container">
            <p>&copy; Company 2017-2018</p>
        </footer>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
        crossorigin="anonymous"></script>

    </body>
</html>
