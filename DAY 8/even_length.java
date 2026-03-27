public class even_length {
    public static void main(String[] args) {
        String str = "  hello hi github plays java";
        System.out.println(even(str));
        System.out.println(evenByStringBuilder(str));
    }
    // Using String concatenation
    public static String even(String str){
        int start=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch>='a' && ch<= 'z')||(ch >= 'A' && ch <= 'Z'))
            {
                if(i == str.length()-1 || str.charAt(i+1) == ' '){
                    if((i-start+1)%2 == 0){
                        sb.append(str.substring(start,i+1));
                        sb.append(" ");
                    }
                    start = i+2;
                }
            }
        }
        return new String(sb);
    }
    // Using StringBuilder for better performance
    public static String evenByStringBuilder(String str){
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i==str.length()-1 || ch !=' ')
            {
                word.append(ch);
            }
            else{
                if(word.length()%2 == 0){
                    ans.append(word.toString());
                    ans.append(" ");
                }
                word.setLength(0);
            }
            
        }
        return new String(ans);
    }
}
  
