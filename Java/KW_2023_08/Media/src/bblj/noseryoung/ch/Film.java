package bblj.noseryoung.ch;

public class Film extends Media{
    String director;

    public Film(String name, String releaseDate, String genre, String language, float price, String director){
        super(name, releaseDate, genre, language, price);
        this.director = director;
    }
    public Film(){

    }

    @Override
    public void printDetail(){
        super.printDetail();
        String moreDetail = "Director: "+director;
        System.out.println(moreDetail);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        director = director;
    }
}
