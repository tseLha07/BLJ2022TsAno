package ch.noseryoung.blj;
import java.util.Scanner;

public class calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void incrementingAddition() {

        int result = 0;
        int temp;

        System.out.println("Increment number from: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("to: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        for (temp = num; temp <= num2; temp++){
            result = temp + result;
        }
        System.out.println("The sum of incremented number from " + num + " till " + num2 + " is " + result + ".");
    }
}
