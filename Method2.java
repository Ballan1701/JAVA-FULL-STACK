public class Method2 {
    static void change(int a){
        a=20;
        System.out.println("Inside the method: "+a);
    }
    public static void main(String[] args){
        int a=50;
        change(a);
        System.out.println("Outside the method: "+a);
    }
}
/* In integer datatype when we return the data then only the value of the variable change otherwise there will be no change be done */
