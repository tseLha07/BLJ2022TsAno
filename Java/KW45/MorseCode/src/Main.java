import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> morseCode = new HashMap<String, String>();

        morseCode.put("A", "._");
        morseCode.put("B", "_...");
        morseCode.put("C", "_._.");
        morseCode.put("D", "_..");
        morseCode.put("E", ".");
        morseCode.put("F", ".._.");
        morseCode.put("G", "__.");
        morseCode.put("H", "....");
        morseCode.put("I", "..");
        morseCode.put("J", ".___");
        morseCode.put("K", "_._");
        morseCode.put("L", "._..");
        morseCode.put("M", "__");
        morseCode.put("N", "_.");
        morseCode.put("O", "___");
        morseCode.put("P", ".__.");
        morseCode.put("Q", "__._");
        morseCode.put("R", "._.");
        morseCode.put("S", "...");
        morseCode.put("T", "_");
        morseCode.put("U", ".._");
        morseCode.put("V", "..._");
        morseCode.put("W", ".__");
        morseCode.put("X", "_.._");
        morseCode.put("Y", "_.__");
        morseCode.put("Z", "__..");
        morseCode.put(" ", " ");

        while(true) {
            methoden.translation(morseCode);
        }

    }
}
