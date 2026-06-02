public class VariableDataType{
  public static void main(String args[]){
    Student s1 = new Student();
    s1.name = "Priyanshu";
    s1.phone = "123456";
    s1.rollNumber = "0001";
    s1.city = "Delhi";

  Student s2 = new Student();
    s1.name = "Elliot";
    s1.phone = "9999999";
    s1.rollNumber = "0010";
    s1.city = "New York";

  System.out.println("1st student name is "+ s1.name);
  System.out.println("1st student roll number is "+ s1.rollNumber);
  System.out.println("2nd student name is "+ s2.name);
  System.out.println("2nd student roll number is "+ s2.rollNumber);
  }
}
