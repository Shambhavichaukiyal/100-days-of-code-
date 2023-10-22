class Solution {
    public int majorityElement(int[] nums) {
        int m=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            for(int j=i;j<nums.length;j++)
            {
           if(nums[i]==nums[j]) 
           {
               c++;
           }}
                if((c>(nums.length)/2)&&(max<c))
                {
                    m=nums[i];
                   max=c;
                }
                
                     
        }
         return m;  
    }
     
}