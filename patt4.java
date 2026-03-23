// import java.util.*;
// public class patt4 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int k=1;k<=n-i-1;k++) System.out.print("  ");
//             for(int j=1;j<=(2*i)+1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.*;
public class patt4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int k=1;k<=n-i-1;k++) System.out.print("  ");
            for(int j=(2*i)+1;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
import java.util.*;
public class patt4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<=i;k++) System.out.print("  ");
            for(int j=1;j<=(2*(n-i)-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/