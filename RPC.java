import java.util.Scanner;

public class RPC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int computer = 1;

        if (choice == computer) {
            System.out.println("Draw!");
        } else if (choice == 2 && computer == 1) {
            System.out.println("You Win!");
        } else if (choice == 3 && computer == 2) {
            System.out.println("You Win!");
        } else if (choice == 1 && computer == 3) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }
    }
}