/*
 * MATRIC NO : 230897
 * NAME : BUSARI ABDULAAHI OLUWATOSIN
 * LEVEL 200
 */
import java.io.*;
import java.util.Scanner;
//finding max of numbers
public class MaxOfNumbers 
{
    public static void main(String[] args) throws IOException
    {
        //declaring variables and array types
        int[] numbers = new int[100];
        int number,maximum;
        //instance of scanner object
        Scanner userinput = new Scanner(System.in);

        //prompt user for input
        System.out.println("How many numbers do you want to compare?  ");
        number = userinput.nextInt();

        //loop to store the list of numbers in an array
        for (int i=0;i<number;i++)
        {
            System.out.printf("Enter number %d: ",i+1);
            numbers[i] = userinput.nextInt();
        }
        //initializing maximum variable
        maximum = numbers[0];
        //compare numbers to determine max
        for (int i=0;i<number;i++)
        {
            if (numbers[i] > maximum)
            {
                maximum = numbers[i];
            }
        }
        System.out.print("The max Number is " + maximum);
        userinput.close();
    }
}
