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
            rev(nums,0,n-1);
        }
        else
        {
            for (int j = n - 1; j > index; j--) {
                if (nums[j] > nums[index]) {
                    
                    int temp = nums[index];
                    nums[index] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
            rev(nums, index + 1, n - 1);
        }
        
    }
public void rev(int nums[],int l,int r)
{
    while(l<=r)
    {
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
    }
}
   
}