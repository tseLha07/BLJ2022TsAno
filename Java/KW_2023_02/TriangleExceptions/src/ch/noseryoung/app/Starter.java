package ch.noseryoung.app;

public class Starter {
  public static void main(String[] args) {
    // start triangle app
    TriangleApp app = new TriangleApp("Accenture", "Tsering Lhamo Anodunkhartsang");
    app.start();
    app.printHeader();
  }
}
