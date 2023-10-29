/*
 * MATRIC NO : 230897
 * NAME : BUSARI ABDULLAHI OLUWATOSIN
 * LEVEL 200
 */

import java.io.*;
import java.util.Scanner;
public class StandardDeviation
{
    public static void main(String[] args) throws IOException
    // prompting the system in case of exceptions due to errors
    {
        
        float x;
        double x_square;
        double x_value_sum = 0.0;
        double x_square_value_sum = 0.0;
        double numerator,denominator,result;
        float freq;
        //instance of scanner object
        Scanner userinput = new Scanner(System.in);
        System.out.print("What is the total frequency of data you have?   ");
        freq = userinput.nextFloat();

        for (int i=0;i<(int)freq;i++)
        {
            System.out.printf("Enter the value of x%d:  ",i+1);
            x = userinput.nextFloat();
            //Using the pow function to raise a number to any power
            x_square = Math.pow(x, 2.0);
            //Increment values
            x_value_sum = x_value_sum + x;
            x_square_value_sum = x_square_value_sum + x_square;

            
            
        }
        numerator = (freq * x_square_value_sum) - (Math.pow(x_value_sum,2.0));
        denominator = freq * (freq - 1);
        result = Math.sqrt(numerator/denominator);
        System.out.printf("The result of your equation/Standard deviation is %.2f",result);
        userinput.close();
    }
}