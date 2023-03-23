import java.util.Random;
import java.util.Scanner;

public class GermanGame {
    static Scanner input = new Scanner(System.in);

    public static void layout() {
        int cards[][] = new int[4][4];
        boolean check[][] = new boolean[4][4];

        System.out.println("   | 1 2 3 4 ");
        System.out.println("---¦---------");

        cards = mixCards();
        for (int i = 0; i < 4; ++i) {
            System.out.print(" " + (i + 1) + " | ");
            for (int j = 0; j < 4; ++j) {
                System.out.print("*" + " " + " ");
                check[i][j] = false;
            }
            System.out.println();
        }
        System.out.println();
        checksTheCoordinates(check, cards);
    }

    public static void gameMenu() {
        String userInput = "";

        System.out.println("\nEnter the row and then the column of your card:");
        System.out.println("(Choose coordinates only between 1-4)\n\n");

        do {

            layout();
            System.out.println("Yay!! You Won!");
            System.out.println("Wanna Play again? (Y/N)");
            userInput = input.nextLine();

        } while (userInput.equals("y") || userInput.equals("Y"));

        System.out.println("Bye Bye :D");
    }

    /**
     * @return
     */
    public static int[][] mixCards() {
        int start[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int cards[][] = new int[4][4];
        Random random = new Random();

        int temp;
        int s;

        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j < 16; j++) {
                s = random.nextInt(100000) % 15;
                temp = start[j];
                start[j] = start[s];
                start[s] = temp;
            }
        }
        s = 0;

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                cards[r][c] = start[s];
                s = s + 1;
            }
        }

        return cards;
    }

    public static void checksTheCoordinates(boolean[][] check, int[][] cards) {
        boolean over = false;

        char row0, row1, col0, col1;
        int r1, c1;
        int r2 = 0, c2 = 0;

        do {
            do {
                System.out.println("Choose first card: ");
                String rw = new String(input.nextLine());

                row0 = rw.charAt(0);
                col0 = rw.charAt(1);
                r1 = Character.digit(row0, 5);
                c1 = Character.digit(col0, 5);

                if (check[r1 - 1][c1 - 1] == true) {
                    System.out.println("This card is Flipped and Open. Try Again:)");
                }
            } while (check[r1 - 1][c1 - 1] != false);

            do {
                System.out.println("Choose second card: ");
                String rw = new String(input.nextLine());

                row1 = rw.charAt(0);
                col1 = rw.charAt(1);
                r2 = Character.digit(row1, 5);
                c2 = Character.digit(col1, 5);

                if (check[r2 - 1][c2 - 1] == true) {
                    System.out.println("This card is Flipped and Open. Try Again:)");
                }
                if ((r1 == r2) && (c1 == c2)) {
                    System.out.println("This card is already chosen. Select another one.");
                }
            } while ((check[r2 - 1][c2 - 1] != false) || ((r1 == r2) && (c1 == c2)));

            r1--;
            c1--;
            r2--;
            c2--;

            System.out.println("\n   | 1 2 3 4 ");
            System.out.println("---|---------");

            for (int r = 0; r < 4; r++) {
                System.out.print(" " + (r + 1) + " | ");
                for (int c = 0; c < 4; c++) {
                    if ((r == r1) && (c == c1)) {
                        System.out.print(cards[r][c] + " ");
                    } else if ((r == r2) && (c == c2)) {
                        System.out.print(cards[r][c] + " ");
                    } else if (check[r][c] == true) {
                        System.out.print(cards[r][c]);
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            System.out.println();

            if (cards[r1][c1] == cards[r2][c2]) {
                System.out.println("Matched !!");

                check[r1][c1] = true;
                check[r2][c2] = true;
            }
            System.out.println();
            System.out.println("   | 1 2 3 4 ");
            System.out.println("---|---------");

            for (int r = 0; r < 4; r++) {
                System.out.print(" " + (r + 1) + " | ");
                for (int c = 0; c < 4; c++) {
                    if (check[r][c] == true) {
                        System.out.print(cards[r][c]);
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            System.out.println();

            over = true;
            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    if (check[r][c] == false) {
                        over = false;
                        c = 5;
                    }
                }
                if (over == false) {
                    r = 5;
                }
            }

        } while (over != true);
    }
}
