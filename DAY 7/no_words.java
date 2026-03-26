import java.util.*;
public class no_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int c = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                if(i == n-1 || str.charAt(i+1) == ' '){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
