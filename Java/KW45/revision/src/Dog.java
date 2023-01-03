public class Dog {
    // Eigenschaften in Felder speichern
    private int age;
    private String color;

    //Constructor
    public Dog(int age, String name){

    }

    //Fähigkeiten
    //access modifier; return type; name; (parameter list)
    public void bark(){
        System.out.println("wuff wuff, i'm " + age*7 + "years old");
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
