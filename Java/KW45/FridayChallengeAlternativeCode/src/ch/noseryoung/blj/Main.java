package ch.noseryoung.blj;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person[] persArr = new Person [40];
        Person.initPersonArray(persArr);
        Person.printList(persArr);

        String path = "C:\\GitHub Repositories\\BLJ2022TsAno\\Java\\Personen_Aufgabe.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine())  != null) {
                String[] values = line.split(",");
                System.out.println(values[4] + "." + values[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}