import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Salesman extends Person implements OrganizationalFunctions{

    static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Person> customerList = new ArrayList<Person>();
    private static ArrayList<Person> denyList = new ArrayList<Person>();
    private static ArrayList<Vehicles> vehicleList = new ArrayList<Vehicles>();
    private static ArrayList<Contract> contractList = new ArrayList<Contract>();


    public Salesman(String name, String firstName, Year birthYear, String street, String streetNo, String plz, String city) {
        super(name, firstName, birthYear, street, streetNo, plz, city);
    }

    public Salesman(){
        super();
    }

    @Override
    public void createContract(Person customer, Vehicles vehicle, LocalDate start, LocalDate end) throws LeaseLengthCollisionException, DenyListException, UnderageException {
        Contract contract = new Contract(customer, vehicle, start, end, denyList, contractList);
        contractList.add(contract);
    }

    @Override
    public void collectingCustomerInfo(Person customer){
        customerList.add(customer);
    }

    public void addVehicle(Vehicles vehicle){
        vehicleList.add(vehicle);
    }
}
