// Ethan King
package mytriangle_ethanking;

import java.util.Scanner;

public class MyTriangle_EthanKing
{
    public static void main(String[] args)
    {
        //Declare Variabls
        double sideA, sideB, sideC, temp, area;
        boolean valid;
        String type;
        
        Scanner kybd;
        kybd = new Scanner(System.in);
        
        //prompt for input
        System.out.println("Please enter the length of the three sides of you triangle: ");
        sideA = kybd.nextDouble();
        sideB = kybd.nextDouble();
        sideC = kybd.nextDouble();
        
        
        //Arrange side values in order
        temp = max3(sideA, sideB, sideC);
        if (temp == sideB)
        {
            sideB = sideC;
            sideC = temp;
        }
        temp = max2(sideA, sideB);
        if (temp == sideA)
        {
            sideA = temp;
            sideB = sideA;
        }
        
        //call methods
        valid = isValid(sideA, sideB, sideC);
        area = area(sideA, sideB, sideC);
        type = triType(sideA, sideB, sideC, valid);
        
        //output
        System.out.println("Type: " + type);
        if (valid == true)
        {
            System.out.printf("Area: %.2f units^2\n\n", area);
        }
    }
    
    public static boolean isValid(double a, double b, double c)
    {
        return ((a + b) > c);
    }
    
    public static double max3(double n1, double n2, double n3)
    {
        if (n1 > n2 && n1 > n3)
        {
            return n1;
        } 
        else if (n2 > n1 && n2 > n3)
        {
            return n2;
        }
        else 
        {
            return n3;
        }
    }
    
    public static String triType(double n1, double n2, double n3, boolean valid)
    {
        if (valid)
        {
            if (n1 == n3)
            {
                return "Equilateral";
            }
            else if (n1 == n2 || n2 == n3)
            {
                return "Isosclese";
            }
            else
            {
                return "Scalene";
            }
        }
        else
        {
            return "Invalid Triangle";
        }
    }
    
    public static double area(double n1, double n2, double n3)
    {
        double s = (n1 + n2 + n3) / 2;
        return Math.sqrt((s * ((s - n1) * (s - n2) * (s - n3))));              
    }
    
    public static double max2(double n1, double n2)
    {
        if (n1 > n2)
        {
            return n1;
        } 
        else
        {
            return n2;
        }
    }
}

