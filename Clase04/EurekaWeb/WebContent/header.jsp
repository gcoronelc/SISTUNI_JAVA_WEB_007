<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<table style="width: 100%;">
  <tr>
    <td><img src="img/logo.gif"/></td>
    <td>
      Usuario: ${sessionScope.usuario.usuario}<br/>
      <a href="LogonSalir">Salir</a>
      <a href="#" id="lnkCambiarClave">Cambiar Clave</a>    
    </td>  
  </tr>
</table>