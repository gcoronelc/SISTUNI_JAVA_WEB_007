<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CONSULTA DE MOVIMIENTOS</title>
</head>
<body>
  <h1>CONSULTA DE MOVIMIENTOS</h1>
  <form id="form1">
    <label>Cuenta:</label>
    <input type="text" id="cuenta" name="cuenta"/>
    <input type="button" id="btnConsultar" value="Consultar"/>
  </form>
  <div id="divData"></div>
  
  <script type="text/javascript">
  $("#btnConsultar").click(function(){
    $("#divData").hide(500);
    var data = $("#form1").serialize();
    $.post("CuentaGetSaldo",data,function(obj){
      if(obj.code == 1){
        $("#rCuenta").text($("#cuenta").val());
        $("#rSaldo").text(obj.text);
        $("#divSaldo").show(500);
      } else {
        alert(obj.text);
      }
    });
  });
  </script>
  
</body>
</html>