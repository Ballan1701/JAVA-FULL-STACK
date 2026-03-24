import java.util.*;
public class method1 {
    public static int mul(int a,int b){
        return a*b;
    }
    public static int square(int n){
        return mul(n,n);
    }
    public static void print(int n)
    {
        System.out.println(square(n));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        print(s);
    }
}
