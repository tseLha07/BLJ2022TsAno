package ch.noseryoung.blj;

public class Swan {

    int numberEggs;
    public static void main(String[] args) {

        Swan mother = new Swan();
        Swan mother2 = new Swan();

        mother.numberEggs = 3;
        mother2.numberEggs = 5;

        System.out.println(mother.numberEggs);
        System.out.println(mother2.numberEggs);

    }
}