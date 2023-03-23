package Vehicles;

import java.time.LocalDate;

public class Car extends Vehicles {
    public Car(String brand, String speed, float price, LocalDate ageRestriction, String color) {
        super(brand, speed, price, ageRestriction, color);
    }
}
