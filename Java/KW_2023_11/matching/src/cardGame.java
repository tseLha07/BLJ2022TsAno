import java.util.*;

public class cardGame {

    static Scanner input=new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("1. Play Game");
        System.out.println("2. Quit");
        byte userPick= input.nextByte(); input.nextLine();

        if(userPick==1){
            menu();
        }

        else if(userPick==2){
            System.out.println("Goodbye");
        }
    }


    /**
     *
     */
    public static void menu(){
        String userChoice="";

        System.out.println("Enter the column and row value for your card:");
        System.out.println("(Choose between 1-4 only)\n\n");

        do
        {
            drawBoard();
            System.out.println("Congrats, you won!");
            System.out.println("Play again? (Y/N)");
            userChoice=input.nextLine();
        }while (userChoice.equals("y")||userChoice.equals("Y"));
        System.out.println("Thank You for playing");
    }


    /**
     * This Method makes the Layout for the game
     */
    public static void drawBoard(){
        int cards[][]=new int[4][4];
        boolean check[][]=new boolean[4][4];

        cards=shuffleDeck();
        System.out.println("   | 1 2 3 4 ");
        System.out.println("---+---------");
        for(int i=0;i<4;++i)
        {
            System.out.print(" " +(i+1) +" | ");
            for(int j=0;j<4;++j)
            {
                System.out.print("* ");
                check[i][j]=false;
            }
            System.out.println();
        }
        System.out.println();
        start(check,cards);
    }

    //starts game instructions
    public static void start(boolean[][] check,int[][] cards){
        boolean over=false;

        char rw0,rw1,cl0,cl1;
        int r1,c1;
        int r2=0,c2=0;

        do
        {
            do
            {
                System.out.println("Choose first card:");
                String rw=new String(input.nextLine());

                rw0=rw.charAt(0);
                cl0=rw.charAt(1);
                r1=Character.digit(rw0,5);
                c1=Character.digit(cl0,5);
                if(check[r1-1][c1-1] == true)
                {
                    System.out.println("This card is already flipped! Try again!");
                }
            }while(check[r1-1][c1-1]!= false);
            do
            {
                System.out.println("Choose second card:");
                String rw11=new String(input.nextLine());
                rw1=rw11.charAt(0);
                cl1=rw11.charAt(1);
                r2=Character.digit(rw1,5);
                c2=Character.digit(cl1,5);
                if(check[r2-1][c2-1] == true)
                {
                    System.out.println("This card is already flipped! Try again!");
                }
                if((r1==r2)&&(c1==c2)){
                    System.out.println("This card is already chosen! Select another card.");
                }
            }while((check[r2-1][c2-1]!= false)||((r1==r2)&&(c1==c2)));
            r1--;
            c1--;
            r2--;
            c2--;
            System.out.println();
            System.out.println("   | 1 2 3 4 ");
            System.out.println("---+---------");
            for (int r=0; r<4; r++)
            {
                System.out.print(" " +(r+1) +" | ");
                for (int c=0; c<4; c++)
                {
                    if ((r==r1)&&(c==c1))
                    {
                        System.out.print(cards[r][c] +" ");
                    }
                    else if((r==r2)&&(c==c2))
                    {
                        System.out.print(cards[r][c] +" ");
                    }
                    else if (check[r][c] == true)
                    {
                        System.out.print(cards[r][c] +" ");
                    }
                    else
                    {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            //keeps cards facing up
            if (cards[r1][c1]==cards[r2][c2])
            {
                System.out.println("Cards Matched!");

                check[r1][c1] = true;
                check[r2][c2] = true;
            }

            System.out.println();

            System.out.println("   | 1 2 3 4 ");
            System.out.println("---+---------");
            // prints board again
            for (int r=0; r<4; r++)
            {
                System.out.print(" " +(r+1) +" | ");
                for (int c=0; c<4; c++)
                {
                    if (check[r][c] == true)
                    {
                        System.out.print(cards[r][c] +" ");
                    }
                    else
                    {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            // checks if all cards are flipped
            over = true;
            for (int r=0; r<4; r++)
            {
                for (int c=0; c<4; c++)
                {
                    if(check[r][c]==false)
                    {
                        over = false;
                        c=5;
                    }
                }
                if(over == false)
                {
                    r=5;
                }
            }
        } while(over != true);
    }

    /**
     * This method
     */
    public static int[][] shuffleDeck(){
        int start[]={1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};

        int cards[][]=new int[4][4];
        Random random=new Random();
        int temp,i;

        for (int s=0; s<=20; s++)
        {
            for (int x=0; x<16; x++)
            {
                i=random.nextInt(100000)%15;
                temp=start[x];
                start[x]=start[i];
                start[i]=temp;
            }
        }
        i=0;

        for (int r=0; r<4; r++)
        {
            for (int c=0; c<4; c++)
            {
                cards[r][c]=start[i];
                i=i+1;
            }
        }

        return cards;
    }
}
