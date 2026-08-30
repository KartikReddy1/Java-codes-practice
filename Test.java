

public class Test {
    public Test(){

    }
    public Test (int a){
    }
    public static void main(String[] args) {
        Test t1 = new Test ();
        Test t2 = new Test (10);
        Test t3 = new Test (30);

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());

        
    }
        
    }
    
