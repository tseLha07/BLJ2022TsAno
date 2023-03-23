import java.time.Year;

public class Boat extends Vehicles {
    String cabins;

    public Boat(String index,String type, String brand, String cabins, float price, Year ageRestriction, String color) {
        super(index, type, brand, price, ageRestriction, color);
        this.cabins = cabins;
    }

}
