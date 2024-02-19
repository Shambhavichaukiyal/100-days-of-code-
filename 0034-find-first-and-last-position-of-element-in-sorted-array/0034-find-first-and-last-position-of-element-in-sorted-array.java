class Solution {
    public int[] searchRange(int[] nums, int x) {
        int result[]={-1,-1};
         int l = 0;
        int r = nums.length - 1; 
        int mid = 0;
        
    while(l<=r)
    {
        mid=l+(r-l)/2;
        if(nums[mid]>x)
        {
          r=mid-1;  
        }
        else if(nums[mid]<x)
        {
           l=mid+1; 
        }
        else
        {
            result[0]=mid;
            r=mid-1;
        }}
        l = 0;
         r = nums.length - 1; 
         mid = 0;
     while(l<=r)
    {
         mid=l+(r-l)/2;
        if(nums[mid]>x)
        {
          r=mid-1;  
        }
        else if(nums[mid]<x)
        {
           l=mid+1; 
        }
        else
        {
            result[1]=mid;
            l=mid+1;
        }
    }
        return result;
    
}}
   