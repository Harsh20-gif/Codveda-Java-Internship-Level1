import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int maxAttempts = 5;
        boolean hasWon = false;

        System.out.println("=======        Welcome to the Number Guessing Game        ========");
        System.out.println("Guess the number Betewwen 1 and 100");
        System.out.println("You have "+ maxAttempts + " attempts");

         for(int i=1; i<=maxAttempts;i++){
            System.out.print("Attempt "+ i +" : Enter your guess :- ");
            
            if (!sc.hasNextInt()){
                System.out.println("Invalid input. Please enter a valid number. ");
                sc.next();
                i--;
                continue;
            }

            guess = sc.nextInt();

            if (guess == secretNumber){
                hasWon = true;

                break;
            }
            
            else if (guess < secretNumber){
                System.out.println("Too Low");

            }

            else{
                System.out.println("Too High");
            }
         }

         // for Final result Print

         if (!hasWon){
            System.out.println("You have used all attempts. The number was " + secretNumber);
         }
         
         else{
            System.out.println("Congrat, You are won.");
         }

         sc.close();
    }
}