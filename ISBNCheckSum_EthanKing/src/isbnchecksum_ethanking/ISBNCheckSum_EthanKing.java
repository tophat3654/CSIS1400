// Ethan King
package isbnchecksum_ethanking;

import javax.swing.JOptionPane;

public class ISBNCheckSum_EthanKing
{
    public static void main(String[] args)
    {
        //Declare Variables
        int isbn;
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int num7;
        int num8;
        int num9;
        int num10;
        int loop;
        String input;
        String isbn10;
        
        //Initialize variables
        loop = 0;
        
        //welcome and prompt user for input
        JOptionPane.showMessageDialog(null, "Welcome to the ISBN-10 Computer!");        
        do {
            input = JOptionPane.showInputDialog("Please enter the nine digits of your ISBN:");
            if (input.length() != 9)
            {
                JOptionPane.showMessageDialog(null, "Your number isn't nine digits long!");
            }
            else
            {
               //calcute the ISBN-10
               isbn = Integer.parseInt(input);
               num1 = isbn / 100000000;
               num2 = isbn % 100000000 / 10000000;
               num3 = isbn % 10000000  / 1000000;
               num4 = isbn % 1000000   / 100000;
               num5 = isbn % 100000    / 10000;
               num6 = isbn % 10000     / 1000;
               num7 = isbn % 1000      / 100;
               num8 = isbn % 100       / 10;
               num9 = isbn % 10;
               num10 = ((1 * num1) + (2 * num2) + (3 * num3) + (4 * num4) + 
                       (5 * num5) + (6 * num6) + (7 * num7) + (8 * num8) + 
                       (9 * num9) ) % 11;
               
               //output depending on the tenth digit
               if (num10 != 10)
               {
                    isbn10 = "You're ISBN-10 is:\n"
                       + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8
                       + num9 + num10;  
                    JOptionPane.showConfirmDialog(null, isbn10);       
               }
               else
               {
                    isbn10 = "You're ISBN-10 is:\n"
                       + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8
                       + num9 + "X";    
                    JOptionPane.showConfirmDialog(null, isbn10);   
               }  
            }
            //prompt to loop again or not
            loop = JOptionPane.showConfirmDialog(null, "Would you like to"
                       + " try another number?");
        } while (loop == 0);                    
    }   
}
