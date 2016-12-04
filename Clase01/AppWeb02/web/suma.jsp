<%-- 
    Document   : suma
    Created on : 03/12/2016, 06:58:01 PM
    Author     : Gustavo Coronel
--%>
<%

  // Datos
  int n1 = Integer.parseInt(request.getParameter("num1"));
  int n2 = Integer.parseInt(request.getParameter("num2"));
  // Proceso
  int suma = n1 + n2;

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SUMA</title>
  </head>
  <body>
    <h1>SUMA</h1>
    <table>
      <tr>
        <td>Número 1:</td>
        <td><%= n1%></td>
      </tr>
      <tr>
        <td>Número 2:</td>
        <td><%= n2%></td>
      </tr>
      <tr>
        <td>Suma:</td>
        <td><%= suma%></td>
      </tr>
    </table>
    <a href="index.html">Retornar</a>
  </body>
</html>
