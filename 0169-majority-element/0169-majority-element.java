class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==ele)
            {
                c++;
            }
            else if(c==0)
            {
                c=1;
                ele=nums[i];
            }
            else
            {
                c--;
            }
        }
        c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele)
            {
                c++;
            }
        }
        if(c>nums.length/2)
        {
            return ele;
        }
        else
        {
            return -1;
        }
    }
}