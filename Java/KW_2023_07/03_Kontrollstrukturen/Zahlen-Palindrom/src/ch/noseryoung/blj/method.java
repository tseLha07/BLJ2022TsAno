package ch.noseryoung.blj;
import java.util.Scanner;

public class method {

    static Scanner scanner = new Scanner(System.in);

    public static void checksTheNumber(){

        for (int i = 1; i > 0;){
            System.out.println("----------------------------");
            System.out.print("Enter any number: ");
            int num = Integer.parseInt(scanner.nextLine());

            int reverse_number = reverseNumber(num);
            System.out.println("reversed number: " + reverse_number);

            System.out.println("----------------------------");

            if(num == reverse_number){
                System.out.println(reverse_number + " is a Palindrome.");
                System.out.println("----------------------------");
            } else{
                System.out.println(reverse_number + " is not a Palindrome.");
                System.out.println("----------------------------");
            }

            System.out.println("(c) continue");
            System.out.println("(q) quit");
            String o = scanner.nextLine();

            if(o.equals("q")){
                break;
            }
        }
    }
    public static int reverseNumber(int number)
    {
        boolean isNoNegative = number < 0 ? true : false;
        if(isNoNegative)
        {
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1)
        {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return isNoNegative == true? reverse*-1 : reverse;
    }

}
