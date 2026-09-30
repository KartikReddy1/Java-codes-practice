//4. Print the common elements between two arrays
import java.util.HashSet;
public class Array5 {
     public static void main(String[] args) {

        int[][] arr1 = {
            {1, 2, 1},
            {9, 7, 2},
            {7, 6, 4}
        };

        int[][] arr2 = {
            {2, 6, 8, 6},
            {0, 1, 3, 9, 7},
            {7, 2, 0},
            {8, 3}
        };

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i< arr1.length; i++){
               for (int j = 0; j < arr1[i].length; j++){
                set1.add(arr1[i][j]);

            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                set2.add(arr2[i][j]);
            }
        }

        set1.retainAll(set2);
        System.out.println("Common elements :"+ set1);


}
}
