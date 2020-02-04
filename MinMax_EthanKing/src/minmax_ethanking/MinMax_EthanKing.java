// Ethan King
package minmax_ethanking;

import javax.swing.JOptionPane;

public class MinMax_EthanKing
{

    public static void main(String[] args)
    {
        //Declare Variables
        int min;
        int max;
        int temp;
        boolean first;
        int loop;
        String input;
        String output;
        
        //Initialize Variables
        first = true;
        loop = max = min = 0;
        
        //do loop for entering and comparing numbers
        do 
        {
            input = JOptionPane.showInputDialog("Enter a number:");
            temp = Integer.parseInt(input);
            if (first)
            {
                min = temp;
                max = temp;
                first = false;
            }
            else if (temp > max)
            {
                max = temp;
            }
            else if (temp < min)
            {
                min = temp;
            }
            loop = JOptionPane.showConfirmDialog(null, "Do you want to enter another "
                    + "number?");        
        } while (loop == 0);
        
        //output
        output = "Min: " + min + "\nMax: " + max;
        JOptionPane.showMessageDialog(null, output);
    }
}
