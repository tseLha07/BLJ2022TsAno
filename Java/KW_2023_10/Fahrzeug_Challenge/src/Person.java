package blj.noseryoung.ch;

import java.time.LocalDate;

public class Person {
    private String name;
    private String firstName;
    private LocalDate birthDate;
    private String street;
    private String streetNo;
    private String plz;
    private String city;

    public Person(String name, String firstName, String street, String streetNo, String plz, String city){
        this.name = name;
        this.firstName = firstName;
        this.street = street;
        this.streetNo = streetNo;
        this.plz = plz;
        this.city = city;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public String getPlz() {
        return plz;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
