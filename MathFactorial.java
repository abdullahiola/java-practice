/*
 * MATRIC NO : 230897
 * NAME : BUSARI ABDULAAHI OLUWATOSIN
 * LEVEL 200
 */
//recursion to calculate factorial
import java.io.*;
import java.util.Scanner;

public class MathFactorial 
{
    public static void main (String[] args) throws IOException
    {
      //declaring variable types
        int number;
      //instance of scanner object
        Scanner userinput = new Scanner(System.in); 

      //prompt user for input
        System.out.println("What number do you want to check the factorial? ");
        number = userinput.nextInt();
      //assigning variable to store what the factorial returns
        long factorial = factorialOfNum(number);
        System.out.printf("Factorial of %d is %d",number,factorial);
        userinput.close();

    }
    
    public static long factorialOfNum(long number)
    {
        if (number >= 1)
        {
            //implementing the recursion algorithm
            return (long)(number * factorialOfNum(number - 1));
        }
        else
        {
            return 1;
        }
        
    }
    
}
