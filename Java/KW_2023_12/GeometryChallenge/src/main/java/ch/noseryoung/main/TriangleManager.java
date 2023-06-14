package ch.noseryoung.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TriangleManager {

  private ShapeSideCreator generator;
  private TriangleValidator triangleValidator;
  private ArrayList<Triangle> triangles;
  Scanner userChoice = new Scanner(System.in);

  public TriangleManager(ShapeSideCreator generator) {
    this.generator = generator;
    triangleValidator = new TriangleValidator();
    triangles = new ArrayList<>();
  }

  /**
   * This method is the entry point for the triangle manager.
   * It creates at least one triangle with the <code>ShapeSideCreator</code> instance
   * and prints the triangle with its information.
   */
  public void run() {

    printWelcomeText();
    String choice = "";
    int temp = 1;

    System.out.println("\nCreate a Triangle?");
    System.out.println("(Y) Yes");
    System.out.println("(N) No");
    choice = userChoice.nextLine();

    while (temp > 0) {

      if (choice.equals("Y") || choice.equals("y")) {
        System.out.println("");
        Triangle triangle = generateTriangle();
        boolean isEquilateral = triangleValidator.isEquilateral(triangle);
        boolean isIsosceles = triangleValidator.isIsosceles(triangle);
        boolean isScalene = triangleValidator.isScalene(triangle);

        if (isEquilateral || isIsosceles || isScalene) {
          triangles.add(triangle);
          printTriangleInfo(triangle, isEquilateral, isIsosceles, isScalene);
        }else {
          printTriangleInfo(triangle, isEquilateral, isIsosceles, isScalene);
        }

        System.out.println("");
        System.out.println("(1) Displays created Triangle sorted by their Longest Sides.");
        System.out.println("(2) Displays created Triangle sorted by their Shortest Sides.");
        System.out.println("(3) Displays created Triangles not sorted.");
        System.out.println("(4) Create more Triangles");
        int userInput = userChoice.nextInt();
        if (userInput == 1) {
          System.out.println(getAllTrianglesSortedByLongestSide());
        } else if (userInput == 2) {
          System.out.println(getAllTrianglesSortedByShortestSide());
        } else if (userInput == 3) {
          System.out.println(triangles);
        }
      }else if(choice.equals("N") || choice.equals("n")){
        break;
      }
    }
  }

  /**
   * This method calls an implementation from the <code>ShapeSideCreator</code> Interface
   * to get three sides for a new triangle.
   *
   * @return created triangle
   */
  private Triangle generateTriangle() {
    double sideA = generator.createSide();
    double sideB = generator.createSide();
    double sideC = generator.createSide();
    return new Triangle(sideA, sideB, sideC);
  }

  /**
   * This Method prints out the Triangle Information with the result from the validation.
   *
   * @param t
   * @param isEquilateral
   * @param isIsoceles
   * @param isScalene
   */
  private void printTriangleInfo(Triangle t, boolean isEquilateral, boolean isIsoceles, boolean isScalene) {
    // todo
    if (isEquilateral) {
      //System.out.println("Side A: " + t.getA() + " Side B: " + t.getB() + " Side C: " + t.getC());
      System.out.println("\nThe Triangle is Equilateral.");
    } else if (isIsoceles) {
      //System.out.println("Side A: " + t.getA() + " Side B: " + t.getB() + " Side C: " + t.getC());
      System.out.println("\nThe Triangle is Isoceles.");
    } else if (isScalene) {
      //System.out.println("Side A: " + t.getA() + " Side B: " + t.getB() + " Side C: " + t.getC());
      System.out.println("\nThe Triangle is Scalene.");
    } else {
      System.out.println("\nInvalid Triangle");
    }
  }

  /**
   * This method returns out all generated Triangles, which are sorted by side.
   * The Triangles are compared with its shortest side. The longest "shortest Side" is listed first.
   *
   * @return sorted triangle list
   */
  public ArrayList<Triangle> getAllTrianglesSortedByShortestSide() {
    // todo
    Collections.sort(triangles, new ShortestSide());
    return triangles;
  }

  /**
   * This method returns out all generated Triangles, which are sorted by side.
   * The Triangles are compared with its longest side. The longest "longest Side" is listed first.
   *
   * @return sorted triangle list
   */

  public ArrayList<Triangle> getAllTrianglesSortedByLongestSide() {
    Collections.sort(triangles, new LongestSide());
    return triangles;
  }

  /**
   * This method prints a welcome text for the triangle manager.
   */
  private void printWelcomeText() {
    System.out.println("\n -----------------------------");
    System.out.println("| Let's Create some Triangles |");
    System.out.println(" -----------------------------");
  }
}
