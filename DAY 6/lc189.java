public class lc189 {
    public void reverse(int[] nums,int start,int end){
    while(start < end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n) k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
}


/*brute force - Time limit exceed ()
public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k>len) k=k%len;
        for(int i=0;i<k;i++)
        {
            int last = nums[len-1];
            for(int j=len-1;j>0;j--)
            {
                nums[j] = nums[j-1];
            }
            nums[0]=last;
        }
}

*/    

