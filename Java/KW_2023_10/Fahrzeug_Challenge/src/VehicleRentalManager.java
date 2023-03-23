import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRentalManager implements OrganizationalFunctions{

    static Scanner scanner = new Scanner(System.in);

    private ArrayList<Person> customerList = new ArrayList<Person>();
    private ArrayList<Person> denyList = new ArrayList<Person>();
    private ArrayList<Vehicles> vehicleList = new ArrayList<Vehicles>();
    private ArrayList<Contract> contractList = new ArrayList<Contract>();

    public VehicleRentalManager(ArrayList denyList, ArrayList vehicleList1, ArrayList vehicleList2, ArrayList vehicleList3, ArrayList vehicleList4, ArrayList contractList) {
        this.customerList = denyList;
        this.vehicleList = vehicleList1;
        this.vehicleList = vehicleList2;
        this.vehicleList = vehicleList3;
        this.vehicleList = vehicleList4;
        this.contractList = contractList;
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

    public void showVehicleList(){
        System.out.println(vehicleList);
    }

    public void addPersonToDenyList(Person customer){
        denyList.add(customer);
    }

    public void addVehicle(Vehicles vehicle){
        vehicleList.add(vehicle);
    }

    public ArrayList<Person> getCustomerList() {
        return customerList;
    }

    public ArrayList<Person> getDenyList() {
        return denyList;
    }

    public ArrayList<Vehicles> getVehicleList() {
        return vehicleList;
    }

    public ArrayList<Contract> getContractList() {
        return contractList;
    }

    public void setCustomerList(ArrayList<Person> customerList) {
        this.customerList = customerList;
    }

    public void setDenyList(ArrayList<Person> denyList) {
        this.denyList = denyList;
    }

    public void setVehicleList(ArrayList<Vehicles> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void setContractList(ArrayList<Contract> contractList) {
        this.contractList = contractList;
    }
}
