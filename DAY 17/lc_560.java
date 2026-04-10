class lc_560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i:nums)
        {
            sum += i;
            int d = sum-k;
            if(map.containsKey(d))
            {
                count+=map.get(d);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;

    }
}