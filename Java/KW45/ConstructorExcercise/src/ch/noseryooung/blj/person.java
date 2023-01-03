package ch.noseryooung.blj;

public class person {
    private String name;
    private String favouriteColor;

    public person(String name){
        this.name = name;
    }
    public void presentYourself(){
        System.out.println("Hallo, ich bin " + name + " und meine lieblingsfarbe ist " + favouriteColor );
    }

    public String getName() {
        return name;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    public void setFavouriteColor(String favouriteColor) {
        this.favouriteColor = favouriteColor;
    }
}