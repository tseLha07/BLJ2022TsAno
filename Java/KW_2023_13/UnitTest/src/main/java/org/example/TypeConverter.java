package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class TypeConverter {

    static private Scanner scanner = new Scanner(System.in);


    /**
     * This method converts a String to a Short.
     * Accepted Values are:
     *      - (only at first place)
     *      _ and ' (10_000 and 10'000 are equal to 10000)
     *      numbers 0-9
     *
     * @param toConvert String to be converted
     * @return converted short
     * @throws IllegalArgumentException if String cannot be converted
     *
     * @author <todo: Tsering L. Anodunkhartsang>
     */
    public static short convertStringToShort(String toConvert) throws IllegalArgumentException{
        // todo implement

        if(toConvert.charAt(0) == '-'){
            toConvert= toConvert.replace("-","");
        }else if(toConvert.contains("_") && toConvert.charAt(0) != '_' && toConvert.charAt(toConvert.length()-1) != '_' && toConvert.substring(toConvert.length()-1) != "-" && toConvert.substring(0,0) != "'" && toConvert.substring(toConvert.length()-1) != "'" || toConvert.contains("'") && toConvert.charAt(0) != '_' && toConvert.charAt(toConvert.length()-1) != '_' && toConvert.substring(toConvert.length()-1) != "-" && toConvert.substring(0,0) != "'" && toConvert.substring(toConvert.length()-1) != "'"){
            toConvert = toConvert.replace("_","");
            toConvert = toConvert.replace("'","");
        }else {
            throw new IllegalArgumentException();
        }
        return Short.parseShort(toConvert);
    }


    /**
     * This method converts a String to a lowercase Char Array.
     * Accepted Values are:
     *      - (only after second place and before second last place, e.g ge-laufen ist ok, g-elaufen is not ok)
     *      letters a-z and A-Z
     *
     * @param toConvert String to be converted
     * @return converted Char Array
     * @throws IllegalArgumentException if String cannot be converted
     *
     * @author <todo: Tsering L. Anodunkhartsang>
     */
    public static char[] StringToCharArray(String toConvert) throws IllegalArgumentException {
        // todo implement

        char[] ch = new char[toConvert.length()];

        for (int i = 0; i < toConvert.length(); i++) {
            if (toConvert.charAt(2) == '-' || toConvert.charAt(toConvert.length() - 3) == '-') {
                 toConvert= toConvert.replace("-","");
                toConvert= toConvert.replace(" ","");
                ch[i] = toConvert.toLowerCase().charAt(i);
            }else if(!toConvert.contains("-")){
                toConvert= toConvert.replaceAll(" ", "");
                ch[i] = toConvert.toLowerCase().charAt(i);
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        return ch;
    }


    /**
     * This method converts a String to a Long.
     * Accepted Values are:
     *    - (only at first place)
     *    _ and ' (10_000 and 10'000 are equal to 10000)
     *    numbers 0-9
     *
     * @param toConvert String to be converted
     * @return converted long
     * @throws IllegalArgumentException if String cannot be converted
     *
     * @author <todo: Name of author>
     */
    public static Long convertStringToLong(String toConvert) throws IllegalArgumentException{
        // todo implement
        if(toConvert.charAt(0) == '-'){
            return Long.parseLong(toConvert);
        }else if(toConvert.contains("_") && toConvert.charAt(0) != '_' && toConvert.charAt(toConvert.length()-1) != '_' && toConvert.substring(toConvert.length()-1) != "-" && toConvert.substring(0,0) != "'" && toConvert.substring(toConvert.length()-1) != "'" || toConvert.contains("'") && toConvert.charAt(0) != '_' && toConvert.charAt(toConvert.length()-1) != '_' && toConvert.substring(toConvert.length()-1) != "-" && toConvert.substring(0,0) != "'" && toConvert.substring(toConvert.length()-1) != "'"){
            toConvert = toConvert.replace("_","");
            toConvert = toConvert.replace("'","");
            return Long.parseLong(toConvert);
        }else {
            throw new IllegalArgumentException();
        }
    }


    /**
     * This method converts a String to a lowercase Char Array.
     * Accepted Values are:
     *    - (only after second place and before second last place, e.g. ge-laufen is ok, g-elaufen is not ok)
     *    letters a-z and A-Z
     *    each letter is allowed only once
     *
     * @param toConvert String to be converted
     * @return converted Char Array
     * @throws IllegalArgumentException if String cannot be converted
     *
     * @author <todo: Name of author>
     */
    public static HashSet<Character> StringToCharSet(String toConvert){
        // todo implement
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < toConvert.length(); i++) {
            if (toConvert.charAt(2) == '-' || toConvert.charAt(toConvert.length() - 3) == '-') {
                toConvert= toConvert.replace("-","");
                toConvert= toConvert.replace(" ","");
                set.add(toConvert.toLowerCase().charAt(i));
            }else if(!toConvert.contains("-")){
                toConvert= toConvert.replaceAll(" ", "");
                set.add(toConvert.toLowerCase().charAt(i));
            }
            else {
                throw new IllegalArgumentException();
            }
        }

        return set;
    }


    /**
     * This method converts a String to a Double.
     * Accepted Values are:
     *    - (only at first place)
     *    _ and ' (10_000 and 10'000 are equal to 10000)
     *    . and , for decimal (only one allowed)
     *    numbers 0-9
     *
     * @param toConvert String to be converted
     * @return converted Double
     * @throws IllegalArgumentException if String cannot be converted
     *
     * @author <todo: Tsering L. Anodunkhartsang>
     */
    public static double convertStringToDouble(String toConvert) throws IllegalArgumentException{
        // todo implelment
        if(toConvert.charAt(0) == '-'){
            return Double.parseDouble(toConvert);
        }else if(toConvert.contains("_") && toConvert.charAt(0) != '_' && toConvert.charAt(toConvert.length()-1) != '_' && toConvert.substring(toConvert.length()-1) != "-" && toConvert.substring(0,0) != "'" && toConvert.substring(toConvert.length()-1) != "'" || toConvert.contains("'") && toConvert.charAt(0) != '_' && toConvert.charAt(toConvert.length()-1) != '_' && toConvert.substring(toConvert.length()-1) != "-" && toConvert.substring(0,0) != "'" && toConvert.substring(toConvert.length()-1) != "'"){
            toConvert = toConvert.replace("_","");
            toConvert = toConvert.replace("'","");
            toConvert = toConvert.replace(",",".");
            return Double.parseDouble(toConvert);
        }else if(toConvert.contains(".") || toConvert.contains(",")){
            toConvert = toConvert.replace(",",".");
            return Double.parseDouble(toConvert);
        }
        else {
            throw new IllegalArgumentException();
        }


    }
}
