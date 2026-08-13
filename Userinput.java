import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name");
        String name = scanner.nextLine();
        System.out.printf("hey %s,How are you? \n",name);
        String status = scanner .nextLine();
        System.out.println("What is your age");
        int age = scanner.nextInt();
        System.out.println("thanks for the information");
        
    }
    
}
