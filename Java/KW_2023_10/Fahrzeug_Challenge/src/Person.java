import java.time.Year;

public class Person {
    private String name;
    private String firstName;
    private Year birthYear;
    private String street;
    private String streetNo;
    private String plz;
    private String city;

    public Person(String name, String firstName, Year birthYear, String street, String streetNo, String plz, String city){
        this.name = name;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.street = street;
        this.streetNo = streetNo;
        this.plz = plz;
        this.city = city;
    }

    public Person(){

    }

    public void printDetail(){
        String detail = "---------------------------" + "\nName: " + name + "\nFirst name: " + firstName + "\nBirth year: " + birthYear + "\nStreet: " + street + "\nStreet no: " + streetNo + "\nPLZ: " + plz + "\nCity: " + city;
        System.out.println(detail);
    }

    public Year getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
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

    public void setBirthYear(Year birthYear) {
        this.birthYear = birthYear;
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
