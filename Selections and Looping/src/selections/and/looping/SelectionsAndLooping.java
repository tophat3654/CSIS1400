// Ethan King
package selections.and.looping;

import java.util.Scanner;

public class SelectionsAndLooping
{

    public static void main(String[] args)
    {
        int n;
        int count;
        int divisor;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter your divisor: ");
        divisor = count = input.nextInt();
       

        // input the ending number
        System.out.println("Enter the ending number: ");
        n = input.nextInt();
        System.out.println("Below are all the numbers that are evenly divisible "
                + "by " + count + " from 1 up to " + n);

        while (count <= n)
        {
            System.out.print(count + "  ");
            //count += divisor;  // this is the same as: count = count + 3;
            for (int i = 0; i < divisor; i++)
            {
                count++;
            }
        }
        System.out.println();
    }
}
