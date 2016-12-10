package pe.egcc.eureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.egcc.eureka.model.JSONModel;

public final class UtilController {

  private UtilController() {
  }
  
  public static void sendJSON(
      HttpServletResponse response,
      JSONModel model) throws IOException{
    // Creando la cadena Json
    Gson gson = new Gson();
    String textJson = gson.toJson(model);
    // Reporte
    // response.setContentType("text/plain;charset=UTF-8");
    response.setContentType("Application/json;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println(textJson);
    out.flush();
    out.close();
  }
  
}
