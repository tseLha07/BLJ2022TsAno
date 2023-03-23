package blj.noseryoung.ch;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
    LocalDate start;
    LocalDate end;

    public Contract(Person buyer, Vehicles vehicles, LocalDate start, LocalDate end, ArrayList<Person> denyList, ArrayList<Contract> contractList){
        this.start  = start;
        this.end = end;
    }
}
