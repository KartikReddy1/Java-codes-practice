
import java.util.Scanner;
public class Adding2num {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
         for (int i = 1; i <= 3; i++) {
          int num1;
          System.out.println("Enter first number");
          num1 = sc.nextInt();
          int num2;
          System.out.println("Enter second number");
           num2 = sc.nextInt();
            System.out.print("Enter operator (+, -, *, /, %): ");
          char op = sc.next().charAt(0);
          switch(op){
            case '+':
                System.out.println("Result is " +(num1+num2));
                break;
             case '-':
                System.out.println("Result is " + (num1-num2));
                break;
             case '/':
                System.out.println("Result is " +(num1/num2));
                break;
             case '%':
                System.out.println("Result is " +(num1%num2));
                break;
             case '*':
                System.out.println("Result is " +(num1*num2));
                break;
            default:
                System.out.println("Invalid operator");
          }
    }
    
}
}