class Solution {
    public int commonFactors(int a, int b) {
        int z= Math.min(a,b);
        int c=1;
        for(int i=2;i<z+1;i++)
        {
            if(a%i==0 && b%i==0)
            {
                c++;
            }
        }
        return c;
        
    }
}