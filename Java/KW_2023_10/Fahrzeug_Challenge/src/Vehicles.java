import java.time.LocalDate;

public class Vehicles {

    private String brand;
    private String speed;
    private float price;
    private LocalDate ageRestriction;
    public String color;

    public Vehicles(String brand, String speed, float price, LocalDate ageRestriction, String color){
        this.brand = brand;
        this.speed = speed;
        this.price = price;
        this.ageRestriction = ageRestriction;
        this.color = color;
    }

    public LocalDate geAgeRestriction(){
        return ageRestriction;
    }
}
