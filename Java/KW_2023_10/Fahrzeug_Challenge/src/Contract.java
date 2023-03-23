import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
    private Person customer;
    private Vehicles vehicle;
    private LocalDate start;
    private LocalDate end;

    public Contract(Person customer, Vehicles vehicle, LocalDate start, LocalDate end, ArrayList<Person> denyList, ArrayList<Contract> contractList) throws DenyListException, LeaseLengthCollisionException, UnderageException {


            for (Person p : denyList) {
                if (p.equals(customer)) {
                    throw new DenyListException();
                }
            }

        for (Contract c : contractList) {
                if (vehicle.equals(c.getVehicle())) {
                    if (start.isAfter(c.getStart()) && start.isBefore(c.getEnd()) ||
                            end.isAfter(c.getStart()) && end.isBefore(c.getEnd())) {
                        throw new LeaseLengthCollisionException();
                    }
                }
            }
            if (vehicle.getAgeRestriction().isBefore(customer.getBirthYear())) {
                throw new UnderageException();
            }
            this.customer = customer;
            this.vehicle = vehicle;
            this.start = start;
            this.end = end;
            System.out.println("Contract created\n");


    }

    public Contract() throws DenyListException, LeaseLengthCollisionException, UnderageException{

    }

    public void printDetail(){
        String detail = "---------------------------" + "\nCustomer: " + customer + "\nVehicle: " + vehicle + "\nStart date: " + start + "\nEnd Date: " + end;
        System.out.println(detail);
    }


    public Person getCustomer() {
        return customer;
    }

    public Vehicles getVehicle() {
        return vehicle;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }
}




