package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 */
public class MateModel {

  // Datos
  private int num1;
  private int num2;
  // Resultado
  private int suma;
  private int producto;

  public MateModel() {
  }

  public int getNum1() {
    return num1;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public int getSuma() {
    return suma;
  }

  public void setSuma(int suma) {
    this.suma = suma;
  }

  public int getProducto() {
    return producto;
  }

  public void setProducto(int producto) {
    this.producto = producto;
  }

}
