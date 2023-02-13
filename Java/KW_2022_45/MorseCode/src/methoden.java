import java.util.HashMap;
import java.util.*;

public class methoden {
    static void translation(HashMap<String, String> morseCode){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(morseCode.get(input.toUpperCase()));
    }
}
