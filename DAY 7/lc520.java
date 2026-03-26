public class lc520 {
       public boolean detectCapitalUse(String word) {
        int n = word.length();
        if(n==1) return true;
        boolean first = Character.isUpperCase(word.charAt(0));
        boolean second = Character.isUpperCase(word.charAt(1));
        if(!first && second) return false;
        for(int i=2;i<n;i++){
            if(Character.isUpperCase(word.charAt(i)) != second)
                return false;
        }
        return true;
    }
}
/*
public boolean detectCapitalUse(String word) {
        char[] arr = word.toCharArray();
        String caps = word.toUpperCase();
        String small = word.toLowerCase();
        if(word.equals(caps))
        {
            return true;
        }
        else if(word.equals(small)){
            return true;
        }
        else if(Character.isUpperCase(arr[0])){
            for(int i=1;i<arr.length;i++){
                if(Character.isUpperCase(arr[i]))
                    return false;
            }
            return true;
        
        }
        return false;
    }
 */
