// Task 1 (CodSoft)
import java.util.*;
import java.util.Random;
public class Number_Game
{
    
   public static void main(String args[])
   {
    
    Game();
    Scanner sc=new Scanner(System.in);
    
    int choice;
    do{
    System.out.println("\n ***New Game*** \nEnter\n 1.To play again \n 2.To exit the game");
    choice=sc.nextInt();
    switch(choice)
    {
        case 1:
        Game();
        break;

        case 2: 
        System.exit(0);
        break;

        default:
            System.out.println("Enter valid choice");
    } 
    }while(choice != 2);

   }
   public static void Game()
    {
    Scanner sc=new Scanner(System.in);
    //random number generated
    boolean usedHint = false;
    int number;
    Random random=new Random(); 
    number=random.nextInt(1,100);
    int user_number;
    System.out.println(" \n        **** NUMBER GAME ****        \n ");
    int guess=0;
    do
    {
        System.out.println("Enter your guess to match the number(1 to 100) :");
        user_number=sc.nextInt();
        if(user_number > number)
        {
            System.out.println("Number is too high !");
            guess=guess+1;
        }
        else if(user_number < number)
        {
            System.out.println("Number is too low !");
            guess=guess+1;
        }
        else if(user_number==number)
        {
             System.out.println("hurray !! Number matched succesfully in"+" "+ guess +" "+"guesses");
             System.out.println("Score : " + guess);
             break;
        }
        if (guess == 3 || guess == 6 && !usedHint) {
                    System.out.print("Do you want to use a hint? (yes/no) : ");
                    String hintOption = sc.next().toLowerCase();
                    if (hintOption.equals("yes")) {
                        System.out.println(" Hint: ! The number is " + (number % 2 == 0 ? "even" : "odd") + " !");
                        System.out.print("\n");
                        usedHint = true;
                    }
                }
    }while(user_number!=number);

    }
}