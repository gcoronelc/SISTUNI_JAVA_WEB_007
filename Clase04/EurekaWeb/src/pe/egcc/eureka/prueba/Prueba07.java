package pe.egcc.eureka.prueba;

import pe.egcc.eureka.service.impl.EmpleadoServiceImpl;
import pe.egcc.eureka.service.spec.EmpleadoServiceSpec;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba07 {
  
  public static void main(String[] args) {
    try {
      // Datos
      String usuario = "cromero";
      String clave = "Kazador";
      String nuevaClave = "kazador";
      // Proceso
      EmpleadoServiceSpec service;
      service = new EmpleadoServiceImpl();
      service.cambiarClave(usuario, clave, nuevaClave);
      System.out.println("Proceso ok");
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
