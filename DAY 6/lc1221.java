public class lc1221 {
    public int balancedStringSplit(String s) {
        char[] arr = s.toCharArray();
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 'R') sum += 1;
            else sum -= 1;

            if(sum == 0)
            {
                count++;
            }
        }
        return count;
    }
}


/*
public int balancedStringSplit(String s) {
        char[] arr = s.toCharArray();
        int tot=0;
        int rcnt =0,lcnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 'R') rcnt++;
            else lcnt++;

            if(rcnt == lcnt)
            {
                tot++;
                rcnt=0;
                lcnt=0;
            }
        }
        return tot;
    }
 */
