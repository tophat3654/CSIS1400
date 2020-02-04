// Ethan King
package compoundintrst_ethanking;

import javax.swing.JOptionPane;

public class CompoundIntrst_EthanKing
{

    public static void main(String[] args)
    {
        //declare variables
        int months;
        double monthlySavings;
        double annualInterestRate;
        double monthlyInterestRate;
        double compoundInterestTotal;
        String dialogueInput;
        String formattedInput;
        
        //assigning variables
        compoundInterestTotal = 0;
        
        //prompt user for input to be assigned to variables
        dialogueInput = JOptionPane.showInputDialog("Welcome to the"
                + "Compound Interest Calculator! \nPlease enter how much money"
                + " you put into savings each month:");
        monthlySavings = Double.parseDouble(dialogueInput);
        dialogueInput = JOptionPane.showInputDialog("Now enter your annual "
                + "interest rate:");
        annualInterestRate = Double.parseDouble(dialogueInput);
        monthlyInterestRate = (annualInterestRate / 12) / 100;
        dialogueInput = JOptionPane.showInputDialog("How many months would you "
                + "like to calculate");
        months = Integer.parseInt(dialogueInput);
        
        //prompt user for input (may be commented out if deemed unnecessary)
        //JOptionPane.showMessageDialog(null, "Press OK to calculate!"); 
        
        //for loop to calcuate the interest depending on the months entered
        for (int i = 0; i < months; i++)
        {
            compoundInterestTotal = (monthlySavings + compoundInterestTotal)
                    * (1 + monthlyInterestRate);
            System.out.println(compoundInterestTotal);
        }
        
        //String formatting and output to a dialog box
        formattedInput = String.format("After %d months, your grand "
                + "total is: \n \n %1.2f$!", months, compoundInterestTotal);
        JOptionPane.showMessageDialog(null, formattedInput);
    }
}
