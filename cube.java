import java.util.Scanner;

public class cube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int result = num * num;

        System.out.println("cube = " + result);

        sc.close();
    }
}