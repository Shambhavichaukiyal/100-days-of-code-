class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
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
          for(int i= n-1;i>=0;i--)
          {
              if(nums[i]>nums[index])
              {
                  int temp=nums[i];
                  nums[i]=nums[index];
                  nums[index]=temp;
                  break;
              }
          }
          rev(nums,index+1,n-1);
      }
    }
public static void rev(int nums[],int l,int r)
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
