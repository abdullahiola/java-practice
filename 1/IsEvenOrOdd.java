import java.util.Scanner;

public class IsEvenOrOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("input a number");

        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("number must be postive");
        } else{
            if(number%2==0){
                System.out.println("Number is even");
            }else{
                System.out.println("Number is odd");
            }
        }

        scanner.close();

    }
}
