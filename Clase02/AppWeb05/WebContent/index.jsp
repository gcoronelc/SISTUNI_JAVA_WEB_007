<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
    uri="http://java.sun.com/jsp/jstl/core"  %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>DEMO DE SESSION</h1>
  <form method="post" action=Grabar>
    <label>Ciuadad:</label>
    <input type="text" name="ciudad"/>
    <input type="submit" value="Procesar"/>
  </form>
  <h1>LISTADO</h1>
  <ul>
    <c:set var="n" value="0" />
    <c:forEach items="${sessionScope.lista}" var="r">
      <li>${r} 
        <a href="Eliminar?ciudad=${r}">Eliminar</a>
        <a href="Eliminar2?index=${n}">Eliminar 2</a>
      </li>
      <c:set var="n" value="${n + 1}" />
    </c:forEach>
  </ul>
</body>
</html>