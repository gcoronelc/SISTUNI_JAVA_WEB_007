<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PROCESO RETIRO</title>
</head>
<body>
  <h1>PROCESO RETIRO</h1>
  <form id="form1">
    <table>
      <tr>
        <td>Cuenta</td>
        <td><input type="text" name="cuenta"/></td>
      </tr>
      <tr>
        <td>Importe</td>
        <td><input type="text" name="importe"/></td>
      </tr>
      <tr>
        <td>Clave</td>
        <td><input type="password" name="clave"/></td>
      </tr>
      <tr>
        <td colspan="2">
          <input class="egcc_btn" type="button" id="btnProcesar" value="Procesar"/>
        </td>
      </tr>
    </table>
  </form>
  <script type="text/javascript">

  $("#btnProcesar").click(function(){
	  var data = $("#form1").serialize();
	  $.post("CuentaPostRetiro",data,function(obj){
		  if(obj.code == 1){
			  fnShowInfo(obj.text);
			} else {
				fnShowError(obj.text);
			}
		});
	});

  </script>
</body>
</html>