package ch.noseryoung.main;
import java.util.Scanner;

public class SideCreatorUserInput implements ShapeSideCreator{
    Scanner scanner = new Scanner(System.in);

    @Override
    public double createSide() {
        double userInputSide;
        System.out.println("Side: ");
        userInputSide = scanner.nextDouble();

        return Math.round(userInputSide * 2) / 2.0;
    }
}
