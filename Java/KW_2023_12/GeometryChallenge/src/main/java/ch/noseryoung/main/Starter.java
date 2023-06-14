package ch.noseryoung.main;

public class Starter {

  public static void main(String[] args) {

    SideCreatorUserInput creatorService = new SideCreatorUserInput();
    TriangleManager sm = new TriangleManager(creatorService);
    sm.run();
  }
}
