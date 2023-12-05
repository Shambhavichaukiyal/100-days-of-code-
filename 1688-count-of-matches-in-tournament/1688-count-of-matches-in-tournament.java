class Solution {
    public int numberOfMatches(int n) {
        int match=0;
        int s=0;
        while(n>1)
        {
        if(n%2==0)
        {
          n=n/2;
    
            match=match+n;
        }
        else
        {
          s=(n-1)/2;
            n=(n-1)/2+1;
            match=match+s;
        }}  
        return match;   
    }
}