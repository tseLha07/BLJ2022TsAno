package ch.noseryoung.blj;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static ch.noseryoung.blj.FileIOHandler.Script;

public class TextFileAnalyzer {

    public static String countMostFrequent(ArrayList<String> Script) {

        int freq = 0;
        String res = "";


        for (int i = 0; i < Script.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < Script.size(); j++) {
                if (Script.get(i).equals(Script.get(j))) {
                    count++;
                }
                if (count >= freq) {
                    res = Script.get(i);
                    freq = count;
                }
            }
        }return res;
    }
    public static int countMostFrequentNum(ArrayList<String> Script) {

        int freq = 0;
        String res = "";

        for (int i = 0; i < Script.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < Script.size(); j++) {
                if (Script.get(i).equals(Script.get(j))) {
                    count++;
                }
                if (count >= freq) {
                    res = Script.get(i);
                    freq = count;
                }
            }
        }return freq;
    }

    public static int countDifference(ArrayList<String> Script) {

        int freq = 0;
        String res = "";

        for (int i = 0; i < Script.size(); i++) {
            int count = 0;
            for (int j = 0; j < Script.size(); j++) {
                if (!Script.get(i).equals(Script.get(j))) {
                    count++;
                }
                if (count >= freq) {
                    res = Script.get(i);
                    freq = count;
                }
            }
        }return freq;
    }

    public static void writeEvaluationFile(){

        int result = FileIOHandler.size;
        String wordList = String.valueOf(Script);
        FileIOHandler data = new FileIOHandler();
        data.getStringList();
        String CW = countMostFrequent(data.getStringList());
        int W = countMostFrequentNum(data.getStringList());
        int DW = countDifference(data.getStringList());

        LocalDateTime DateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = DateTime.format(format);

        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\GitHub Repositories\\BLJ2022TsAno\\Java\\Textfile_Analyser\\script_evaluation.txt"));

            bw.write("["+ formatDateTime + "] [script.txt]\n");
            bw.write("Document: Bee Movie Dialogue Transcript\n");
            bw.write("-----------------------------------------------\n");
            bw.write("Number of unique words:                   " + DW);
            bw.write("\n");
            bw.write("Total number of words:                     " +   result);
            bw.write("\n");
            bw.write("Most common word:                     " + CW+" ("+ W +")");
            bw.write("\n");
            bw.write("-----------------------------------------------\n");
            bw.write("WORD                                 OCCURRENCE\n\n");

            for(int i = 0; i < Script.size(); i++){
                int lengthWord = Script.get(i).length();
                String word = Script.get(i);
                int spaces = 45 - lengthWord;
                String neededSpaces = " ";
                for(int j = 0; j < spaces; j++){
                    neededSpaces = neededSpaces + " ";
                }
                word = word + neededSpaces;
                Script.set(i, word);
            }

            Set<String> distinct = new HashSet<>(Script);
            for (String s : distinct) {
                bw.write(s + Collections.frequency(Script, s));
                bw.write(System.getProperty("line.separator"));
            }
            bw.close();
        } catch (Exception ignored) {
        }
    }
}