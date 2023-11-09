class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        int s = 1;
        int c=0;
        int p=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c++;
                p=i;
            }
            else
            {
                s=s*nums[i];
            }
        }
        if(c==0)
        {
            for(int i=0;i<nums.length;i++)
            {
                a[i]=s/nums[i];
            }
        }
        else if(c==1)
        {
            for(int i=0;i<nums.length;i++)
            {
                a[i]=0;
            }
            a[p]=s;
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                a[i]=0;
            }
        }
    return a;
    }

}
            