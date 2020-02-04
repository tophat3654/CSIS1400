// Ethan King
package lettergradecalculator_ethankinng;

import java.util.Scanner;


public class LetterGradeCalculator_EthanKinng
{
    public static void main(String[] args)
    {
       //Declare Variables
       String name;
       String idNum;
       int q1, q2, e1, e2; 
       int bestQuiz, bestExam;
       double score;
       char grade;
       
       //Scanner
       Scanner kbd;
       kbd = new Scanner(System.in);
       
       //Prompt user for inputs and initialize variables
       System.out.println("Enter the student's name:");
       name = kbd.nextLine();
       System.out.println("Enter the ID number:");
       idNum = kbd.nextLine();
       System.out.println("Enter the two Quiz Scores as whole numbers:");
       q1 = kbd.nextInt();
       q2 = kbd.nextInt();
       System.out.println("Enter the two test scores as whole numbers:");
       e1 = kbd.nextInt();
       e2 = kbd.nextInt(); 
       
       //calculate best scores
       bestQuiz = max(q1, q2);
       bestExam = max(e1, e2);
       
       //calculate score and return letter grade
       score = computeRawPercentage(bestQuiz, bestExam);
       grade = letterGrade(score);
       System.out.println("\n" + name + " " + idNum);
       System.out.println("Final Grade: " + grade);
      
    }
    
    public static int max(int n1, int n2)
    {
        return (n1 > n2) ? n1 : n2;
    }
    
    public static double computeRawPercentage(int quiz, int exam)
    {
        return ((quiz * .4) + (exam * .6));
    }
    
    public static char letterGrade(double score)
    {
        char grade;
        
        if (score >= 90)
        {
            grade = 'A';
        }
        else if (score >= 80)
        {
            grade = 'B';
        }
        else if (score >= 70)
        {
            grade = 'C';
        }
        else if (score >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        return grade;
    }
}


