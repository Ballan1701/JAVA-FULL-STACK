import java.util.*;
public class lc_349{
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                res.add(i);
            }
        }
        int[] ans = new int[res.size()];
        int x=0;
        for(int i:res){
            ans[x++]=i;
        }
        return ans;
    }
}
