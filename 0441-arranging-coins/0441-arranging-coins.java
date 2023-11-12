class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int c=0;
    while(n-i>=0)
    {
        n=n-i;
        i=i+1;
        c=c+1;
    }
        return c;
        
    }
}