public class Bankbalance {
    static int currentbalance = 1000;
    public static void greetCustomer() {
        System.out.println("Hi sir, Welcome to the bank");
    }
    public void deposit(int amount){
        currentbalance  = currentbalance + amount ;
        System.out.println("Amount deposit succesfull");
    }
    public static void withdraw(int amount){
         currentbalance  = currentbalance - amount ;
         System.out.println("Amount withdraw succesfull");

        }
    public int getcurrentbalance(){
        return currentbalance;
    }
    public static void main(String[] args) {
        Bankbalance Bankbalance = new Bankbalance();
        greetCustomer();
        System.out.println("currentbalance is :" +Bankbalance.getcurrentbalance());
        Bankbalance.deposit(500);
        System.out.println("currentbalance is :" +Bankbalance.getcurrentbalance());
        withdraw(300);
        System.out.println("currentbalance is :" +Bankbalance.getcurrentbalance());

    }
        
 }


