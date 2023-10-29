/*
 * MATRIC NO : 230897
 * NAME : BUSARI ABDULAAHI OLUWATOSIN
 * LEVEL 200
 */
//computing simple interest
import java.io.*;
import java.util.Scanner;
public class SimpleInterest 
{
   public static void main(String[] args) throws IOException
   {

    //declaring variable types

    double principal,rate,time,simpleinterest;
    //instance of scanner object
    Scanner userinpt = new Scanner(System.in);

    //prompt user for necessary values
    System.out.println("Input principal: ");
    principal = userinpt.nextDouble();

    System.out.println("Input rate: ");
    rate = userinpt.nextDouble();

    System.out.println("Input time: ");
    time = userinpt.nextDouble();

    //compute and print interest
    simpleinterest = (principal * rate * time)/ 100.00;
    System.out.println("The simple interest is : " + simpleinterest);
    userinpt.close();

   }
}
