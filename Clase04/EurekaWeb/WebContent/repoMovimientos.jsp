<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REPORTE DE MOVIMIENTOS</title>
</head>
<body>
  
  <h1>REPORTE DE MOVIMIENTOS</h1>
  
  <form id="form1">
    <label>Cuenta:</label>
    <input type="text" id="cuenta" name="cuenta"/>
    <input type="button" id="btnConsultar" value="Ejecutar"/>
  </form>
  
  <div id="divData"></div>
  
  <script type="text/javascript">
  $("#btnConsultar").click(function(){
    var data = $("#form1").serialize();
    var urlRepo = "CuentaRepoMovimientos?" + data;
    var html = "<object width='100%' height='600' data='" + urlRepo + "'></object>";
    $("#divData").html(html);
  });
  </script>
  
</body>
</html>