package ch.noseryoung.blj;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args){
        Person[] persArr = new Person[40];
        initPersonArray(persArr);

        String path = "C:\\GitHub Repositories\\BLJ2022TsAno\\Java\\Personen_Aufgabe.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine())  != null) {
                String[] values = line.split(",");
                System.out.println("Vorname: " + values[0]);
                System.out.println("Geburtstag: " + values[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Person> januar = new ArrayList<>();
        ArrayList<Person> februar = new ArrayList<>();
        ArrayList<Person> märz = new ArrayList<>();
        ArrayList<Person> april = new ArrayList<>();
        ArrayList<Person> mai = new ArrayList<>();
        ArrayList<Person> juni = new ArrayList<>();
        ArrayList<Person> july = new ArrayList<>();
        ArrayList<Person> august = new ArrayList<>();
        ArrayList<Person> september = new ArrayList<>();
        ArrayList<Person> oktober = new ArrayList<>();
        ArrayList<Person> november = new ArrayList<>();
        ArrayList<Person> dezember = new ArrayList<>();
        for (Person obj : persArr) {
            if (obj.getMonth() == 1) {
                januar.add(obj);
            } else if (obj.getMonth() == 2) {
                februar.add(obj);
            } else if (obj.getMonth() == 3) {
                märz.add(obj);
            } else if (obj.getMonth() == 4) {
                april.add(obj);
            } else if (obj.getMonth() == 5) {
                mai.add(obj);
            } else if (obj.getMonth() == 6) {
                juni.add(obj);
            } else if (obj.getMonth() == 7) {
                july.add(obj);
            } else if (obj.getMonth() == 8) {
                august.add(obj);
            } else if (obj.getMonth() == 9) {
                september.add(obj);
            } else if (obj.getMonth() == 10) {
                oktober.add(obj);
            } else if (obj.getMonth() == 11) {
                november.add(obj);
            } else {
                dezember.add(obj);
            }
        }
        System.out.println("2022 haben Geburtstag im");
        System.out.println("Januar");
        for (Person obj : januar) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("Februar");
        for (Person obj : februar) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("März");
        for (Person obj : märz) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("April");
        for (Person obj : april) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("Mai");
        for (Person obj : mai) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("Juni");
        for (Person obj : juni) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("Juli");
        for (Person obj : july) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("August");
        for (Person obj : august) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("September");
        for (Person obj : september) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("Oktober");
        for (Person obj : oktober) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("November");
        for (Person obj : november) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
        System.out.println("Dezember");
        for (Person obj : dezember) {
            System.out.println(obj.getDay() + "." + " " + obj.getName() + " " + "(" + obj.getCurrentAge() + ")");
        }
    }

    public static Person[] initPersonArray(Person[] persArr){
        int i = 0;


        persArr[i++] = new Person( 2007, 5, 1, "Marko");
        persArr[i++] = new Person( 2006, 11, 23, "Dylan");
        persArr[i++] = new Person( 2006, 7, 23, "Samuel");
        persArr[i++] = new Person( 2006, 5, 21, "Luis");
        persArr[i++] = new Person( 2001, 12, 19, "Sairam");
        persArr[i++] = new Person( 2002, 11, 13, "Tsering Lhamo");
        persArr[i++] = new Person( 2004, 9, 27, "Nikola");
        persArr[i++] = new Person( 2007, 1, 18, "Noah");
        persArr[i++] = new Person( 2007, 1, 25, "Aurora");
        persArr[i++] = new Person( 1999, 12, 12, "Jasmin");
        persArr[i++] = new Person( 2006, 11, 8, "Fatima");
        persArr[i++] = new Person( 2002, 6, 18, "Sheung Tsung");
        persArr[i++] = new Person( 2006, 1, 23, "Timofey");
        persArr[i++] = new Person( 2007, 7, 7, "Ruben");
        persArr[i++] = new Person( 2006, 12, 26, "Aabish");
        persArr[i++] = new Person( 2005, 7, 23, "Ömer Burak");
        persArr[i++] = new Person( 2006, 5, 23, "Emma");
        persArr[i++] = new Person( 2007, 7, 12, "Oscar");
        persArr[i++] = new Person( 2004, 10, 15, "Jessica");
        persArr[i++] = new Person( 2006, 11, 13, "Nikhil");
        persArr[i++] = new Person( 2006, 5, 7, "Elmar");
        persArr[i++] = new Person( 2006, 5, 22, "Henri");
        persArr[i++] = new Person( 2005, 5, 21, "Virginia");
        persArr[i++] = new Person( 2005, 8, 16, "Yan");
        persArr[i++] = new Person( 2007, 4, 25, "Ilija");
        persArr[i++] = new Person( 2007, 4, 8, "Valentin");
        persArr[i++] = new Person( 2006, 7, 25, "Loris");
        persArr[i++] = new Person( 2007, 6, 1, "Dominic");
        persArr[i++] = new Person( 2006, 10, 20, "Lorena");
        persArr[i++] = new Person( 2005, 3, 10, "Edgar");
        persArr[i++] = new Person( 2006, 12, 16, "Richard");
        persArr[i++] = new Person( 2003, 1, 1, "Saad");
        persArr[i++] = new Person( 2004, 2, 26, "Filip");
        persArr[i++] = new Person( 2004, 5, 4, "Duy Minh");
        persArr[i++] = new Person( 2006, 3, 7, "Timothy");
        persArr[i++] = new Person( 2006, 4, 7, "Jamie");
        persArr[i++] = new Person( 2006, 3, 18, "Jasmin");
        persArr[i++] = new Person( 2002, 4, 25, "Sharujah");
        persArr[i++] = new Person( 2005, 3, 4, "Darko");
        persArr[i++] = new Person( 2006, 4, 7, "Dina");
        return persArr;
    }

}
