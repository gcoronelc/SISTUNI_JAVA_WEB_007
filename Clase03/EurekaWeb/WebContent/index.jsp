<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/normalize.css" rel="stylesheet" type="text/css" />
<link href="css/estilos.css" rel="stylesheet" type="text/css" />
<link href="css/botones.css" rel="stylesheet" type="text/css" />
<title>INGRESO AL SISTEMA</title>
<style type="text/css">
 
 #LOGON{
  background-color: white;
  color: #2c3e50;
  margin: 10px auto;
  padding: 10px;
  width: 450px;
 }

</style>
</head>
<body>
	<div id="LOGON">
	 
	 <div><img src="img/logo.gif"/></div>
	 
	 <h1>INGRESO AL SISTEMA</h1>
	 
	 <p>${requestScope.error}</p>
	 
	 <form method="post" action="LogonIngresar">
	   <table>
	   
	     <tr>
	       <td rowspan="5"><img src="img/user_login.png"/></td>
	       <td></td>
	       <td></td>
	     </tr>
	     
	     <tr>
	       <td>Usuario:</td>
	       <td><input type="text" name="usuario" /></td>
	     </tr>
	     
	     <tr>
	       <td>Clave:</td>
	       <td><input type="password" name="clave" /></td>
	     </tr>
	     
	     <tr>
	       <td></td>
	       <td></td>
	     </tr>
	     
	     <tr>
	       <td colspan="2">
            <input class="egcc_btn" type="submit" value="Ingresar" />	       
	       </td>
	     </tr>
	     
	   
	   </table>
	 
	 </form>
	 
	</div>
</body>
</html>