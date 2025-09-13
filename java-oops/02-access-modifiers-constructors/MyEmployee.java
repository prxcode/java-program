class Employeee{
    private int id;
    private String name;
    public String getName(){
        return name;
}


public void setName(String n){
    name = n;
}
public int getId(){
    return id;
}


}

public class MyEmployee{
    public static void main(String[] args) {
        Employeee emp = new Employeee();
        // emp.id = 12;
        // emp.name = "John";
        emp.setName("John");
        System.out.println(emp.getName());
    }
}
