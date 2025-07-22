public class operation {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // here the to condition which will work is the one which is true ie OR operation
        if (a && b){ //AND Operation
            System.out.println("AND OPERATION of true and false is: false");
        
        }
        else if (a || b){ //OR Operation
            System.out.println("OR OPERATION of true and false is: true");
        }
        else{
            System.out.println("Neither AND nor OR operation is true.");
        }

    }
}
