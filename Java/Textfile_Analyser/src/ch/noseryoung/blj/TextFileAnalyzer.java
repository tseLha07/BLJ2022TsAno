package ch.noseryoung.blj;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TextFileAnalyzer {

    public static void writeEvaluationFile(){

        int result = FileIOHandler.size;
        String wordList = String.valueOf(FileIOHandler.Script);

        LocalDateTime DateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = DateTime.format(format);

        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\GitHub Repositories\\BLJ2022TsAno\\Java\\Textfile_Analyser\\script_evaluation.txt"));

            bw.write("["+ formatDateTime + "] [script.txt]\n");
            bw.write("--------------------------------------------\n");
            bw.write("Number of unique words:                     \n");
            bw.write("Total number of words:                  " +   result);
            bw.write("\n");
            bw.write("Most common word:                           \n");
            bw.write("--------------------------------------------\n");


            bw.close();

        } catch (Exception ex) {
            return;
        }
    }
    public static void countOccurrence(){

    }

}

