<jsp:include page="seguro.jsp"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/normalize.css" rel="stylesheet" type="text/css" />
<link href="css/estilos.css" rel="stylesheet" type="text/css" />
<link href="css/botones.css" rel="stylesheet" type="text/css" />
<link href="menu/menu.css" rel="stylesheet" type="text/css" />
<title>EUREKA</title>
</head>
<body>
  
  <div class="egcc_page">
  
		<div class="egcc_header">
			<jsp:include page="header.jsp" />
		</div>
	
		<div class="egcc_menu">
			<jsp:include page="menu/menu.jsp" />
		</div>
	
		<div class="egcc_content">Aquí va el contenido</div>
	
		<div class="egcc_footer">
		  <jsp:include page="footer.jsp" />
		</div>

  </div>
</body>
</html>