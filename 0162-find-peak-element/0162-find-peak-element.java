class Solution {
    public int findPeakElement(int[] nums) {
       int i=0;
       int max=nums[0];
       for(int j=0;j<nums.length;j++)
       {
           if(nums[j]>max)
           {
               max=nums[j];
               i=j;
           }
       }
       return i;
    }
}