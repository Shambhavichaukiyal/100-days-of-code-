class Solution 
{
    public int uniquePaths(int m, int n) 
    {
        n=n+m-2;
        int r= m-1;
        long res=1;
        for(int i=1;i<=r;i++)
        {
            res=res*(n-r+i)/(i);
        }
        return (int)res;
    }}
