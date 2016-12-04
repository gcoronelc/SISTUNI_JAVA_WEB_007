package pe.egcc.app.service;

import pe.egcc.app.model.MateModel;

/**
 *
 * @author Gustavo Coronel
 */
public class MateService {

  public void procesar(MateModel model){
    // Proceso
    int suma = model.getNum1() + model.getNum2();
    int prod = model.getNum1() * model.getNum2();
    // Reporte
    model.setSuma(suma);
    model.setProducto(prod);
  }
  
}
