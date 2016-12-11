package pe.egcc.eureka.model;

public class JSONModel {

  private int code;
  private String text;

  public JSONModel() {
  }

  public JSONModel(int code, String text) {
    super();
    this.code = code;
    this.text = text;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

}
