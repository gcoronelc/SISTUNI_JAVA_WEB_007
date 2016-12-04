package pe.egcc.app.prueba;

import pe.egcc.app.model.MateModel;
import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    MateModel model = new MateModel();
    model.setNum1(12);
    model.setNum2(10);
    // Proceso
    MateService mateService;
    mateService = new MateService();
    mateService.procesar(model);
    // Reporte
    System.out.println("Suma: " + model.getSuma());
    System.out.println("Producto: " + model.getProducto());
  }
  
}
