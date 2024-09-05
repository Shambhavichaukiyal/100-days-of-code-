class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> a = new ArrayList<>();
    
        for(int i=0;i<rowIndex+1;i++)
        {
           
            a.add( nCr(rowIndex,i));
        }
        return a;
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
