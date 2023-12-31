class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int s=100-purchaseAmount;
        int rem = s%10;
        int f= s/10;
        if(rem>5)
        {
            return (f+1)*10;
        }
        else
        {
            return f*10;
        }
        
    }}
