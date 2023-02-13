package ch.noseryoung.blj;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private int year;
    private int day;
    private int month;
    private String name;

    public Person(int year, int month, int day, String name){
        super();
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentAge(){
        LocalDate birthdate = LocalDate.of(this.getYear(), this.getMonth(), this.getDay());
        return Period.between(birthdate, LocalDate.now()).getYears();
    }
}
