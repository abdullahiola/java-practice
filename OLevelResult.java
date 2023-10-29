/*
 * MATRIC NO : 230897
 * NAME : BUSARI ABDULAAHI OLUWATOSIN
 * LEVEL 200
 */
import java.io.*;
import java.util.Scanner;

//This code prints out an O level statement of results.
//using if statements
//It then uses switch statement to assign remarks to the grades

public class OLevelResult {
    public static void main(String[] args) throws IOException
    {
        Scanner userinput = new Scanner(System.in);
        //declaring variables
        int n, score;
        String name, idno;

        //declaring arrays for data and specifying length
        String[] subjects = new String[30];
        String[] grades = new String[30];
        String[] remarks = new String[15];

        //prompt for user info
        System.out.print("Enter your name: ");
        name = userinput.nextLine();

        System.out.print("Enter your WAEC Registration Number: ");
        idno = userinput.nextLine();


        //Make sure user score isnt more than whats accepted for waec
        do{
            System.out.print("How many subjects did you offer?(not more than 13 and not less than 7) ");
            n = userinput.nextInt();
        } while((n < 7) || (n > 13));

        //store enter key string
        String newl2 = userinput.nextLine();

        for(int i = 0; i < n; i++){
            System.out.printf("Enter subject %d: ", i+1);

            //storing each subject in array
            subjects[i] = userinput.nextLine();

            System.out.printf("Enter your score in %s: ",subjects[i]);
            //storing each score
            score = userinput.nextInt();
            //store enter key string
            String newl3 = userinput.nextLine();

            //using if-else statements to declare the grades
            if (score >= 75){
                grades[i] = "A1";
            }
            else if(score >= 70){
                grades[i] = "B2";
            }
            else if(score >= 65){
                grades[i] = "B3";
            }
            else if(score >= 60){
                grades[i] = "C4";
            }
            else if(score >= 55){
                grades[i] = "C5";
            }
            else if(score >= 50){
                grades[i] = "C6";
            }
            else if(score >= 45){
                grades[i] = "D7";
            }
            else if(score >= 40){
                grades[i] = "E8";
            }
            else{
                grades[i] = "F9";
            }

            //using swtich statement to add remarks for every grade
            switch (grades[i]) {
                case ("A1"):
                    remarks[i] = "Perfect";
                    break;

                case ("B2"):
                    remarks[i] = "Great";
                    break;

                case ("B3"):
                    remarks[i] = "good";
                    break;
                
                case ("C4"):
                    remarks[i] = "Average";
                    break;

                case ("C5"):
                    remarks[i] = "Average";
                    break;

                case ("C6"):
                    remarks[i] = "Pass";
                    break;

                case ("D7"):
                    remarks[i] = "Bad";
                    break;

                case ("E8"):
                    remarks[i] = "Really bad";
                    break;

                default:
                    remarks[i] = "Fail";
                    break;
            }
        }

         //printing the O level results with user details
        System.out.println("Your Waec result is : ");
        System.out.printf("NAME: %s\n", name);
        System.out.printf("WAEC REG No: %s\n", idno);

        for(int k = 0; k < n; k++){
            System.out.printf("%s - %s (%s)\n", subjects[k], grades[k], remarks[k]);
        }

        userinput.close();
    }
}
