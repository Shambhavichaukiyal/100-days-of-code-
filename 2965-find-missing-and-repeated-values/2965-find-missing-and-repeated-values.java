class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int result[]=new int[2];
        int n=grid.length;
        int size=n*n;
        long expsum=(long)size*(size+1)/2;
        long sqsum=(long)size*(size+1)*(2*size+1)/6;
        long actualSum = 0;
        long actualSumSq = 0;
        for(int row[]:grid)
        {
            for(int num:row)
            {
                actualSum+=num;
                actualSumSq+=(long)num*num;
            }
        }
        long diff=actualSum-expsum;//a-b
        long diffsq=actualSumSq-sqsum;//a^2-b^2
        long a=diffsq/diff;//a+b
        result[0]=(int)(a+diff)/2;
        result[1]=(int)a-result[0];
        return result;
        
        
        
    }
}