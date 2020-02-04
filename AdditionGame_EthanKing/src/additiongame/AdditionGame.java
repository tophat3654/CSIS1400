// Ethan King

package additiongame;

import javax.swing.JOptionPane;


public class AdditionGame
{

    
    public static void main(String[] args)
    {
        //Declare Variables
        int problems;
        int num1;
        int num2;
        int temp;
        int playerAnswer;
        int score;
        String question;
        String output;
        String input;
        
        //Initialize Variables
        score = 0;
        
        //welcome user and prompt for input
        JOptionPane.showMessageDialog(null, "Welcome to the Addition Game!");
        JOptionPane.showMessageDialog(null, "You get one point for every problem "
                + "you solve correctly, so try your best!");
        input = JOptionPane.showInputDialog("How many addition problems do you "
                + "want to solve?");
        problems = Integer.parseInt(input);
        
        //for loop set to generate the amount of problems input by user
        for (int i = 0; i < problems; i++)
        {
            //generate numbers and concatenate strings
            num1 = (int)(Math.random() * 41) + 10;
            num2 = (int)(Math.random() * 41) + 10;
            temp = num1 + num2;
            question = num1 + " + " + num2;
            input = JOptionPane.showInputDialog(question);
            playerAnswer = Integer.parseInt(input);
            
            //if statement for correct and incorrect answers
            if (playerAnswer == temp)
            {
                score++;
                output = "Correct! Your score is: " + score + " out of " + problems;
                JOptionPane.showMessageDialog(null, output);
            }
            else
            {
                output = "Incorrect!\nThe correct answer is: " + temp + ".\n "
                        + "Your score is: " + score + " out of " + problems;
                JOptionPane.showMessageDialog(null, output);
            }
        }
        output = "Congratulations! Your final score is: " + score + " out of " + problems;
        JOptionPane.showMessageDialog(null, output);
    }
    
}
