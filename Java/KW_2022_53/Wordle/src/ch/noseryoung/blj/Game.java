package ch.noseryoung.blj;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {

        System.out.println("\n" +
                "██╗    ██╗ ██████╗ ██████╗ ██████╗ ██╗     ███████╗\n" +
                "██║    ██║██╔═══██╗██╔══██╗██╔══██╗██║     ██╔════╝\n" +
                "██║ █╗ ██║██║   ██║██████╔╝██║  ██║██║     █████╗  \n" +
                "██║███╗██║██║   ██║██╔══██╗██║  ██║██║     ██╔══╝  \n" +
                "╚███╔███╔╝╚██████╔╝██║  ██║██████╔╝███████╗███████╗\n" +
                " ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚══════╝╚══════╝\n" +
                "                                                   \n");

        System.out.println("You've got seven tries!\nGuess the word:)");
        System.out.println();

        Word.ReadFile();
        String randomWord = Word.RandomWordGenerator();

            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < 7; i++) {
                System.out.println("word?: ");
                String GuessedWord = scan.nextLine();
                Word.makeWordGrid(GuessedWord);
                Word.checkWord(GuessedWord, randomWord);
            }
    }
}
