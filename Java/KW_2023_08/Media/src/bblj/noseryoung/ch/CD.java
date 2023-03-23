package bblj.noseryoung.ch;

public class CD extends Media{
    String type;

    public CD(String name, String releaseDate, String genre, String language, float price, String type){
        super(name, releaseDate, genre, language, price);
        this.type = type;
    }
    public CD(){

    }
    @Override
    public void printDetail(){
        super.printDetail();
        String moreDetail = "Type: "+type;
        System.out.println(moreDetail);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
