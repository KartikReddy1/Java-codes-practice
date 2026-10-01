public class Foreach1 {
    public static void main(String[] args) {
         int [] arr = {1,2,7,8,2,3,4,1};
         int sum = 0;

         for (int i:arr){
            sum += i;  //OR sum = sum + i;

         }
         System.out.println(sum);
         System.out.println(sum/arr.length );
    }
    
}
