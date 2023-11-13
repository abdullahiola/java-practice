import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the principal");

        long principal = scanner.nextLong();

        System.out.println("Input the rate in %");

        int rate = scanner.nextInt();


        System.out.println("Input the time in years");

        int time = scanner.nextInt();

        System.out.println("Input the number of times the interest is compunded per year");

        int n = scanner.nextInt();

        double amount = principal* Math.pow(1+(rate/(n*100)),n*time);

        double finalanswer = amount - principal;

        System.out.println("The compound interest is:" + finalanswer);

        scanner.close();
    }
}
