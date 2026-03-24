import java.util.*;
public class String_cnpt{
    public static void main(String[] args){
        String s = "learning java programming";
        //length of the string
        System.out.println(s.length());
        //substring
        System.out.println(s.substring(4,8));
        String[] arr = s.split(" ");
        //String to char array
        for(char c:s.toCharArray()){
            System.out.print(c+" ");
        }
        System.out.println();
        //char array to String
        char[] ch = {'h','e','l','l','o'};
        String str = new String(ch);
        System.out.println(str);
        // replace 
        s = s.replace("java", "python");
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s);
        // count the String without space
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){ //if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                count++;
            }
        }
        
        /*char[] alp = s.toCharArray();
        for(char c:alp){
            if(Character.isAlphabetic(c)){
                count++;
            }
        }
        System.out.print(alp.length);
        */
        System.out.println("Number of alphabetic " + count);
    }
}