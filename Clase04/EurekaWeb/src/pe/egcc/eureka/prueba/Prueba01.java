package pe.egcc.eureka.prueba;

import java.sql.Connection;

import javax.swing.JOptionPane;

import pe.egcc.eureka.service.impl.CuentaServiceImpl;
import pe.egcc.eureka.service.spec.CuentaServiceSpec;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    Connection cn = null;
    try {
      // Dato
      String cuenta;
      cuenta = JOptionPane.showInputDialog(
              "Ingreso codigo de cuenta");
      // Proceso
      CuentaServiceSpec service = new CuentaServiceImpl();
      double saldo = service.getSaldoCuenta(cuenta);
      // Resultado
      System.out.println("Saldo: " + saldo);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }
}
