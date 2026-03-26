public class lc42 {
    public int trap(int[] height) {
        int l =0 ,r =height.length-1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(height[l]>leftmax) leftmax = height[l];
                else{
                    water += leftmax - height[l];
                }
                l++;
            }
            else{

                if(height[r]>rightmax) rightmax = height[r];
                else{
                    water += rightmax - height[r];
                }
                 r--;
            }

        }
        return water;
    }
}
//BRUTE FORCE - TIME LIMIT EXCEEDED for 1 case
/*
class Solution {
    public int trap(int[] height) {
        int water=0 ,n =height.length;
        for(int curr=0;curr<n;curr++){
            int leftmax = 0;
            int rightmax = 0;
            for(int i=0,;i<=curr;i++)
            {
                if(height[i]>leftmax) {
                    leftmax = height[i];
                }    
            }
            for(int i=curr;i<n;i++)
            {
                if(height[i]>rightmax){
                    rightmax = height[i];
                }
            }
            water = water + (Math.min(leftmax,rightmax)-height[curr]);
        }
        return water;
    }
}
*/

