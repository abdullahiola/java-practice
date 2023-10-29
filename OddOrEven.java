/*
 * MATRIC NO : 230897
 * NAME : BUSARI ABDULAAHI OLUWATOSIN
 * LEVEL 200
 */
//determining if a number is even or odd
import java.io.*;
import java.util.Scanner;
public class OddOrEven 
{
    public static void main(String[] args) throws IOException
    {
        //declaring variable types
        int number;
        //instance of a scanner object
        Scanner userinput = new Scanner(System.in);

        //prompt user for input
        System.out.println("What integer do you want to check? ");
        number = userinput.nextInt();

        //testing conditions
        if ((number%2) == 0)
        {
            System.out.printf("%d is an even number",number);
        }
        else 
        {
            System.out.printf("%d is an odd number",number);
        }
        //close buffer
        userinput.close();

    }
    
}
