public class Calculator {

    int a = 20;
    int b = 10;

    void addition() {
        System.out.println("Sum = " + (a + b));
    }

    void subtraction() {
        System.out.println("Difference = " + (a - b));
    }

    void multiplication() {
        System.out.println("Product = " + (a * b));
    }

    void division() {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }
}