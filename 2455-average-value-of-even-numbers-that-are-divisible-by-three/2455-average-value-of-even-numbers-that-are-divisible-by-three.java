class Solution {
    public int averageValue(int[] nums) {
        int c=0;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]%3==0)  && (nums[i]%2==0))
            {
                c=c+1;
                s=s+nums[i];
}
        }
        if(s==0)
        {
            return 0;
        }
        int avg=s/c;
        return avg;
        
    }
}