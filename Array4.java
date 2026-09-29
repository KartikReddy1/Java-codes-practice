//3. Create an array with squares of the existing array elements
public class Array4 {
     public static void main(String[] args) {

        int[][] arr = {
            {2, 3, 5},
            {0, 1, 3},
            {1, 2, 4}
        };

        int[][] result = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
           result [i][j] = arr [i][j] * arr [i][j];
           System.out.print(result[i][j] + " "); 

    }
   System.out.println();
}
}
}