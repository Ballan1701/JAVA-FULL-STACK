public class lc796 {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n != goal.length()) return false;
        for(int start =0;start<n;start++)
        {
            int i=0;
            while(i<n)
            {
                 if(s.charAt((start+i)%n) != goal.charAt(i)){
                    break;
                }
                i++;
            }
            if(i == n) return true;
        }
        return false;
    }
}
/* simpliest way to solve
return l1==l2 && (s+s).contains(goal);
 */
