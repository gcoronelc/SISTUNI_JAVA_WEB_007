package pe.egcc.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.app.model.MateModel;
import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
@WebServlet(name = "MateController", urlPatterns = {"/MateController"})
public class MateController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
  
    // Datos
    MateModel model = new MateModel();
    model.setNum1(Integer.parseInt(request.getParameter("num1")));
    model.setNum2(Integer.parseInt(request.getParameter("num2")));
    // Proceso
    MateService mateService = new MateService();
    mateService.procesar(model);
    // Reporte
    request.setAttribute("model", model);
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
  }

  
  
}
