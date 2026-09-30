
//8. Create an array with cube of the existing array elements
public class Array8{
     public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] result = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
           result [i][j] = arr [i][j] * arr [i][j]* arr[i][j];
           System.out.print(result[i][j] + " "); 

    }
   System.out.println();
}
}
}
