// Polymorphism is the ability of an object to take on many forms. It allows us to perform a single action in different ways. 
// In Java, there are two types of polymorphism: compile-time polymorphism (method overloading) and runtime polymorphism (method overriding).
class calculator {
    // Method overloading: same method name but different parameters
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    // Method overriding: same method name and parameters but different implementation in subclass
}    
public class math {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3.0));
    }
}
