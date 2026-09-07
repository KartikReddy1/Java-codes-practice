import java.util.Scanner;
public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  for (int i = 1; i <= 3; i++) {
        int player = 2;
        int Computer = 1;

            System.out.print("Enter your dice number (1-6): ");
            int Player = sc.nextInt();

            System.out.print("Enter computer dice number (1-6): ");
            int computer = sc.nextInt();

            System.out.println("Player Dice = " + player);
            System.out.println("Computer Dice = " + computer);

        if (Player > Computer){
            System.out.println("You Win");
        }else if (player < Computer) {
            System.out.println("Computer Win");

        } else {

            System.out.println("Draw!");
        }
        

    }
}
}