package bblj.noseryoung.ch;

public class Book extends Media{
    String author;

    public Book(String name, String releaseDate, String genre, String language, float price, String author){
        super(name, releaseDate, genre, language, price);
        this.author = author;
    }

    public Book(){

    }

    @Override
    public void printDetail(){
        super.printDetail();
        String moreDetail = "Author: "+author;
        System.out.println(moreDetail);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
