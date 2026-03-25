public class lc345 {
    public boolean vowel(char ch)
    {
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch=='i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l=0;
        int r = s.length()-1;
        while(l<r)
        {
            if(vowel(arr[l]))
            {
                if(vowel(arr[r]))
                {
                    char c = arr[l];
                    arr[l] = arr[r];
                    arr[r] = c;
                    l++;
                    r--;
                }
                else
                {
                    r--;
                }
            }
            else 
            {
                l++;
            }
        }
        String str = new String(arr);
        return str;
    }
}
