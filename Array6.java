// Create an array based on the mentioned conditions and print it.
// The condition is to compare the corresponding elements of the two arrays.

public class Array6 {
       public static void main(String[] args) {

        int[][] arr1 = {
            {1, 2, 1},
            {9, 7, 2},
            {7, 6, 4}
        };

        int[][] arr2 = {
            {1, 6, 1},
            {0, 7, 3},
            {1, 6, 4}
        };

        int [][]result = new int [3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                if (arr1[i][j] == arr2[i][j]){
                result[i][j]=1;
            } else {
                result[i][j]=0;
            }
            System.out.print(result[i][j] + " ");

        }
        System.out.println();

}
       }
    }