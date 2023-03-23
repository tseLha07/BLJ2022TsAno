import java.io.FileInputStream;
import java.util.*;
import java.util.Properties;


public class Starter {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) throws Exception {

        FileInputStream german = new FileInputStream("C:\\GitHub Repositories\\BLJ2022TsAno\\Java\\KW_2023_11\\MemoryGame\\resources\\german.properties");
        FileInputStream english = new FileInputStream("C:\\GitHub Repositories\\BLJ2022TsAno\\Java\\KW_2023_11\\MemoryGame\\resources\\english.properties");
        FileInputStream japanese = new FileInputStream("C:\\GitHub Repositories\\BLJ2022TsAno\\Java\\KW_2023_11\\MemoryGame\\resources\\japanese.properties");

        Properties propGer = new Properties();
        Properties propEng = new Properties();
        Properties propJap = new Properties();
        propGer.load(german);
        propEng.load(english);
        propJap.load(japanese);

        System.out.println("Choose Language: ");
        System.out.println("1- English");
        System.out.println("2- German");
        System.out.println("3- Japanese");

        int lanOp = input.nextInt();

        if (lanOp == 1) {
            String optionPlayOrQuit = propEng.getProperty("optionPlayOrQuit");
            String optionQuit = propEng.getProperty("optionQuit");
            String GoodbyeMessage = propEng.getProperty("GoodbyeMessage");

            System.out.println(optionPlayOrQuit);
            System.out.println(optionQuit);
            byte userInput = input.nextByte();
            input.nextLine();

            if (userInput == 1) {
                Game.gameMenu();
            } else if (userInput == 2) {
                System.out.println(GoodbyeMessage);
            }
        } else if (lanOp == 2){
            String optionPlayOrQuit = propGer.getProperty("optionPlayOrQuit");
            String optionQuit = propGer.getProperty("optionQuit");
            String GoodbyeMessage = propGer.getProperty("GoodbyeMessage");

            System.out.println(optionPlayOrQuit);
            System.out.println(optionQuit);
            byte userInput = input.nextByte();
            input.nextLine();

            if (userInput == 1) {
                Game.gameMenu();
            } else if (userInput == 2) {
                System.out.println(GoodbyeMessage);
            }
        }
    }
}