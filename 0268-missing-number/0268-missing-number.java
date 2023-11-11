class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int a= nums[0];
        for(int i=1;i<nums.length;i++)
        {
            a++;
            if(nums[i]!=a)
            {
                return a;
            }
            else
            {
                continue;
            }
}
        if(nums[0]==0)
        {
 return nums[nums.length-1]+1;    
        }
        else
            return 0;
    }
}