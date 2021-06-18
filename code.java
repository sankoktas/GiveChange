import java.util.Scanner;
public class KFS_GiveChange_Main
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the amount received in pennies: ");
        int amountReceived = in.nextInt(); //amount in pennies
        System.out.print("Please enter the amount due in pennies: ");
        int amountDue = in.nextInt(); //amount in pennies
        
        // Declaring the amounts of coins in pennies
        final int DOLLARS_IN_PENNIES = 100; // pennies
        final int QUARTERS_IN_PENNIES = 25; //pennies
        final int DIMES_IN_PENNIES = 10; //pennies
        final int NICKELS_IN_PENNIES = 5; //pennies
        
        int changeLeftInPennies = amountReceived - amountDue; 
        
        int dollars = changeLeftInPennies / DOLLARS_IN_PENNIES; // calculating number of dollars
        changeLeftInPennies = changeLeftInPennies % DOLLARS_IN_PENNIES;  
        
        int quarters = changeLeftInPennies / QUARTERS_IN_PENNIES; // calculating number of quarters
        changeLeftInPennies = changeLeftInPennies % QUARTERS_IN_PENNIES; 
        
        int dimes = changeLeftInPennies / DIMES_IN_PENNIES; // calculating number of dimes
        changeLeftInPennies = changeLeftInPennies % DIMES_IN_PENNIES; 
        
        int nickels = changeLeftInPennies / NICKELS_IN_PENNIES; // calculating number of nickels
        changeLeftInPennies = changeLeftInPennies % NICKELS_IN_PENNIES;
        
        int pennies = changeLeftInPennies; // calculating number of pennies
        
        System.out.println("Give the following change:"); //This portion of the code is where cashier will look at.
        System.out.printf("Dollars  : %d%n", dollars); //%d is used to make our job easier, %n is used instead of println
        System.out.printf("Quarters : %d%n", quarters);
        System.out.printf("Dimes    : %d%n", dimes);
        System.out.printf("Nickels  : %d%n", nickels);        
        System.out.printf("Pennies  : %d%n", pennies);   
    }
}
