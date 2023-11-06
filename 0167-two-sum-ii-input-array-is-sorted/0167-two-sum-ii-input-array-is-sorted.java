class Solution {
    public int[] twoSum(int[] numbers, int target)
    {
       
        int a[]={-1,-1};
        int f=0;
        int l=numbers.length-1;
       while(f<l)
       {
          if(numbers[f]+numbers[l]==target)
          {
              a[0]=f+1;
              a[1]=l+1;
              return a;
          }
        else if(numbers[f]+numbers[l]<target)
        {
            f++;
        }
        else
        {
            l--;
        }
    }
        return a;
        
}}