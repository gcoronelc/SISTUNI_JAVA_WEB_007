<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CONSULTAR SALDO</title>
</head>
<body>
  <h1>CONSULTAR SALDO</h1>
  <form id="form1">
    <label>Cuenta:</label>
    <input type="text" id="cuenta" name="cuenta"/>
    <input type="button" id="btnConsultar" value="Consultar"/>
  </form>
  <div id="divSaldo" style="display: none;">
    <h1>RESULTADO</h1>
    <table>
      <tr>
        <td>Cuenta:</td>
        <td><span id="rCuenta"></span></td>
      </tr>
      <tr>
        <td>Saldo:</td>
        <td><span id="rSaldo"></span></td>
      </tr>    
    </table>
  </div>
  <script type="text/javascript">
  $("#btnConsultar").click(function(){
	  $("#divSaldo").hide(500);
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