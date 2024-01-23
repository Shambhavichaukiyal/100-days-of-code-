class Solution {
    public int arraySign(int[] nums) {
       long p=1;
        int c=0;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            p=nums[i];
        
       
         if(p<0)
        {
         c++;
        }
        else if(p==0)
        {
            return 0;
        }
        
        else
        {
           s=s++; 
        }
        }
        
        if(c%2==0)
        {
            return 1;
        }
        return -1;
    }
}