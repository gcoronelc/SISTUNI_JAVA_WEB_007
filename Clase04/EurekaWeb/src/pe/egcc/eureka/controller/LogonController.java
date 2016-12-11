package pe.egcc.eureka.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pe.egcc.eureka.model.Empleado;
import pe.egcc.eureka.service.impl.EmpleadoServiceImpl;
import pe.egcc.eureka.service.spec.EmpleadoServiceSpec;

@WebServlet({"/LogonIngresar","/LogonSalir"})
public class LogonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  switch (request.getServletPath()) {
    case "/LogonIngresar":
      logonIngresar(request,response);
      break;
    case "/LogonSalir":
      logonSalir(request,response);
      break;
    }
	}

  private void logonSalir(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    request.getSession().invalidate();
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("fin.jsp");
    rd.forward(request, response);
  }

  private void logonIngresar(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
    String destino;
    try {
      // Datos
      String usuario = request.getParameter("usuario");
      String clave = request.getParameter("clave");
      // Proceso
      EmpleadoServiceSpec empleadoService;
      empleadoService = new EmpleadoServiceImpl();
      Empleado bean = empleadoService.validar(usuario, clave);
      // Guardar datos del empleado
      HttpSession session = request.getSession();
      session.setAttribute("usuario", bean);
      // Destino
      destino = "main.jsp";
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
      destino = "index.jsp";
    }
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher(destino);
    rd.forward(request, response);
  }

}
