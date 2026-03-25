public class lc3232 {
    public boolean canAliceWin(int[] nums) {
        int scnt = 0,dcnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10) scnt+=nums[i];
            else dcnt+=nums[i];
        }
        return (scnt != dcnt);
    }
}
