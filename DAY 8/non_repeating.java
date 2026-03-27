public class non_repeating {
    public static void main(String[] args){
        String str = "abcbad";
        int[] freq = new int[26];
        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }
        for(char c: str.toCharArray()){
            if(freq[c-'a'] == 1){
                System.out.println(c);
                break;
            }

        }
    }
}
/*
boolean unique=false;
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(i != j && s.charAt(i) == s.charAt(j)){
            unique = true;
            break;
        }
    }
    if(unique) return s.charAt(i);
}

*/

