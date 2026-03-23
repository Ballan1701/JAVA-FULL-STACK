import java.util.*;
public class patt2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*if print j
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 */
/*

if print i
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5*/