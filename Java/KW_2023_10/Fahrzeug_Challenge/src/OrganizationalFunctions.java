import java.time.LocalDate;

public interface OrganizationalFunctions {
    public void createContract(Person customer, Vehicles vehicle, LocalDate start, LocalDate end) throws LeaseLengthCollisionException, DenyListException, UnderageException;
    public void collectingCustomerInfo(Person renter);
}
