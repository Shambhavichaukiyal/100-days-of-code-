class Solution {
    public int climbStairs(int n) {
        if(n<3)
        {
            return n;
        }
       int a=1;
        int b=2;
        int c=0;
        for(int i=0;i<n-2;i++)
        {
       c=a+b;
        a=b;
        b=c;
        }
        return c;
    }}