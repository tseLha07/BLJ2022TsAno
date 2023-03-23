package bblj.noseryoung.ch;

public class Media {

    private String name, releaseDate, genre, language;
    private float price;

    public Media(String name, String releaseDate, String genre, String language, float price){
        this.name = name;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.language = language;
        this.price = price;
    }

    public Media(){

    }

    public void printDetail(){
        String detail = "Name: "+name+"\nReleased on: "+releaseDate+"\nGenre: "+genre+"\nLanguage available in: "+language+"\nPrice: "+price+" CHF";
        System.out.println(detail);
    }


    @Override
    public String toString(){
        return String.format("\nName: %s\nRelease Date: %s\nGenre: %s\nLanguage: %s\nPrice: %f\n", name, releaseDate, genre, language, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
