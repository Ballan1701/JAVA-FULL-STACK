import java.util.*;
public class Method {
    void makecoffee() {
        System.out.println("Boiling water...");
        System.out.println("Grinding coffee beans...");
        System.out.println("Making coffee...");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method m = new Method();
        m.makecoffee();
    }
}