import java.time.Year;

public class Bicycle extends Vehicles {
    String power;

    public Bicycle(String index, String type, String brand, String power, float price, Year ageRestriction, String color) {
        super(index, type, brand, price, ageRestriction, color);
        this.power = power;
    }
}
