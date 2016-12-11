<% 
if(session.getAttribute("usuario") == null){
 RequestDispatcher rd;
 rd = request.getRequestDispatcher("index.jsp");
 rd.forward(request, response);
}
%>