public class Method3 {
    int marks; //Student class
    static void change(Method3 s){
        s.marks=20;
        System.out.println("Inside the method: "+s.marks);
    } 
    public static void main(String[] args){
        Method3 m1 = new Method3();
        m1.marks=50;
        change(m1);
        System.out.println("Outside the method: "+m1.marks);
    }
}
