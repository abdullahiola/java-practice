/*
 * MATRIC NO : 230897
 * NAME : BUSARI ABDULLAHI OLUWATOSIN
 * LEVEL 200
 */
import java.io.*;
import java.util.Scanner;
public class QuadraticEqn
{
    public static void main (String[] args) throws IOException
    {
        int a,b,c;
        double disc;
        float x1,x2;
        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter the coefficient of a in the equation:  ");
        a = userinput.nextInt();

        System.out.print("Enter the coefficient of b in the equation:  ");
        b = userinput.nextInt();

        System.out.print("Enter the coefficient of c in the equation:  ");
        c = userinput.nextInt();

        //declaring the discriminant
        disc = (Math.pow(b,2.0)) - (4*a*c);

        if (disc > 0)
        {
            System.out.println("Your equation has two different real roots");
            //the two roots
            x1 = (float) (-b + Math.sqrt(disc))/(2*a);
            x2 = (float) (-b -  Math.sqrt(disc))/(2*a);
            System.out.println("The roots are: ");
            //concatenating
            System.out.println("x1 =  " + x1);
            System.out.println("x2 = " + x2);
        }
        //
        else if (disc == 0)
        {
            System.out.println("Your equation has equal roots");
            float x = -b / 2 * a;
            //two roots
            System.out.println("The roots are: ");
            //using formatted strings
            System.out.printf("x = %.1f twice " ,x);

        }
        //in case of imaginary roots
        else
        {

            System.out.println("Your equation has no real roots");
        }
        userinput.close();
        
    }   
}
