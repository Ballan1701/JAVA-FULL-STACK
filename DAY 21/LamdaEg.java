@FunctionalInterface
interface Math{
    int add(int a, int b);
}
@FunctionalInterface
interface Excercise{
    void sayHello();;
}
public class LamdaEg {
    public static void main(String[] args) {
        Math obj = (a, b) ->{
            System.out.println("Adding two numbers :" );
            return a + b;
        };
        // Math obj = new Math() {
        //     @Override
        //     public int add(int a, int b) {
        //         return a + b;
        //     }
        // };
        System.out.println("The sum is: " + obj.add(5, 10));
    }
}