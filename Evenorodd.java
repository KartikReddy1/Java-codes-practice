import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       for (int i = 1; i <= 5; i++) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num % 2) {

            case 1:
                System.out.println("given number is odd");
                break;
            case 0:
                System.out.println("given number is even");
                break;
            
        }

     }
    
}
}
