// Ethan King

package logicaloperators_ethanking;

import javax.swing.JOptionPane;

public class LogicalOperators_EthanKing
{
    
    public static void main(String[] args)
    {
        //Declare Variables
        int number;
        String input;
        String output;
        boolean conditionOne;
        boolean conditionTwo;
        boolean conditionThree;
                
        //Assign Bools
        conditionOne = false;
        conditionTwo = false;
        conditionThree = false;
        
        //Welcome players and prompt for input
        JOptionPane.showMessageDialog(null, "Welcome to the Logical Operators "
                + "Test!");
        input = JOptionPane.showInputDialog("Enter a whole number, and we'll test it"
                + " against the following conditions:"
                + "\n1. Evenly divisible by 5 AND 6"
                + "\n2. Evenly divisible by 5 OR 6"
                + "\n3. Evenly divisible by 5 OR 6 but NOT both");
        number = Integer.parseInt(input); 
        
        //Test against conditions
        if (number % 5 == 0 && number % 6 == 0)
        {
            System.out.println("boom");
            conditionOne = true;
        }
        
        if (number % 5 == 0 || number % 6 == 0)
        {
            System.out.println("bang");
            conditionTwo = true;
        }
        
        if (number % 5 == 0 ^ number % 6 == 0)
        {
           System.out.println("crackle"); 
           conditionThree = true;
        }
        
        //output results
        output = "Evenly divisible by 5 AND 6: " + conditionOne +
                 "\nEvenly divisible by 5 OR 6: " + conditionTwo +
                 "\nEvenly divisible by 5 OR 6 but NOT both: " + conditionThree;
        
        JOptionPane.showMessageDialog(null, output);
    }
    
}
