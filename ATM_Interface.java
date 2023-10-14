//Task 3 (CodSoft)
import java.util.*;
public class ATM_Interface
{
    static int balance = 20000;
    static int withdrawnAmt,depositedAmt;
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int choice;
    int balance = 20000;
    do
    {
    System.out.print("\n");
    System.out.println(" [[[!!==  WELCOME TO ICICI ATM SERVICES  ==!!]]]\n");    
    System.out.println("1.DEPOSIT\n2.WITHDRAW\n3.BALANCE\n4.EXIT");
    System.out.println(" ENTER CHOICE TO BE PERFORMED :");
    choice=sc.nextInt();
    switch(choice)
    {
        case 1: 
        System.out.println(" ENTER THE AMOUNT TO BE DEPOSITED:");
        depositedAmt = sc.nextInt();
        Deposit();
        break;
        case 2: 
        System.out.println(" ENTER THE AMOUNT TO BE WITHDRAWN:");
        withdrawnAmt = sc.nextInt();
        Withdrawn();
        break;
        case 3: displayBalance();
        break;
        case 4:
        System.out.println(" THANKYOU FOR VISITING ICICI ATM SERVICES\n"); 
        System.exit(0);
        break;
        default: 
        System.out.println(" INVALID CHOICE");
    }
    }while(choice != 4);
    sc.close();
}
    // Displaying current balance of the account
    public static void displayBalance() {
        System.out.println(" CURRENT BALANCE: " + balance);
        System.out.print("\n");
    }

    // Withdraw Method
    public static void Withdrawn() {
        System.out.print("\n");

        System.out.println(" WITHDRAWING AMOUNT:" + withdrawnAmt);
        if (balance >= withdrawnAmt) {
            if(withdrawnAmt <= 25000)
            {
            balance -= withdrawnAmt;

            System.out.println("\n PLEASE COLLECT YOUR MONEY");
            System.out.print("\n");
            System.out.println(" WITHDRAWL SUCCESSFUL...");
            System.out.print("\n");
            displayBalance();
            }
            else{
                System.out.println(" SORRY! MAXIMUM WITHDRAWAL LIMIT PER DAY IS 25000");
            }

        } else {
            System.out.println(" SORRY! INSUFFICIENT BALANCE");
            System.out.print("\n");

        }
    }
    // Depositing Method
    public static void Deposit() {
        System.out.println();
        System.out.println(" Depositing AMOUNT:" + depositedAmt);
        balance += depositedAmt;

        System.out.println("\n AMOUNT DEPOSITED SUCCESFULLY...");
        System.out.print("\n");
        displayBalance();

    }

}
