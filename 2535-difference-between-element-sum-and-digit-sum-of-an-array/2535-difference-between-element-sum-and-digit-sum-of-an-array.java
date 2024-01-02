class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dp=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        
         for(int i=0;i<nums.length;i++)
        { 
             int m=nums[i];
             while(m>0)
             {
                 int rem=m%10;
                 m=m/10;
                 dp=dp+rem;
             }
        }
       return sum-dp; 
    }
}