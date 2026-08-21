public class Constructorpractice1 {
    public int i;
    public static void main(String[] args) {
         Constructorpractice1 cp1 = new  Constructorpractice1(77);
         System.out.println(cp1.i);
    }

         public Constructorpractice1(){
         i = 20;
         System.out.println("Constructor is called");
         }

       public Constructorpractice1(int a){
        i = a;

         }
    }
    
