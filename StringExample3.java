//equalsIgnoreCase
public class StringExample3 {
    public static void main(String[] args) {
        String s1 = "HEllo";
        String s2 = "hello";
        String s3 = "HELLO";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
    
}
}