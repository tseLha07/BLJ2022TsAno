package org.example;

public class Starter {
    public static void main(String[] args) {
        System.out.println("String to char Array Test:");
        System.out.println(TypeConverter.StringToCharArray("Test-Two"));
        System.out.println(TypeConverter.StringToCharArray("Ge-laufen"));
        System.out.println(TypeConverter.StringToCharArray("test test"));
        System.out.println(TypeConverter.StringToCharArray("Ge-laufene Test"));

        System.out.println("String to short Test:");
        System.out.println(TypeConverter.convertStringToShort("10_0"));
        System.out.println(TypeConverter.convertStringToShort("10'00'0"));
        System.out.println(TypeConverter.convertStringToShort("1_0_00"));
        System.out.println(TypeConverter.convertStringToShort("1_0_00"));

        System.out.println("String to Long Test:");
        System.out.println(TypeConverter.convertStringToLong("10_0"));
        System.out.println(TypeConverter.convertStringToShort("10'00'0"));
        System.out.println(TypeConverter.convertStringToShort("1_0_00"));
        System.out.println(TypeConverter.convertStringToShort("1_0_00"));

        System.out.println("String to char Array Test Duplicates:");
        System.out.println(TypeConverter.StringToCharSet("Gelauf-en"));
        System.out.println(TypeConverter.StringToCharSet("Ge-laufen"));
        System.out.println(TypeConverter.StringToCharSet("test test"));
        System.out.println(TypeConverter.StringToCharSet("Ge-laufene Test"));

        System.out.println("String to Double Test:");
        System.out.println(TypeConverter.convertStringToDouble("10_0.01"));
        System.out.println(TypeConverter.convertStringToDouble("10'00'0,3"));
        System.out.println(TypeConverter.convertStringToDouble("1_0_00.23"));
        System.out.println(TypeConverter.convertStringToDouble("1_0_00"));

    }
}