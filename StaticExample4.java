public class StaticExample4 {
   
    int number;
    static void main() {
        System.out.println("static block");

    }
     public StaticExample4(){
        System.out.println("constructor");
        number = 10;
    }
     public static void main(String[] args) {
    System.out.println("main method");
     StaticExample4 SE = new  StaticExample4();
     System.out.println(SE.number);

   
 }
}

