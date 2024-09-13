class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int a:nums)
        {
            set.add(a);
        }
        
        int max=1;
        
        for(int t:set)
        {
            if(!set.contains(t-1))
            {
                int cnt=1;
                int x=t;
                while(set.contains(x+1))
                {
                    x++;
                    cnt++;
                }
             max=   Math.max(max,cnt);
                    
            }
        }
        return max;
        
    }
}
