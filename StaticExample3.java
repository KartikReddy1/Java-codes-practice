public class StaticExample3 {
    int number;
    static void main() {
        System.out.println("static block");

    }
    {
        System.out.println("non-static block");
    }
    public StaticExample3(){
        System.out.println("constructor");
    }


 public static void main(String[] args) {
    System.out.println("main method");
 
    new StaticExample3();
 }
}