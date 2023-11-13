import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something");

        String userinput = scanner.nextLine();

        System.out.println("You entered: "+ userinput);

        scanner.close();

    }
}

