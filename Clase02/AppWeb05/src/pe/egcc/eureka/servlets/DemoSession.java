package pe.egcc.eureka.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/Grabar", "/Eliminar", "/Eliminar2" })
public class DemoSession extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    switch (request.getServletPath()) {
    case "/Grabar":
      grabar(request, response);
      break;
    case "/Eliminar":
      eliminar(request, response);
      break;
    case "/Eliminar2":
      eliminar2(request, response);
      break;
    }

  } // Fin de service

  private void eliminar2(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    // Dato
    int index = Integer.parseInt(request.getParameter("index"));
    // Grabar en session
    HttpSession session = request.getSession();
    List<String> lista;
    if (session.getAttribute("lista") == null) {
      lista = new ArrayList<>();
      session.setAttribute("lista", lista);
    } else {
      lista = (List<String>) session.getAttribute("lista");
    }
    lista.remove(index);
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
  }

  private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Dato
    String ciudad = request.getParameter("ciudad");
    // Grabar en session
    HttpSession session = request.getSession();
    List<String> lista;
    if (session.getAttribute("lista") == null) {
      lista = new ArrayList<>();
      session.setAttribute("lista", lista);
    } else {
      lista = (List<String>) session.getAttribute("lista");
    }
    lista.remove(ciudad);
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
  }

  @SuppressWarnings("unchecked")
  private void grabar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Dato
    String ciudad = request.getParameter("ciudad");
    // Grabar en session
    HttpSession session = request.getSession();
    List<String> lista;
    if (session.getAttribute("lista") == null) {
      lista = new ArrayList<>();
      session.setAttribute("lista", lista);
    } else {
      lista = (List<String>) session.getAttribute("lista");
    }
    lista.add(ciudad);
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
  }

} // Fin de DemoSession
