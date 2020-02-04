// Ethan King
package arrays_ethanking;

import java.io.File;
import java.util.Scanner;

public class Arrays_EthanKing
{

    public static void main(String[] args) throws Exception
    {
        //Declare Variables
        String[] sNum;
        double[] gpa;
        int temp;
        int length;
        
        //Create Scanners
        Scanner gpaData;  
        Scanner scan;
        gpaData = new Scanner(new File("studentdata.txt"));
        scan = new Scanner(new File("studentdata.txt"));
       
        //Find what the length of each array will be
        length = getDocumentLength(scan);
        sNum = new String[length];
        gpa = new double[length]; 
        
        //Weird pseudo for loop to assign a value to each element of the arrays
        temp = 0;
        while (gpaData.hasNext())
        {
            sNum[temp] = gpaData.next();
            gpa[temp] = gpaData.nextDouble();
            temp++;
        }
        
        //print out results
        gpaHistogram(gpa);
        gpaRank(sNum, gpa);
        System.out.println("\n");     
    }
    
    public static void gpaHistogram(double[] gpa)
    {
        //create a histogram array to represent each category
        int[] histogram;      
        histogram = new int[8];
        
        //for each element of the gpa array, determine where they fall in the array
        for (int i = 0; i < gpa.length; i++)
        {
           if (gpa[i] >= 0.0 && gpa[i] < 0.5)
           {
               histogram[0] += 1;
           }
           else if (gpa[i] >= 0.5 && gpa[i] < 1.0)
           {
               histogram[1] += 1;
           }
           else if (gpa[i] >= 1.0 && gpa[i] < 1.5)
           {
               histogram[2] += 1;
           }
           else if (gpa[i] >= 1.5 && gpa[i] < 2.0)
           {
               histogram[3] += 1;
           }
           else if (gpa[i] >= 2.0 && gpa[i] < 2.5)
           {
               histogram[4] += 1;
           }
           else if (gpa[i] >= 2.5 && gpa[i] < 3.0)
           {
               histogram[5] += 1;
           }
           else if (gpa[i] >= 3.0 && gpa[i] < 3.5)
           {
               histogram[6] += 1;
           }
           else if (gpa[i] >= 3.5 && gpa[i] < 4.0)
           {
               histogram[7] += 1;
           }
        }
        
        //print out histogram
        System.out.println("GPA HISTOGRAM: ");
        System.out.print("\n0.0 to 0.49     " + histogram[0] + "      ");
        printGraph(histogram[0]);
        System.out.print("\n0.5 to 0.99     " + histogram[1] + "      ");
        printGraph(histogram[1]);
        System.out.print("\n1.0 to 1.49     " + histogram[2] + "     ");
        printGraph(histogram[2]);
        System.out.print("\n1.5 to 1.99     " + histogram[3] + "     ");
        printGraph(histogram[3]);
        System.out.print("\n2.0 to 2.49     " + histogram[4] + "     ");
        printGraph(histogram[4]);
        System.out.print("\n2.5 to 2.99     " + histogram[5] + "     ");
        printGraph(histogram[5]);
        System.out.print("\n3.0 to 3.49     " + histogram[6] + "     ");
        printGraph(histogram[6]);
        System.out.print("\n3.5 to 4.0      " + histogram[7] + "     ");
        printGraph(histogram[7]);
        System.out.println();
    } 
    
    public static int getDocumentLength(Scanner doc)
    {
        int temp = 0;
        
        //another weird pseudo for loop to calculate the length of the document
        while(doc.hasNext())
        {
           temp++;
           doc.next();
           doc.next();
        }
        return temp;
    }
    
    public static void printGraph(int a)
    {
        //print the amount of stars for each category       
        for(int i = 0; i < (a/10); i++)
        {
            System.out.print("*");
        }
    }
    
    public static void gpaRank(String[] sNum, double[] gpa)
    {
        //print out each of the students SNumber, gpa, and their rank
        System.out.println("\n\nSTUDENTS: ");
        for (int i = 0; i < gpa.length; i++)
        {
            System.out.print("\n" + sNum[i] + "     " + gpa[i] + "     ");
            calculateRank(gpa, i);
        }
    }
    
    public static void calculateRank(double[] gpa, int number)
    {
       //declare and assign two variables to keep track of rank and ties
       int rank;
       int same;
       rank = 1;
       same = -1;
       
       /* compare element i of the gpa array to every element and determine 
            whether they're lower or the same */
       for (int i = 0; i < gpa.length; i++)
       {
           if (gpa[number] < gpa[i])
           {
               rank++;
           }
           else if (gpa[number] == gpa[i])
           {
               same++;
               
           }
       }
       
       //print out results depending on the values of same and rank
       if (same > 0)
       {
           System.out.print("T" + rank + " with " + same + " others");
       }
       else
       {
           System.out.print(rank);
       }
    }
}
