package ch.noseryoung.blj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileIOHandler {
    static ArrayList<String> Script = new ArrayList<>();
    static int size = Script.size();

    public static void ReadScript() throws Exception {

        File file = new File("script.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        // System.out.println(line);

        while (line != null){
            line = line.toLowerCase().replaceAll("[\",!?.-]","");
            String[] split = line.split(" ");
            for (String item: split ) {
                Script.add(item);
            }
            line = br.readLine();
        } br.close();

        for (int i = 0; i < Script.size();) {
            if (Script.get(i).equals("")){
                Script.remove(i);
            } else {
                i++;
            }
        }for (String string :
                Script) {
            System.out.println(string);
        }
        size = Script.size();
    }
    public ArrayList<String> getStringList() {
        return Script;
    }
}
