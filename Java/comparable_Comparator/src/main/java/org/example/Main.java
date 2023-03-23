package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book b1 = new Book(4,"Alice in Wonderland", "Lewis Caroll", LocalDate.of(1865, Month.NOVEMBER, 02));
        Book b2 = new Book(1,"Memoirs of a Geisha", "Arthur Golden", LocalDate.of(1997, Month.JANUARY, 1));
        Book b3 = new Book(2,"Gone with the Wind", "Margaret Mitchell", LocalDate.of(1936, Month.JUNE, 30));
        Book b4 = new Book(5,"Outlander", "Diana Gabaldon", LocalDate.of(1991, Month.JUNE, 1));
        Book b5 = new Book(3,"Animal Farm", "George Orwell", LocalDate.of(1945, Month.AUGUST, 17));
        Book b6 = new Book(6,"Animal Farm", "Alain Mabanckou", LocalDate.of(2005, Month.JANUARY, 07));

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);

        Collections.sort(books, new NameComparator());

        System.out.println("Books sorted according to Titles:" + books);

        Collections.sort(books, new NameComparator().reversed());

        System.out.println("Books sorted in a descending order according to Titles:" + books);

        //Collections.sort(books, new IDComparator());

        //System.out.println("Books sorted according to ID:" + books);

        //Collections.sort(books, new PublishedComparator());

        //System.out.println("Books sorted according to Published Dates: " + books);

    }
}