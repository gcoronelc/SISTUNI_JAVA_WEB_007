package pe.egcc.eureka.prueba;

import java.math.BigDecimal;

public class Rene {

  
  public static void main(String[] args) {
    BigDecimal a = new BigDecimal("7.10");
    BigDecimal b = new BigDecimal("5.55");
    
    BigDecimal c = a.add(b);
    
    System.out.println("a = " + a.toString());
    System.out.println("b = " + b.toString());
    System.out.println("c = " + c.toString());
  }
}
