package ch.noseryoung.blj;
import java.util.Scanner;

public class calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void getUserInput() {
        System.out.println("Enter your biological sex (m/f):");
        String sex = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your weight in kg: ");
        float weight = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter your height in cm: ");
        float height = Float.parseFloat(scanner.nextLine());

        if(sex.equals("m")){

            float m1 = (float) (13.7 * weight);
            float m2 = (float) (5 * height);
            float m3 = (float) (8 * age);
            float result = (float) (66.47 + m1 + m2 + m3 - 6);

            System.out.println("Calorie rate");
            System.out.println("-----------------------------");
            System.out.println("Sex:                " + sex);
            System.out.println("age:                " + age);
            System.out.println("Weight (in kg):     " + weight);
            System.out.println("Height (in cm):     " + height);
            System.out.println("-----------------------------");
            System.out.println("Calorie per day: " + result);
        } else if (sex.equals("f")) {

            float m1 = (float) (9.6 * weight);
            float m2 = (float) (1.8 * height);
            float m3 = (float) (-4.7 * age);
            float result = (float) (655.1 + m1 + m2 + m3);

            System.out.println("Calorie rate");
            System.out.println("-----------------------------");
            System.out.println("Sex:                " + sex);
            System.out.println("age:                " + age);
            System.out.println("Weight (in kg):     " + weight);
            System.out.println("Height (in cm):     " + height);
            System.out.println("-----------------------------");
            System.out.println("Calorie per day: " + result);
        }
    }
}
