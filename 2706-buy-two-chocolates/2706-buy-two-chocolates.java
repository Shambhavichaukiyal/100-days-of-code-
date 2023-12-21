class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int m= money;
        
            money = money-prices[0]-prices[1];
        
            if(money>-1)
            {
                return money;
            }
            else
            {
                return m;
            }
        
        
    
}}