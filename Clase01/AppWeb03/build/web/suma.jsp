<%-- 
    Document   : suma
    Created on : 03/12/2016, 06:58:01 PM
    Author     : Gustavo Coronel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Datos -->
<c:set var="n1" value="${param.num1}" />
<c:set var="n2" value="${param.num2}" />

<!-- Proceso -->
<c:set var="suma" value="${n1 + n2}" />

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
        <td>${n1}</td>
      </tr>
      <tr>
        <td>Número 2:</td>
        <td>${n2}</td>
      </tr>
      <tr>
        <td>Suma:</td>
        <td>${suma}</td>
      </tr>
    </table>
    <a href="index.html">Retornar</a>
  </body>
</html>
