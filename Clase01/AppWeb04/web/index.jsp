<%-- 
    Document   : index
    Created on : 03/12/2016, 08:18:15 PM
    Author     : Gustavo Coronel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>MATE APP</title>
  </head>
  <body>

    <h1>MATE APP</h1>

    <form method="post" action="MateController">

      <div>
        <label>Número 1:</label>
        <input type="text" name="num1"/>
      </div>

      <div>
        <label>Número 2:</label>
        <input type="text" name="num2"/>
      </div>

      <div>
        <input type="submit" value="Procesar"/>
      </div>

    </form>

    <c:if test="${model != null}">
      <h1>RESULTADO</h1>
      <table>
        <tr>
          <td>Número 1:</td>
          <td>${model.num1}</td>
        </tr>
        <tr>
          <td>Número 2:</td>
          <td>${model.num2}</td>
        </tr>
        <tr>
          <td>Suma:</td>
          <td>${model.suma}</td>
        </tr>
        <tr>
          <td>Producto:</td>
          <td>${model.producto}</td>
        </tr>
      </table>
    </c:if>

  </body>
</html>
