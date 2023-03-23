package org.example;

import java.time.LocalDate;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private LocalDate published;
    private int id;

    public Book(int id, String title, String author, LocalDate published){
        this.id = id;
        this.title=title;
        this.author=author;
        this.published=published;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public String tostring(){
        return "ID: " + id + "Title: " + title + "\nAuthor: " + author + "\nPublished: " + published;
    }


    @Override
    public int compareTo(Book o) {
        return this.id - o.id;
    }
}
