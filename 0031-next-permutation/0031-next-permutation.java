class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            rev(0,n-1,nums);
}
        else
        {
            for(int i=n-1;i>=0;i--)
            {
                if(nums[i]>nums[index])
                {
                    int temp=nums[i];
                    nums[i]=nums[index];
                    nums[index]=temp;
                    break;
                }
            }
            rev(index+1,n-1,nums);
        }
        
    }
    public static void rev(int l , int r,int nums[])
    {
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}