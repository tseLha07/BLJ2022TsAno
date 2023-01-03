package ch.noseryoung.blj;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Fish> fish = new ArrayList<>();
        Aquarium myAquarium;
        int answer;

        System.out.println("how big is your aquarium?");
        int size = sc.nextInt();
        System.out.println("it sweet water [true/false]");
        boolean isSweet = sc.nextBoolean();
        myAquarium = new Aquarium(isSweet, size);
        myAquarium.initAquarium();
        createFish(fish, myAquarium);

        do {
            System.out.println("what do you want to do now?");
            System.out.println("**************************************");
            System.out.println("1: create a fish");
            System.out.println("2: remove a fish");
            System.out.println("3: move a fish");
            System.out.println("4: show the aquarium");
            System.out.println("5: exit");
            System.out.println("**************************************");
            answer = sc.nextInt();
            if (answer == 1) {
                createFish(fish, myAquarium);
            } else if (answer == 2) {
                deleteFish(fish, myAquarium);
            } else if (answer == 3) {
                moveFish(fish, myAquarium);
            } else if (answer == 4) {
                myAquarium.aquaState();
            }
        } while (answer != 5);
    }


    public static void createFish(ArrayList<Fish> fish, Aquarium myAquarium) {
        boolean cont;

        String name;
        int x, y;
        boolean water;
        boolean A_isSweet = myAquarium.isSweet();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("name of fish: ");
            name = sc.nextLine();

            System.out.println("it can swim in freshwater (true/false)");
            water = sc.nextBoolean();

            System.out.println("x position of fish: ");
            x = sc.nextInt();

            System.out.println("y position of fish: ");
            y = sc.nextInt();
            Fish newfish = new Fish(name, water, x, y, myAquarium);
            fish.add(newfish);
            if (water == A_isSweet) {
                myAquarium.addCords(newfish);
            } else {
                myAquarium.death(newfish);
            }
            System.out.println("create another fish? [y/n]");
            String yn = sc.next();
            cont = yn.equalsIgnoreCase("y");

        } while (cont);
    }

    public static void deleteFish(ArrayList<Fish> fish, Aquarium myAquarium) {
        Scanner sc = new Scanner(System.in);
        for (Fish namefish : fish) {
            System.out.println(namefish.getName());
        }
        System.out.println("which fish do you want to remove?");
        String name = sc.nextLine();
        fish.remove(name);
        for (Fish namefish : fish) {
            String fishname = namefish.getName();
            if (Objects.equals(fishname, name)) {
                myAquarium.removeCords(namefish);
            }

        }

    }

    public static void moveFish(ArrayList<Fish> fish, Aquarium myAquarium) {
        Scanner sc = new Scanner(System.in);
        int done = 0;
        for (Fish bsp : fish) {
            System.out.println(bsp.getName());
        }
        System.out.println("which fish should do you want to move?");
        do {
            String name = sc.nextLine();
            for (Fish namefish : fish) {
                String fishname = namefish.getName();
                if (Objects.equals(fishname, name)) {
                    myAquarium.removeCords(namefish);
                    System.out.println("x coordinate?");
                    int x = sc.nextInt();
                    System.out.println("y coordinate?");
                    int y = sc.nextInt();
                    namefish.setField_x(x);
                    namefish.setField_y(y);
                    myAquarium.addCords(namefish);
                    done = 1;
                    break;
                }
            }
            System.out.println("no. try again");
        } while (done != 1);
    }
}
