import java.util.Scanner;

public class AverageMark {
public static void main(String args[]) {

        int i;
        double marks[] = new double[6];
        double sum = 0.0;
        double avg;

        System.out.println(" ----------------------------");
        System.out.println("|                            |");
        System.out.println("|   Average Mark Generator   |");
        System.out.println("|                            |");
        System.out.println(" ----------------------------");
        System.out.println(" ");
        System.out.println("Enter Mark Value between 1-6");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < marks.length; ++i) {
                System.out.println((i + 1) +".Mark ");
                marks[i] = sc.nextDouble();
                sum = sum + marks[i];

        if(marks[i] < 1 || marks[i] > 6){
                System.out.println("Dumbass! I told you not to\n");
        return;
        }
        }
        avg = sum / 6;
        System.out.println("Average = "+ avg);
        }
}

