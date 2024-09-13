class Solution {
    public int majorityElement(int[] nums) {
    int count=1;
    int ele1=nums[0];
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]==ele1)
        {
            count++;
        }
        else if(count==0)
        {
            count=1;
            ele1=nums[i];
        }
        else
        {
            count--;
        }
    }
        count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele1)
            {
                count++;
            }
        }
        if(count>=nums.length/2)
        {
            return ele1;
        }
        return -1;
    }}
        
        