public class lc724 {
    public int pivotIndex(int[] nums) {
            int n = nums.length;
            int sum=0,left=0;
            for(int i=0;i<n;i++)
            {
                sum += nums[i];
            }
            for(int i=0;i<n;i++){
                if((sum-nums[i]-left) == left){
                    return i;
                }    
                left+=nums[i];
            }
            return -1;
    }
}
/*
public int pivotIndex(int[] nums) {
            int n = nums.length;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum += nums[i];
            }
            for(int i=0;i<n;i++){
                int curr = nums[i];
                int k=0,left=0;
                while(k!=i)
                {
                    left += nums[k];
                    k++;
                }
                int right = sum-curr-left;
                if(left == right) return i;
            }
            return -1;
    }
 */