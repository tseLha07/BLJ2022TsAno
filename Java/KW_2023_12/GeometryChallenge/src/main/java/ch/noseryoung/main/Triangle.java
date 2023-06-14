package ch.noseryoung.main;

public class Triangle {
  private double a;
  private double b;
  private double c;

  public Triangle(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public String toString(){
    return "\nSide A: " + a + ", Side B: " + b + ", Side C: " + c;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }

  public void setA(double a) {
    this.a = a;
  }

  public void setB(double b) {
    this.b = b;
  }

  public void setC(double c) {
    this.c = c;
  }
}
