public class MergeArrays {
    public static void main(String[] args) {
        String[] first = {"chai", "coffee"};
        String[] second = {"milk", "water", "coke"};

         String[] merged = new String[first.length + second.length];

         for (int i = 0; i < first.length; i++) {
         merged[i] = first[i];
        }
         for (int i = 0; i < second.length; i++) {
        merged[first.length+i]=second [i];
         }

        System.out.print("["); 

        for (int i = 0; i < merged.length; i++) {
        System.out.print("\"" + merged[i] + "\"");
        if (i < merged.length - 1) { 
            System.out.print(", "); 
        }
     }
             System.out.println("]"); 
    } 


    }

