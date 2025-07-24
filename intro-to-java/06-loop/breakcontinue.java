
public class breakcontinue {
    public static void main(String[] args) {
      /*  for (int i=0;i<5;i++){
        System.out.println(i);
        System.out.println("Java is fun");
        if (i==2){
            System.out.println("Ending the loop");
            break; // This will exit the loop when i is 2
        } */

        for(int i=0;i<50;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue; // This will skip the current iteration when i is 2
            }
            System.out.println(i);
            System.out.println("Java is fun");
        } 
       
    }
}
