/*
 * MATRIC NO :230897
 * NAME : BUSARI ABDULLAHI OLUWATOSIN
 * LEVEL 200
 */
import java.io.*;
import java.util.Scanner;
public class FibonacciSeries
{
    public static void main(String[] args) throws IOException
    {
        int a = 0,b=1,count=1,fibocount,c;


        Scanner userinpt = new Scanner(System.in);
        System.out.print("How many numbers do you want in your fibonacci series?  ");
        fibocount = userinpt.nextInt();


        
        System.out.printf("The first %d fibonacci numbers are: ",fibocount);
        System.out.print(a);
        System.out.print(',');
        System.out.print(b);
        while (count <= fibocount - 2)
        {
            //separating them by comma
            System.out.print(',');
            c = a + b;
            System.out.print(c);
            a = b;
            b = c;
            count ++;
        }
        //close the buffer
        userinpt.close();
        

    }
}