import java.util.Scanner;

public class Diagrams {
    static void Introduction(){
        System.out.println("1. Christmas tree");
        System.out.println("2. Sand Hour");
        System.out.println("3. Pizza Slice");
        System.out.println("3. Diamond");
        System.out.println("type 'exit' to exit");
        System.out.println("");
    }
    static void ChristmasTree(){
        String star = "*";
        int  count = 1;

        System.out.println("      "+ star.repeat(count));
        System.out.println("     "+ star.repeat(count+ 2));
        System.out.println("    "+ star.repeat(count+ 4));
        System.out.println("   "+ star.repeat(count+ 6));
        System.out.println("  "+ star.repeat(count+ 8));
        System.out.println(" "+ star.repeat(count+ 10));
        System.out.println("     "+ star.repeat(count+ 2));
    }
    static void GlassHour(){
        String star = "*";
        int  count = 1;

        System.out.println("    "+ star.repeat(count+ 4));
        System.out.println("     "+ star.repeat(count+ 2));
        System.out.println("      "+ star.repeat(count));
        System.out.println("     "+ star.repeat(count+ 2));
        System.out.println("    "+ star.repeat(count+ 4));
    }
    static void PizzaSlice(){
        String star = "*";
        int  count = 1;

        System.out.println(""+ star.repeat(count+ 9));
        System.out.print(" "+ star.repeat(count));
        System.out.println("      "+ star.repeat(count));
        System.out.print("  "+ star.repeat(count));
        System.out.println("    "+ star.repeat(count));
        System.out.print("   "+ star.repeat(count));
        System.out.println("  "+ star.repeat(count));
        System.out.print("    "+ star.repeat(count));
        System.out.println(star.repeat(count));
    }
    static void Diamond(){
        String star = "*";
        int  count = 1;
        System.out.println("      "+ star.repeat(count));
        System.out.println("     "+ star.repeat(count+ 2));
        System.out.println("    "+ star.repeat(count+ 4));
        System.out.println("   "+ star.repeat(count+ 6));
        System.out.println("    "+ star.repeat(count+ 4));
        System.out.println("     "+ star.repeat(count+ 2));
        System.out.println("      "+ star.repeat(count));
    }
}
