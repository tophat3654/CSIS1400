//Ethan King
package fractionclass_ethanking;

import java.util.Scanner;

public class FractionClass_EthanKing
{

    public static void main(String[] args)
    {
        Scanner input;
        int temp;
        boolean repeat;
        repeat = true;
        input = new Scanner(System.in);
        Fraction[] fractions = {new Fraction(), new Fraction(-16,5), new Fraction(-51,-4), new Fraction(20,10), new Fraction(6,-18)};
        
        do
        {
            System.out.println("\nInput a number to execute a method: \n"
                    + "1. toString()\n"
                    + "2. reduce()\n"
                    + "3. toMixed()\n"
                    + "4. getDecimal()\n"
                    + "5. Quit\n");
            temp = input.nextInt();
            if (temp == 1)
            {
                System.out.println("\nFractions: ");
                for (Fraction i: fractions)
                {
                    System.out.println(i.toString());
                }
            }
            else if (temp == 2)
            {
                for (Fraction i: fractions)
                {
                    i.reduce();
                }
            }
            else if (temp == 3)
            {
                System.out.println("\nMixed Fractions: ");
                for (Fraction i: fractions)
                {
                    System.out.println(i.toMixed());
                }
            }
            else if (temp == 4)
            {
                System.out.println("\nDecimals: ");
                for (Fraction i: fractions)
                {
                    System.out.println(i.getDecimal());
                }
            }
            else if (temp == 5)
            {
                repeat = false;
            }
            
        } while (repeat == true);
    }
    
    
    
}
