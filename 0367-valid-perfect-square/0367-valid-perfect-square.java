class Solution {
    public boolean isPerfectSquare(int num)
    {
        for(int i=0;i*i<num+1;i++)
        {
            if(i*i==num)
            {
                return true;
            }
        }
        return false;
    }
}