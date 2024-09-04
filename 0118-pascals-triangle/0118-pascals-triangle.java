class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> wrap= new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
         List<Integer> a = new ArrayList<>();
            for(int j=1;j<=i;j++)
            {
                a.add(nCr(i-1,j-1));
            }
            wrap.add(a);
        }
        return wrap;
    }
    public static int nCr(int n,int r)
        
    {
        long res=1;
        for(int i=0;i<r;i++)
        {
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
    }}
