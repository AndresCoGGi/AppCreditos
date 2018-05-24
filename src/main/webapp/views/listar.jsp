<%-- 
    Document   : listar
    Created on : 23-may-2018, 20:07:30
    Author     : ANDRESCOGI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listados</h1>
        <a class="btn btn-primary"
           href="${pageContext.servletContext.contextPath}/views/listarcreditos.jsp">Listar Creditos</a><br>
        <a class="btn btn-primary"
           href="${pageContext.servletContext.contextPath}/views/listar.jsp">Top Creditos</a><br>
        <a class="btn btn-primary"
           href="${pageContext.servletContext.contextPath}/views/listar.jsp">Credito mas acumulado y valor</a><br>
        <a class="btn btn-primary"
           href="${pageContext.servletContext.contextPath}/views/listar.jsp">mayor prestador</a><br><br>
           
        <a class="btn btn-primary"
           href="${pageContext.servletContext.contextPath}/index.jsp">Regresar</a>   
           
           
    </body>
</html>
