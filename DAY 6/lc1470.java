public class lc1470 {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] arr = new int[len];
        int i=0,j=n,k=0;
        while(j != len)
        {
            arr[k] = nums[i];
            arr[++k] = nums[j];
            i++;
            j++;
            k++;
        }
        return arr;
    }    
}
