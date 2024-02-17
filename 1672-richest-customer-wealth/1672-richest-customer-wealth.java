class Solution 
{
    public int maximumWealth(int[][] accounts)
    {
        int mx=0;
        int c=0;
       for(int i=0;i<accounts.length;i++)
           {
           c=0;
                for(int j=0;j<accounts[i].length;j++)
                {
                    c=accounts[i][j]+c;
                }
           mx=Math.max(c,mx);
           }
        return mx;
    }
}