package ch.noseryoung.main;

import java.util.Random;

public class SideCreatorService implements ShapeSideCreator{

  Random random = new Random();

  /**
   * This method generates a random <code>double</code>, rounded to .0 or .5.
   *
   * @return the generated value, to be used as a side for a shape
   */
  @Override
  public double createSide() {
    double side;
    side = random.nextDouble();
    return Math.round(side * 2) / 2.0;
  }
}
