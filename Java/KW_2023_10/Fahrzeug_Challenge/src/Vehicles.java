import java.time.Year;

public class Vehicles {

    private String type;
    private String brand;
    private float price;
    private Year ageRestriction;
    public String color;
    public String index;

    public Vehicles(String index, String type, String brand, float price, Year ageRestriction, String color){
        this.index = index;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.ageRestriction = ageRestriction;
        this.color = color;
    }

    public String toString(String brand, float price, String color){
        return "Type: " + type + "Brand: " + brand + "price: " + price + "Color: " + color;
    }

    public Year getAgeRestriction(){
        return ageRestriction;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getIndex() {
        return index;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAgeRestriction(Year ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
