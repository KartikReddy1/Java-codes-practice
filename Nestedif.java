public class Nestedif {
    public static void main(String[] args) {
        String examStatus = "pass";
        if(examStatus == "pass"){
        System.out.println("Cleared round 1, wait for round 2");
            String round1Status = "pass";
            if(round1Status == "pass"){
            System.out.println("Cleared round 2, wait for round 3");
                String round2Status = "pass";
                if(round2Status == "fail"){
                System.out.println("Cleared round 3, wait for HR round ");
                }else{
                System.out.println("you can go to home");
                }
            } else{
            System.out.println("you can go to home");

            }
    }else{
        System.out.println("you can go to home");
    }
    
    }
}
