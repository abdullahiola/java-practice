import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the principal");

        long principal = scanner.nextLong();

        System.out.println("Input the rate in %");

        short rate = scanner.nextShort();

        System.out.println("Input the time in years");

        int time = scanner.nextInt();

        long finalanswer = (principal*rate*time)/100;

        System.out.println("The simple interest is:" + finalanswer);

        scanner.close();

    }
}
