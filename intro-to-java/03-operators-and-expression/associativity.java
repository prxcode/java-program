// Precedence and Associativity in Java
public class associativity{
    public static void main(String[] args) {
        int a = 6*5 - 34/2;
        /*
         => 30-34/2
         => 30-17
         => 13
         */
        int b = 60/5-34*2;
        /*
         => 12-34*2
         => 12-68
        => -56
         */
        System.out.println(a);
        System.out.println(b);
        
    }
    
}
