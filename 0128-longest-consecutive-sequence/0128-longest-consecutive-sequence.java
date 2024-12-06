class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
         int n=nums.length;
         if(n==0)
        {
            return 0;
        }
        for(int i:nums)
        {
            set.add(i);
        }
        int mx=1;
        int l=0;
        for(int i:set)
        {
           if(!set.contains(i-1))
           {
               int t=i;
               l=1;
               while(set.contains(t+1))                    
               {
                   t=t+1;
                   l++;
               }
               mx=Math.max(mx,l);
           }
            
       
    
    }
        return mx;
}
}