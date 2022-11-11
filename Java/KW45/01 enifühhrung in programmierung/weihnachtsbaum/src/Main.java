import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Diagrams.Introduction();

        Scanner num = new Scanner(System.in);
        System.out.println("Which diagram would you like?");
        int input = num.nextInt();

        switch (input) {
            case 1:
                Diagrams.ChristmasTree();
                break;
            case 2:
                Diagrams.GlassHour();
                break;
            case 3:
                Diagrams.PizzaSlice();
                break;
            case 4:
                Diagrams.Diamond();
                break;
        }
    }
}
