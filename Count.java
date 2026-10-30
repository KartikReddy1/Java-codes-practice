import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        var count  = str.length();
        System.out.println("Number of Characters:" + count);
        
    }
    
}
