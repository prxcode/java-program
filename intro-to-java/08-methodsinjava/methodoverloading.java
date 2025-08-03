public class methodoverloading {
    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    void greet(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        obj.greet();
        obj.greet("Alice");
        obj.greet("Bob", 25);
    }
}
