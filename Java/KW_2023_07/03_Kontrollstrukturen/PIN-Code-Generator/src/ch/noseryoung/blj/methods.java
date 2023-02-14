package ch.noseryoung.blj;
import java.lang.*;
import java.text.DecimalFormat;

public class methods {

    public static void generatesPin(){

        DecimalFormat df = new DecimalFormat("0000");

        for(int i = 1; i < 10000; i++){
            String num = df.format(i);
            System.out.println(num);
        }
    }
}
