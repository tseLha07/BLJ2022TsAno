package ch.noseryoung.blj;
import java.util.Scanner;
import java.lang.Math.*;
public class calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void volumeCalculator(){
        System.out.println("Enter the diameter in centimetres (cm): ");
        double diameter = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the Length in metres (m):");
        double length = Double.parseDouble(scanner.nextLine());

        double v1 = Math.PI / 4;
        double v2 = length / 10000;
        double volume = v1 * diameter * diameter * v2;

        System.out.println("---------------------------------");
        System.out.println("diameter:       " + diameter);
        System.out.println("length:         " + length);
        System.out.println("Volume:         " + volume);
        System.out.println("---------------------------------");
    }
}
