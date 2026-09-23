public class ArraryAvarage {
    public static void main(String[] args) {
        int[] numbers = {2,5,3,9,6,111};
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double average = (double) sum / numbers.length;
         System.out.println("Average = " + average);
}
}
