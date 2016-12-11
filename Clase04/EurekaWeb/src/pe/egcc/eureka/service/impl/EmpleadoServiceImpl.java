package pe.egcc.eureka.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import pe.egcc.eureka.db.AccesoDB;
import pe.egcc.eureka.model.Empleado;
import pe.egcc.eureka.service.mapper.EmpleadoMapper;
import pe.egcc.eureka.service.spec.EmpleadoServiceSpec;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class EmpleadoServiceImpl implements EmpleadoServiceSpec{

  /**
   * Valida el usuario y la clase para un inicio de sesión.
   * 
   * @param usuario Usuario que inicia sesión.
   * @param clave Clave del usuario.
   * @return Retorna el objeto Empleado correspondiente al usuario.
   */
  @Override
  public Empleado validar(String usuario, String clave) {
    Empleado bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_emplcodigo, vch_emplpaterno,"
              + "vch_emplmaterno,vch_emplnombre,"
              + "vch_emplciudad,vch_empldireccion,"
              + "vch_emplusuario from empleado "
              + "where vch_emplusuario=? and vch_emplclave=?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, usuario);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if(rs.next()){
        EmpleadoMapper empleadoMapper = new EmpleadoMapper();
        bean = empleadoMapper.mapRow(rs);
      }
      rs.close();
      pstm.close();
      if(bean == null){
        throw new Exception("Datos incorrectos.");
      }
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return bean;
  }

  @Override
  public Empleado read(String code) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Empleado> read(Empleado bean) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void create(Empleado bean) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void update(Empleado bean) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void delete(String code) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void cambiarClave(String usuario, String clave, String nuevaClave) {
    Connection cn = null;
    try {
      // Obtener objeto Connection
      cn = AccesoDB.getConnection();
      // Actualizar clave
      String sql = "update empleado "
          + "set  vch_emplclave=? "
          + "where vch_emplusuario=? and vch_emplclave=?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, nuevaClave);
      pstm.setString(2, usuario);
      pstm.setString(3, clave);
      int filas = pstm.executeUpdate();
      pstm.close();
      if(filas == 0){
        throw new Exception("Datos incorrectos.");
      }
      // Confirmar Tx
      cn.commit();
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e2) {
      }
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e2) {
      }
    }
  }

  
  
}
