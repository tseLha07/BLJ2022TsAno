import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;
import java.util.ArrayList;

public class Starter {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Person> denyList = new ArrayList<Person>();
    static ArrayList<Contract> contractList = new ArrayList<Contract>();
    static ArrayList<Car> carList = new ArrayList<Car>();
    static ArrayList<Bicycle> bList = new ArrayList<Bicycle>();
    static ArrayList<PrivateJet> pList = new ArrayList<PrivateJet>();
    static ArrayList<Boat> boList = new ArrayList<Boat>();
    static VehicleRentalManager manager = new VehicleRentalManager(denyList, carList, bList, pList, boList, contractList);

    public static void main(String[] args) throws LeaseLengthCollisionException, UnderageException, DenyListException {

        String code = "2345";

        Car car1 = new Car("1","Car", "Renault", "140 km/h", 34950, Year.of(2004), "White");
        Car car2 = new Car("2","Car", "Skoda", "161 km/h", 15390, Year.of(2004), "Red");
        Car car3 = new Car("3", "Car", "MERCEDES-BENZ", "350 km/h", 377500, Year.of(2004), "Black");
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        Bicycle b1 = new Bicycle("1","Mountainbike", "BMC", "Bike without  Motor", 7350, Year.of(2004), "Yellow");
        Bicycle b2 = new Bicycle("2","Citybike", "Gonser", "Bike without Motor", 189, Year.of(2004), "Candy mint");
        Bicycle b3 = new Bicycle("3","Bicycle", "Zenith-Bikes", "Electric", 705, Year.of(2004), "Beige");
        bList.add(b1);
        bList.add(b2);
        bList.add(b3);

        PrivateJet p1 = new PrivateJet("1","Luxus", "Best Private Jet", "643 km/h", 12000, Year.of(2004), "white");
        PrivateJet p2 = new PrivateJet("2","Luxus", "Best Private Jet", "550 km/h", 9000, Year.of(2004), "white");
        pList.add(p1);
        pList.add(p2);

        Boat bo1 = new Boat("1","Boat", "Bayliner", "Two", 176980, Year.of(2004), "white");
        Boat bo2 = new Boat("2","Boat", "Jeanneau", "Two", 250000, Year.of(2004), "white x silver");
        boList.add(bo1);
        boList.add(bo2);

        displaysOptions();

    }

    public static void displaysOptions() {
        while(true) {
            System.out.println("(c) Make a Contract");
            System.out.println("(d) Put a person in Deny List");
            System.out.println("(a) Vehicle in Stock");
            System.out.println("(q) quit");
            String option = scanner.nextLine();

            switch (option) {
                case "c":
                    //Customer Personal Info formular
                    Person customer = new Person();
                    System.out.println("----------------------------------------");
                    System.out.println("Contract Form");
                    System.out.println("Personal Information");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    customer.setName(name);
                    System.out.print("First name: ");
                    String firstName = scanner.nextLine();
                    customer.setFirstName(firstName);
                    System.out.print("Birthyear: ");
                    int bYear = scanner.nextInt();
                    scanner.nextLine();
                    customer.setBirthYear(Year.of(bYear));
                    System.out.print("Street: ");
                    String street = scanner.nextLine();
                    customer.setStreet(street);
                    System.out.print("Street no: ");
                    String streetNo = scanner.nextLine();
                    customer.setStreetNo(streetNo);
                    System.out.print("PLZ: ");
                    String plz = scanner.nextLine();
                    customer.setPlz(plz);
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    customer.setCity(city);
                    Contract contract;
                    try {
                        contract = new Contract();
                    }  catch (LeaseLengthCollisionException e) {
                        throw new RuntimeException(e);
                    } catch (DenyListException e) {
                        throw new RuntimeException(e);
                    } catch (UnderageException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("----------------------------------------");

                    // Vehicle start date
                    contract.setCustomer(customer);
                    /*for (int i = 0; i < manager.getVehicleList().size(); i++) {
                        System.out.printf("%d - %s\n", i, manager.getVehicleList().get(i));
                    }*/
                    System.out.println("Vehicle");
                    int userInput = scanner.nextInt();
                    scanner.nextLine();
                    Vehicles vehicle = manager.getVehicleList().get(userInput);

                    System.out.println("Start Date");
                    System.out.print("Year: ");
                    int year = scanner.nextInt();
                    System.out.print("Month: ");
                    int month = scanner.nextInt();
                    System.out.print("Day: ");
                    int day = scanner.nextInt();
                    contract.setStart(LocalDate.of(year, month, day));

                    // Vehicle end date
                    System.out.println("\nEnd date");
                    System.out.print("Year: ");
                    int eyear = scanner.nextInt();
                    System.out.print("Month: ");
                    int emonth = scanner.nextInt();
                    System.out.print("Day: ");
                    int eday = scanner.nextInt();
                    contract.setEnd(LocalDate.of(eyear, emonth, eday));

                    manager.collectingCustomerInfo(customer);
                    contract.printDetail();
                    break;

                case "a":
                    System.out.println("(c) Car");
                    System.out.println("(b) Boat");
                    System.out.println("(pj) Private-jet");
                    System.out.println("(bi) Bicycle");
                    String optionVehicleType = scanner.nextLine();
                    if (optionVehicleType.equals("c")) {
                        for (Car car : carList) {
                            System.out.println(car);
                        }
                    }
                    break;
                case "d":
                    System.out.println("Code: ");
                    int code = scanner.nextInt();
                    if (code == 2345) {
                        Person dcustomer = new Person();
                        System.out.println("----------------------------------------");
                        System.out.println("Deny List");
                        System.out.println("Name: ");
                        scanner.nextLine();
                        String dname = scanner.nextLine();
                        dcustomer.setName(dname);
                        System.out.println("First name: ");
                        String dfirstName = scanner.nextLine();
                        dcustomer.setFirstName(dfirstName);
                        System.out.println("Birthyear: ");
                        int dbYear = scanner.nextInt();
                        dcustomer.setBirthYear(Year.of(dbYear));
                        System.out.println("Street: ");
                        scanner.nextLine();
                        String dstreet = scanner.nextLine();
                        dcustomer.setStreet(dstreet);
                        System.out.println("Street no: ");
                        String dstreetNo = scanner.nextLine();
                        dcustomer.setStreetNo(dstreetNo);
                        System.out.println("PLZ: ");
                        String dplz = scanner.nextLine();
                        dcustomer.setPlz(dplz);
                        System.out.println("City: ");
                        String dcity = scanner.nextLine();
                        dcustomer.setCity(dcity);
                        manager.addPersonToDenyList(dcustomer);
                    }
                    break;
                case "q":
                    System.exit(0);
            }
        }
    }
}
