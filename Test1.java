

public class Test1 {
    int i;
    int j;
    public Test1(){
        i = 10;
        j = 20;

    }
    public Test1 (int i,int j){
         this.i = i;
         this.j = j;
    }
    public static void main(String[] args) {
        Test1 t1 = new Test1 ();
        Test1 t2 = new Test1 (38,55);
        Test1 t3 = new Test1 (30,66);

        System.out.println(t1.add());
        System.out.println(t2.add());
        System.out.println(t3.add());
    }

    public int add() {
        return i+j;

    }
        
    }
        
