package pe.egcc.eureka.service.spec;

import pe.egcc.eureka.model.Empleado;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public interface EmpleadoServiceSpec 
  extends CrudServiceSpec<Empleado>{
  
  Empleado validar(String usuario, String clave);
  
  void cambiarClave(String usuario, 
      String clave, String nuevaClave);
  
}
