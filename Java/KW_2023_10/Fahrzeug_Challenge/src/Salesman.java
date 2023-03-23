package blj.noseryoung.ch;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Salesman extends Person{

    static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Person> customerList = new ArrayList<Person>();
    private static ArrayList<Person> denyList = new ArrayList<Person>();
    private static ArrayList<Vehicles> vehicleList = new ArrayList<Vehicles>();
    private static ArrayList<Contract> contractList = new ArrayList<Contract>();

    public void createContract(Person renter, Vehicles vehicle, LocalDate start, LocalDate end){
        Contract contract = new Contract(renter, vehicle, start, end, denyList, contractList);

        contractList.add(contract);
    }

    public static void collectingCustomerInfo(Person renter){
        Person customer = new Person();

        System.out.println("Name: ");
        String customerName = scanner.nextLine();
        customer.setName(customerName);

        System.out.println("First name: ");
        String customerFirstName = scanner.nextLine();
        customer.setFirstName(customerFirstName);

        System.out.println("DOB: ");
        String customerBirthDate = scanner.nextLine();
        LocalDate DOB = LocalDate.parse(customerBirthDate);
        customer.setBirthDate(DOB);

        System.out.println("--------------------");
        System.out.println("Address");
        System.out.println("Street: ");
        String customerStreet = scanner.nextLine();
        customer.setStreet(customerStreet);

        System.out.println("Street No.: ");
        String customerStreetNo = scanner.nextLine();
        customer.setStreetNo(customerStreetNo);

        System.out.println("PLZ: ");
        String customerPLZ = scanner.nextLine();
        customer.setStreetNo(customerPLZ);

        System.out.println("City: ");
        String customerCity = scanner.nextLine();
        customer.setStreetNo(customerCity);
        customerList.add(customer);
    }

    public void addPersonToDenyList(Person renter){
        denyList.add(renter);
    }

    public void addVehicle(Vehicles vehicle){
        vehicleList.add(vehicle);
    }
}
