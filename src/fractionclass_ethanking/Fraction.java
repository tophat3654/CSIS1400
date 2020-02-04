//Ethan King
package fractionclass_ethanking;

public class Fraction
{
    int numerator = 1;
    int denominator = 1;
    
    Fraction()
    {
    }

    Fraction(int num, int den)
    {
       numerator = num;
       denominator = den;
       if (numerator < 0 && denominator < 0)
       {
           numerator *= -1;
           denominator *= -1;
       }
    }
    
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    
    public double getDecimal()
    {
        double num;
        double den;
        num = numerator;
        den = denominator;
        return num/den;
    }
    
    public String toMixed()
    {
        int wholeNumber;
        wholeNumber = numerator / denominator;
        if (numerator % denominator == 0)
        {
            return wholeNumber + " ";
        }
        else if(wholeNumber > 0)
        {
            return wholeNumber + " " + (numerator % denominator) + "/" + denominator;
        }    
        else if (wholeNumber < 0)
        {
            if(numerator < 0 && denominator > 0)
            {
                return wholeNumber + " " + -(numerator % denominator) + "/" + denominator;
            }
            else if (numerator > 0 && denominator < 0)
            {
                return wholeNumber + " " + (numerator % denominator) + "/" + -denominator;
            }
            else
            {
                return "0";
            }
            
        }
        else
        {
            return toString();
        }
    }
    
    public void reduce()
    {
      int largestNumber;
      
      if (numerator > denominator)
      {
          largestNumber = numerator;
      }
      else
      {
          largestNumber = denominator;
      }
      for (int i = largestNumber; i >= 2; i--)
      {
          if(numerator % i == 0 && denominator % i == 0)
          {
              numerator = numerator/i;
              denominator = denominator/i;
              break;
          }
      }    
    }   
}
