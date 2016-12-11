package pe.egcc.eureka.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pe.egcc.eureka.model.Empleado;
import pe.egcc.eureka.model.JSONModel;
import pe.egcc.eureka.service.impl.EmpleadoServiceImpl;
import pe.egcc.eureka.service.spec.EmpleadoServiceSpec;

@WebServlet({"/EmpleadoPostCambiarClave","/Aaaaa"})
public class EmpleadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EmpleadoServiceSpec empleadoService;
	
	@Override
	public void init() throws ServletException {
	  empleadoService = new EmpleadoServiceImpl();
	}
	
	@Override
	protected void service(HttpServletRequest request, 
	    HttpServletResponse response) 
	        throws ServletException, IOException {
	  switch (request.getServletPath()) {
    case "/EmpleadoPostCambiarClave":
      postCambiarClave(request,response);
      break;
    }
	}

  private void postCambiarClave(HttpServletRequest request, 
      HttpServletResponse response) 
      throws IOException {
    JSONModel model = new JSONModel();
    try {
      // Datos
      String clave = request.getParameter("clave");
      String nuevaClave = request.getParameter("nuevaClave");
      String nuevaClave2 = request.getParameter("nuevaClave2");
      // Verificar clave
      if(!nuevaClave.equals(nuevaClave2)){
        throw new Exception("Datos incorrectos.");
      }
      // Proceso
      HttpSession session = request.getSession();
      Empleado bean = (Empleado) session.getAttribute("usuario");
      empleadoService.cambiarClave(bean.getUsuario(),clave,nuevaClave);
      model.setCode(1);
      model.setText("Proceso ok.");
    } catch (Exception e) {
      model.setCode(-1);
      model.setText(e.getMessage());
    }
    // Generar JSON
    UtilController.sendJSON(response, model);
  }

	
	
}
