class Solution
{
    public boolean lemonadeChange(int[] bills)
    {
       int d5=0;
        int d10=0;
        int d20=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                d5++;
            }
            else if(bills[i]==10)
            {
                if(d5>0)
                {
                    d5--;
                    d10++;
                    
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(d5>0 && d10>0)
                {
                    d5--;
                    d10--;
                    d20++;
                }
                else if(d5>2)
                {
                    d5=d5-3;
                    d20++;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}