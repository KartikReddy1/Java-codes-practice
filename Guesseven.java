import java.util.Scanner;

public class Guesseven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Good! You entered an even number.");
        } else {
            System.out.println("Try again! It is odd.");
        }

        sc.close();
    }
}