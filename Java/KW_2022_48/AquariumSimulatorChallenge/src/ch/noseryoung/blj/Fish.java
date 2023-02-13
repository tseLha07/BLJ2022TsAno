package ch.noseryoung.blj;

public class Fish
{
    private final String name;
    private  int field_x;
    private  int field_y;

    public  int getField_x() {
        return field_x;
    }

    public  int getField_y() {
        return field_y;
    }

    public String getName() {
        return name;
    }

    public void setField_x(int field_x) {
        this.field_x = field_x;
    }

    public void setField_y(int field_y) {
        this.field_y = field_y;
    }

    public Fish(String name, boolean isSweet, int field_x, int field_y, Aquarium aquarium) {
        this.name = name;
        this.field_x = field_x;
        this.field_y = field_y;

    }

}
