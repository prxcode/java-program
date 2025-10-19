class MyMainEmployee {
  private int id;
  private String name;

  // Default constructor
  public MyMainEmployee() {
    id = 45;
    name = "Your-Name-Here";
  }

  // Parameterized constructor
  public MyMainEmployee(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() { 
    return name;
  }

  public void setName(String n) {
    this.name = n;
  }

  public void setId(int i) {
    this.id = i;
  }

  public int getId() {
    return id;
  }
}

public class MyConstructors {
  public static void main(String[] args) {
    // Use the parameterized constructor properly
    MyMainEmployee prx = new MyMainEmployee("Priyanshu", 12);

    prx.setName("prxcode");
    prx.setId(34);

    System.out.println(prx.getId());
    System.out.println(prx.getName());
  }
}
