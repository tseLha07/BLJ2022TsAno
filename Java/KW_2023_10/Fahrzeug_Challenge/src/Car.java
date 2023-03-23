import java.time.Year;

public class Car extends Vehicles {
    String speed;
    public Car(String index,String type, String brand, String speed, float price, Year ageRestriction, String color) {
        super(index, type, brand, price, ageRestriction, color);
        this.speed = speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
