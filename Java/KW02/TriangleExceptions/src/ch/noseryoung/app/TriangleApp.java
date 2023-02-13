package ch.noseryoung.app;

import ch.noseryoung.exceptions.TriangleException;
import ch.noseryoung.exceptions.ZeroTriangleSideException;
import ch.noseryoung.exceptions.TriangleIsLineException;
import ch.noseryoung.exceptions.NegativeTriangleSideException;
import ch.noseryoung.exceptions.IllegalTriangleSideException;
import ch.noseryoung.exceptions.ImpossibleTriangleException;

import java.util.Objects;
import java.util.Scanner;

public class TriangleApp {

  private String company;
  private String handler;

  private boolean isRunning;

  private String sideAInput;
  private String sideBInput;
  private String sideCInput;

  private double sideA;
  private double sideB;
  private double sideC;

  private String code;

  /**
   * The constructor.
   * 
   * @param company of type String to print in the application header
   * @param handler of type String to print in the application header
   */
  public TriangleApp(String company, String handler) {
    this.company = company;
    this.handler = handler;
    this.isRunning = true;
  }

  /**
   * This method starts the actual application. It will remain in a loop as long
   * as the field "isRunning" is true.
   */
  public void start() {
    printHeader();
    while (isRunning) {
      System.out.println("\nTEST CASES TRIANGLE\n");

      // get all 3 sides from the triangle
      promptSide();

      try {
		// validate Input (might throw exception)
        validateInput();
        determineTriangleType();
		// get triangle code and write it to field code
      } catch (TriangleException e) {
        // get error code from exception and write it to field code
      } finally {
		// print result
        printResult();
		// ask user for next step
        promptAction();
      }
    }
  }

  /**
   * This method prints the application header.
   */
    public void printHeader() {
    // create header with handler, company and current year
    System.out.println("**************************************************************************");
    System.out.println("                            TRIANGLE INFORMATIK -                         ");
    System.out.println("**************************************************************************");
    System.out.println("COMPANY:    "+ company);
    System.out.println("HANDLER:    "+ handler);
    System.out.println("**************************************************************************\n");
    System.out.println("TEST CASES TRIANGLE");
  }

  /**
   * This method prints the evaluated code in an aesthetically pleasing way.
   */
  private void printResult() {
    System.out.println("----------------------");
    System.out.println("CODE:          " + code);
    System.out.println("----------------------");
  }

  /**
   * This method prompts the user to give an input for a trinalge side.
   *
   * @return the input of type String.
   */
  private String promptSide() {

    String side = new String();
    Scanner scan = new Scanner(System.in);

    System.out.println("Cathetus A:   %d");
    side = scan.nextLine();

    System.out.println("Cathetus B:   %d");
    side = scan.nextLine();

    System.out.println("Hypotenuse C:   %d");
    side = scan.nextLine();
    return side;
  }

  /**
   * This method prompts the user to give an input.<br>
   * "q": Quits the program.<br>
   * "c": Continues the program.<br>
   * else: Keeps asking for an input until "q" or "c" is entered.
   */
  private void promptAction() {

    System.out.println("<q> QUIT");
    System.out.println("<c> CONTINUE");

    Scanner scan = new Scanner(System.in);
    String action = scan.nextLine();
    // get valid prompt
    
	// check if program needs to be cancelled
	
    System.out.println("******************************");
  }

  /**
   * This method validates the three entered values, to be used as sides for a
   * triangle.
   * 
   * @throws TriangleException if the validation fails. This means that the
   *                           entered values do not lead to a triangle.
   */
  private void validateInput() throws TriangleException {
    // validate sideAInput, sideBInput, sideCInput as double

    try {
      sideA = Double.parseDouble(sideAInput);
      sideB = Double.parseDouble(sideBInput);
      sideC = Double.parseDouble(sideCInput);
    } catch (NumberFormatException e){

    }
    if (sideA == 0 || sideB == 0 || sideC == 0) {
      throw new ZeroTriangleSideException();
    } else if (sideA == char || sideB == char || sideC == char){
      throw new IllegalTriangleSideException();
    } else if (sideA < 0 || sideB < 0 || sideC < 0) {
      throw new NegativeTriangleSideException();
    } else if (sideA + sideB = sideC || sideB + sideC = sideA || sideC + sideA = sideB){
      throw new TriangleIsLineException();
    }
  }

  /**
   * This method determines whether the three entered values lead to a
   * equilateral, isosceles, right-angled or scalene triangle.
   * 
   * @return The corresponding code for each triangle.
   */
  private String determineTriangleType() throws TriangleException {
    // todo
    if () {
      throw new ImpossibleTriangleException();
    } else if () {
      throw new TriangleException("TRI72TF");
    }else if (sideA == sideB && sideB != sideC || sideB == sideC && sideC != sideA || sideC == sideA && sideA != sideB){
      throw new TriangleException("TR184TF");
    } else if (sideA == sideB && sideB == sideC) {
      throw new TriangleException("TRI66TF");
    } else if (sideA != sideB && sideB != sideC){
      throw new TriangleException("TRI60TF");
    }
  } return
}
