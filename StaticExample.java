import java.util.Random;

public class StaticExample {
    int number;
    public static void main(String[] args) {
        
        StaticExample SE1 = new StaticExample();
        SE1.number = new Random().nextInt();

        StaticExample SE2 = new StaticExample();
        SE2.number = new Random().nextInt();

        StaticExample SE3 = new StaticExample();
        SE3.number = new Random().nextInt();

        System.out.println(SE1.number);
        System.out.println(SE2.number);
        System.out.println(SE3.number);




    }
    
}
