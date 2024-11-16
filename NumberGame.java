import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        boolean playAgain = true;
        System.out.println("welcome to the guess the number game");
        while(playAgain)
        {
            int RandomNumber = random.nextInt(100)+1;//will take random number from 1 to 100
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;
            System.out.println("I have picked a random number between 1 to 100");
            System.out.println("you have "+ maxAttempts+" attempts to guess it wish you good luck!!");
            while(attempts < maxAttempts && !guessedCorrectly)
            {
                System.out.println("enter your guess :");
                int userGuess = scanner.nextInt();
                attempts++;
                if(userGuess == RandomNumber)
                {
                    guessedCorrectly = true;
                    totalScore +=(maxAttempts - attempts + 1); //this will make sure that attempts taken by the user is maximun then he should atleast get 1 point 
                    System.out.println("hurray congrats you guessed the number in"+attempts+"attempts!");
                }
                    else if (userGuess > RandomNumber)
                    {
                        System.out.println("to high!! try again");
                    }
                    else if(userGuess < RandomNumber)
                    {
                        System.out.println("to low!! try again");
                    }
            }
                if(!guessedCorrectly)
                {
                    System.out.println(" sorry you have used all of your"+attempts+" attempts the correct number was"+RandomNumber+".");
                }
                System.out.println("your total score is :"+totalScore);
                System.out.println("would you like to play anoter game??(yes/no)");
                String response = scanner.next().toLowerCase();
                playAgain = response.equals("yes");
            }
            System.out.println("thanks for playing!! your score is"+totalScore+".");
            scanner.close();
    }
    
}

