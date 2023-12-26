class Solution {
    public int commonFactors(int a, int b) {
        int z= Math.min(a,b);
        int c=1;
      int i=2;
        while(i<z+1)
        {
            if(a%i==0 && b%i==0)
            {
                c++;
            }
            i++;
        }
        return c;
        
    }
}