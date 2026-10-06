import java.util.Random;

public class StaticExample1 {
     static int number;
    public static void main(String[] args) {
        
        StaticExample1.number = new Random().nextInt();
        StaticExample1.number = new Random().nextInt();
        StaticExample1.number = new Random().nextInt();
        StaticExample1.number = new Random().nextInt();

       
        System.out.println(StaticExample1.number);
        System.out.println(StaticExample1.number);
        System.out.println(StaticExample1.number);
    
}
}