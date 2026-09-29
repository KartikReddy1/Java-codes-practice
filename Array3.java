//2. Add the elements in two arrays and print the result
public class Array3 {
    public static void main(String[] args) {
          int[][] arr1 = {
            {1, 2, 1},
            {9, 7, 2},
            {7, 6, 4}
        };

        int[][] arr2 = {
            {2, 6, 8},
            {0, 1, 3},
            {1, 2, 4}
        };

        int[][] result = new int[3][3];
        for (int i = 0;i<arr1.length; i++){
            for (int j = 0; j< arr1[i].length; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result [i][j]+" ");

            }
            System.out.println();
        }
    }
}
