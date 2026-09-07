import java.util.Random;
import java.util.Scanner;
public class NumberGussing {

    private static boolean guessed;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int computerNumber = random.nextInt(100) + 1;

        for (int chance = 1; chance <= 5; chance++) {
           System.out.print("Enter your guess (1-100): ");
            int guess = sc.nextInt();
        
         if (guess == computerNumber) {
                System.out.println("🎉 Correct! You Win!");
                break;
         }
          else if (guess < computerNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Too High!");
            }
             System.out.println("Chances left: " + (5 - chance));
        }
    

        if (!guessed) {
            System.out.println("Game Over!");
            System.out.println("The number was: " + computerNumber);
        sc.close();
        
    }
    
    }
}