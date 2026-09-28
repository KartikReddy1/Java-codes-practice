
public class JaggedArray {
    public static void main(String[] args) {
        // int[][]arr = new int [3][];
        // arr[0] = new int [2];
        // arr[1] = new int [5];
        // arr[2] = new int [3];

        // arr [0][0]=1;
        // arr [0][1]=2;
           
        // arr [1][0]=10;
        // arr [1][1]=20;
        // arr [1][2]=30;
        // arr [1][3]=40;
        // arr [1][4]=50;

        // arr [2][0]=11;
        // arr [2][1]=22;
        // arr [2][2]=33;
            //OR
        int [][] arr = {
            {1,2},
            {10,20,30,40,50},
            {11,22,33}
        };    

        for (int i=0; i<arr.length;i++){
           for (int j =0; j<arr[i].length;j++){
           System.out.print(arr[i][j] + " ");
    
    }
    System.out.println();
}
}
}