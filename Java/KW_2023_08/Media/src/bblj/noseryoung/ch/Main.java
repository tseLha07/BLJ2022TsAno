package bblj.noseryoung.ch;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Media> mediaList = new ArrayList<Media>();
    public static void main(String[] args) {

        while(true) {
            System.out.println("\n(m) unknown Media \n(b) Book \n(f) Film \n(c) CD \n(v) Video game \n(q) Quit \n(a) Collection");
            String chosenOption = scanner.nextLine();
            if(chosenOption.equals("m")){
                layoutM();
            } else if(chosenOption.equals("b")){
                layoutB();
            } else if(chosenOption.equals("f")){
                layoutF();
            } else if(chosenOption.equals("c")){
                layoutCD();
            } else if(chosenOption.equals("v")){
                layoutVG();
            } else if (chosenOption.equals("a")){
                System.out.println(mediaList);
            }
            else if (chosenOption.equals("q")){
                break;
            }else{
                System.out.println("enter a valid Option!");
            }
        }
    }

    public static void layoutM(){
        Media m = new Media();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        m.setName(name);
        System.out.println("Release Date: ");
        String releaseDate = scanner.nextLine();
        m.setReleaseDate(releaseDate);
        System.out.println("Genre: ");
        String genre = scanner.nextLine();
        m.setGenre(genre);
        System.out.println("Language: ");
        String language = scanner.nextLine();
        m.setLanguage(language);
        System.out.println("Price: ");
        String price = scanner.nextLine();
        m.setPrice(Float.parseFloat(price));
        m.printDetail();
        mediaList.add(m);
    }
    public static void layoutB(){
        Book b = new Book();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        b.setName(name);
        System.out.println("Release Date: ");
        String releaseDate = scanner.nextLine();
        b.setReleaseDate(releaseDate);
        System.out.println("Genre: ");
        String genre = scanner.nextLine();
        b.setGenre(genre);
        System.out.println("Language: ");
        String language = scanner.nextLine();
        b.setLanguage(language);
        System.out.println("Price: ");
        String price = scanner.nextLine();
        b.setPrice(Float.valueOf(price));
        System.out.println("Author: ");
        String author = scanner.nextLine();
        b.setAuthor(author);
        b.printDetail();
        mediaList.add(b);
    }
    public static void layoutF(){
        Film f = new Film();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        f.setName(name);
        System.out.println("Release Date: ");
        String releaseDate = scanner.nextLine();
        f.setReleaseDate(releaseDate);
        System.out.println("Genre: ");
        String genre = scanner.nextLine();
        f.setGenre(genre);
        System.out.println("Language: ");
        String language = scanner.nextLine();
        f.setLanguage(language);
        System.out.println("Price: ");
        String price = scanner.nextLine();
        f.setPrice(Float.valueOf(price));
        System.out.println("Director: ");
        String director = scanner.nextLine();
        f.setDirector(director);
        f.printDetail();
        mediaList.add(f);
    }
    public static void layoutCD(){
        CD c = new CD();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        c.setName(name);
        System.out.println("Release Date: ");
        String releaseDate = scanner.nextLine();
        c.setReleaseDate(releaseDate);
        System.out.println("Genre: ");
        String genre = scanner.nextLine();
        c.setGenre(genre);
        System.out.println("Language: ");
        String language = scanner.nextLine();
        c.setLanguage(language);
        System.out.println("Price: ");
        String price = scanner.nextLine();
        c.setPrice(Float.valueOf(price));
        System.out.println("Type: ");
        String type = scanner.nextLine();
        c.setType(type);
        c.printDetail();
        mediaList.add(c);
    }
    public static void layoutVG(){
        VideoGame vg = new VideoGame();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        vg.setName(name);
        System.out.println("Release Date: ");
        String releaseDate = scanner.nextLine();
        vg.setReleaseDate(releaseDate);
        System.out.println("Genre: ");
        String genre = scanner.nextLine();
        vg.setGenre(genre);
        System.out.println("Language: ");
        String language = scanner.nextLine();
        vg.setLanguage(language);
        System.out.println("Price: ");
        String price = scanner.nextLine();
        vg.setPrice(Float.valueOf(price));
        vg.printDetail();
        mediaList.add(vg);
    }
}
