package pe.egcc.eureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.egcc.eureka.model.JSONModel;
import pe.egcc.eureka.service.impl.CuentaServiceImpl;
import pe.egcc.eureka.service.spec.CuentaServiceSpec;

@WebServlet({ "/CuentaGetSaldo", "/aaaaa" })
public class CuentaController extends HttpServlet {
	
  private static final long serialVersionUID = 1L;

  private CuentaServiceSpec  cuentaService;
  
  @Override
  public void init() throws ServletException {
    cuentaService = new CuentaServiceImpl();
  }
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch (request.getServletPath()) {
    case "/CuentaGetSaldo":
      getSaldo(request, response);
      break;
    }
	}

  private void getSaldo(HttpServletRequest request, 
      HttpServletResponse response) throws IOException {
    JSONModel model = new JSONModel();
    try {
      // Parámetro
      String cuenta = request.getParameter("cuenta");
      // Proceso
      double saldo = cuentaService.getSaldoCuenta(cuenta);
      // Preparo la respuesta
      model.setCode(1);
      model.setText(String.valueOf(saldo));
    } catch (Exception e) {
      // Preparo la respuesta
      model.setCode(-1);
      model.setText(e.getMessage());
    }
    // Salida    
    UtilController.sendJSON(response, model);
  }

}
