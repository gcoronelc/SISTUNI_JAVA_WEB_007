package pe.egcc.eureka.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import pe.egcc.eureka.model.Sucursal;
import pe.egcc.eureka.service.spec.RowMapper;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class SucursalMapper implements RowMapper<Sucursal>{

  @Override
  public Sucursal mapRow(ResultSet rs) throws SQLException {
    Sucursal bean = new Sucursal();
    return bean;
  }
  
}
