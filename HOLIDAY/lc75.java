public class lc75 {
    public void sortColors(int[] nums) {
        int cnt0=0,cnt1=0,cnt2=0;
        for(int n : nums)
        {
            if(n==0) cnt0++;
            else if(n==1) cnt1++;
            else cnt2++;
        }
        //System.out.print(cnt0+" "+cnt1+" "+cnt2);
        int idx=0;
        for(int i=1;i<=cnt0;i++)
        {
            nums[idx]=0;
            idx++;
        }
        for(int i=1;i<=cnt1;i++)
        {
            nums[idx]=1;
            idx++;
        }
        for(int i=1;i<=cnt2;i++)
        {
            nums[idx]=2;
            idx++;
        }
    }
}

