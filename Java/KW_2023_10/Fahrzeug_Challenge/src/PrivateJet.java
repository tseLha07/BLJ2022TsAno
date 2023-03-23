import java.time.Year;

public class PrivateJet extends Vehicles {

    String speed;

    public PrivateJet(String index,String type, String brand, String speed, float price, Year ageRestriction, String color) {
        super(index, type, brand, price, ageRestriction, color);
        this.speed = speed;
    }
}
