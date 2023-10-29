/*
 * MATRIC NO : 230897
 * NAME : BUSARI ABDULAAHI OLUWATOSIN
 * LEVEL 200
 */
//computing compound interest
import java.io.*;
import java.util.Scanner;
public class CompoundInterest 
{
    public static void main(String[] args) throws IOException
    {
        //declaring variable types
        double bracket,amount,principal,interest_rate,time,compoundinterest;
        //instance of a scanner object
        Scanner userinput = new Scanner(System.in);

        //prompt user for necessary values
        System.out.println("Input principal: ");
        principal = userinput.nextDouble();

        System.out.println("Input rate: ");
        interest_rate = userinput.nextDouble();

        System.out.println("Input time: ");
        time = userinput.nextDouble();

        //compute amount in years = time step by step
        bracket = 1 + (interest_rate/100.00);
        //raise to the power of total years
        bracket = Math.pow(bracket, time);
        
        //compute amount
        amount = principal * bracket;

        //compute compound interest
        compoundinterest = amount - principal;

        System.out.println("The compound interest is : " + compoundinterest);
        userinput.close();
        

    }
}
