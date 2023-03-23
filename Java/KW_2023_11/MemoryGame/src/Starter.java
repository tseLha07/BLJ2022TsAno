import java.util.*;


public class Starter {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("1. Play Memory Game");
        System.out.println("2. Quit");
        byte userInput = input.nextByte(); input.nextLine();

        if(userInput == 1){
            Game.gameMenu();
        }else if(userInput == 2){
            System.out.println("Goodbye! :)");
        }
    }
}