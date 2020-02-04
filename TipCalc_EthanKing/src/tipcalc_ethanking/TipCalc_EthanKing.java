// Ethan King

package tipcalc_ethanking;

import java.util.Scanner;

public class TipCalc_EthanKing
{

    public static void main(String[] args)
    {
        // Declare Variables
        Scanner input;
        double bill;
        double tip;
        double totalBill;
        
        //Initialize Variables
        input = new Scanner(System.in);
        
        //Welcome User
        System.out.println("Welcome to the Bill and Gratuity Calculator!");
        System.out.println("Please input your your bill prior to gratuity:");
        
        //Get User Input
        bill = input.nextDouble();
        
        //Calculate tip and totalBill
        tip = bill * 0.15;
        totalBill = bill + tip;
        
        //Display bill, tip, and totalBill
        System.out.println("\n--- Restaurant Bill ---\n");
        System.out.printf("Bill: %1.2f$\n\n", bill);
        System.out.printf("Tip: %1.2f$\n\n", tip);
        System.out.printf("Total Bill: %1.2f$", totalBill);
          
    }  
    
}
