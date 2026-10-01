public class Foreach2 {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}

        };

        int sum = 0;
        int noOfElements=0;
        for(int[] singleDimArray:arr){
            for(int value:singleDimArray){
            sum =sum + value;
            noOfElements++;

        }
    }
    System.out.println(sum);
    System.out.println(sum/noOfElements);
    
}
}