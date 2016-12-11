<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CAMBIAR CLAVE</title>
</head>
<body>

	<h1>CAMBIAR CLAVE</h1>

	<p>${requestScope.error}</p>

	<form id="form1">

		<table>

			<tr>
				<td>Clave actual:</td>
				<td><input type="password" name="clave" /></td>
			</tr>

			<tr>
				<td>Nueva Clave:</td>
				<td><input type="password" name="nuevaClave" /></td>
			</tr>

			<tr>
				<td>Repite Clave:</td>
				<td><input type="password" name="nuevaClave2" /></td>
			</tr>

			<tr>
				<td colspan="2">
				  <input class="egcc_btn" type="button"
					value="Procesar" id="btnProcesar" />
				</td>
			</tr>


		</table>

	</form>

  <script type="text/javascript">

  $("#btnProcesar").click(function(){

	  var data = $("#form1").serialize();
	  $.post("EmpleadoPostCambiarClave",data,function(obj){
		  if(obj.code == 1){
			  $("#egcc_content").html("");
			  fnShowInfo(obj.text);
			} else {
				fnShowError(obj.text);
			}
		});
	  
	});

  </script>
	</div>
</body>
</html>