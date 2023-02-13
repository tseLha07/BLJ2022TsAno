import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        methoden.Introduction();

        ArrayList<String> list = new ArrayList<String>();
        Scanner stuffs = new Scanner(System.in);

        while(true) {
            System.out.print("I want to pack ");
            String a = stuffs.nextLine();
            if (a.equals("exit")){
                break;
            }
            list.add(a);
            for (int i = 0; i < list.size(); i++) {
                System.out.println("* "+ list.get(i));
            }System.out.println("");
        }
    }
}
