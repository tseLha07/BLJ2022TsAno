package ch.noseryoung.blj;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class Word {
    static ArrayList<String> WordList = new ArrayList<>();
    static Random rw = new Random();
    public static final String PURPLE = "\033[0;35m";
    public static final String RESET = "\033[0m";
    public static void ReadFile() throws Exception {
        File file = new File("wordList.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        while (line != null){
            WordList.add(line);
            line = br.readLine();
            //System.out.println(line);
        }
        br.close();
    }

    public static String RandomWordGenerator(){
        int randomItem = rw.nextInt(WordList.size());
        String randomWord = WordList.get(randomItem);
        randomWord = randomWord.toLowerCase();
        for(int i = 0;  i < 5; i++) {
            char RW = randomWord.charAt(i);
            System.out.print(RW);
        } System.out.println("\n");
        return randomWord;
    }

    public static void makeWordGrid(String GuessedWord){
        Scanner scan = new Scanner(System.in);
        System.out.println("word?: ");
        System.out.println("|  "+GuessedWord.charAt(0)+"  |  "+GuessedWord.charAt(1)+"  |  "+GuessedWord.charAt(2)+"  |  "+GuessedWord.charAt(3)+"  |  "+GuessedWord.charAt(4)+"  |");
        System.out.println("+-----+-----+-----+-----+-----+");
    }
    public static void checkWord(String GuessedWord, String randomWord){
        for(int i = 0; i < 5; i++){
            if(GuessedWord.charAt(i) == randomWord.charAt(i)){
                String charToString = Character.toString(GuessedWord.charAt(i));
                charToString = PURPLE + charToString + RESET;
                System.out.println(charToString);
            }
        }
    }
}
