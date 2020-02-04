//Ethan King
package hangman_ethanking;

import java.util.Scanner;

public class Hangman_EthanKing
{

    public static void main(String[] args)
    {
        //Declarations
        int lives;
        String abc;
        boolean win;
        boolean fail;
        Scanner scanner;
        char guess;
        
        //Initiliaze variables
        abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        win = false;
        fail = false;
        scanner = new Scanner(System.in);
        lives = 0;
        
        //Create Arrays and assign their values in order for the game to work
        char[] alphabet = explode(abc);
        String[] gallows = getGallows();
        String[] words = {"VARIABLE", "DECLARE", "OPERATOR", "METHOD", "COMPUTER"};
        char[] word = explode(words[(int)(Math.random() * words.length)]);
        char[] blankWord;
        blankWord = new char[word.length];  
        for (int i = 0; i < blankWord.length; i++)
        {
            blankWord[i] = '_';
        }
        
        System.out.println("Welcome to Hangman! Make sure you enter your letters uppercase:");
        
        //while loop thar runs the game.
        while(win == false && fail == false)
        {
            printProgress(alphabet, blankWord, lives, gallows);
            System.out.println(""
                    + "\n\nGuess a Letter:");
            guess = scanner.next().charAt(0);
            blankWord = compareGuess(guess, word, blankWord);
            alphabet = strikeAlphabet(guess, alphabet);
            
            
            if (processGuess(guess, word) == false)
            {
                lives++;
                if (lives == gallows.length - 1)
                {
                    fail = true;
                }
            }
            
            win = winTest(blankWord);
        }
        printProgress(alphabet, blankWord, lives, gallows);
        gameEnd(win, fail, word);
    } 
    
    //return string as a char array
    public static char[] explode(String string)
    {
        return string.toCharArray();
    }
    
    //Print out the current alphabet, word progress, and gallows
    public static void printProgress(char[] alphabet, char[] blankWord, int lives, String[] gallows)
    {         
        System.out.println("");
        for (char letter: alphabet)
        {
            System.out.print(letter + " ");
        }
        
        System.out.println(gallows[lives]); 
        
        for (char letter: blankWord)
        {
            System.out.print(letter + " ");
        }
    }
    
    //Alter blankWord if one of the letters is correct
    public static char[] compareGuess(char guess, char[] word, char[] blankWord)
    {
        for(int i = 0; i < word.length; i++)
        {
            if (guess == word[i])
            {
                blankWord[i] = guess;
            }
        }
        return blankWord;
    }
    
    //Strike out one of the alphabet letters when the player guesses
    public static char[] strikeAlphabet(char guess, char[] alphabet)
    {
        for(int i = 0; i < alphabet.length; i++)
        {
            if(guess == alphabet[i])
            {
                alphabet[i] = '_';
            }    
        }    
        return alphabet;
    }
    
    //Check to see if the player's guess matches any of the letters in the word
    public static boolean processGuess(char guess, char[]word)
    {
        for(char letter: word)
        {
            if(guess == letter)
            {
                return true;
            }
        }
        return false;
    }
    
    //A method that holds the strings for each of the gallows variations
    public static String[] getGallows()
    {
        String[] gallows = {"\n\n"
                         + "-------\n"
                         + "|     |\n"
                         + "|\n"
                         + "|\n"
                         + "|\n"
                         + "|\n"
                         + "|\n",
            
                           "\n\n"
                         + "-------\n"
                         + "|     |\n"
                         + "|     O\n"
                         + "|\n"
                         + "|\n"
                         + "|\n"
                         + "|\n",
        
                           "\n\n"
                         + "-------\n"
                         + "|     |\n"
                         + "|     O\n"
                         + "|     |\n"
                         + "|\n"
                         + "|\n"
                         + "|\n",
        
                        "\n\n"
                         + "-------\n"
                         + "|     |\n"
                         + "|     O\n"
                         + "|    /|\n"
                         + "|\n"
                         + "|\n"
                         + "|\n",
        
                        "\n\n"
                         + "-------\n"
                         + "|     |\n"
                         + "|     O\n"
                         + "|    /|\\\n"
                         + "|\n"
                         + "|\n"
                         + "|\n",
                        
                        "\n\n"
                         + "-------\n"
                         + "|     |\n"
                         + "|     O\n"
                         + "|    /|\\\n"
                         + "|    /\n"
                         + "|\n"
                         + "|\n",
                        
                        "\n\n"
                         + "-------\n"
                         + "|     |\n"
                         + "|     O\n"
                         + "|    /|\\\n"
                         + "|    / \\\n"
                         + "|\n"
                         + "|\n"
                        };
        return gallows;
    }
    
    public static void gameEnd(boolean win, boolean fail, char[] word)
    {
        if (win == true)
        {
            System.out.println("\nCongratulations! You WIN!");
        }
        else
        {
            System.out.println("\n\nWhoops! You LOST!");
            System.out.print("The word was: ");
            for (char i: word)
            {
                System.out.print(i);
            }
            System.out.println("\n");
        }
    }
    
    public static boolean winTest(char[] blankWord)
    {
        for (char i: blankWord)
        {
            if(i == '_')
            {
                return false;
            }    
        }
        return true;
        
    }
}
