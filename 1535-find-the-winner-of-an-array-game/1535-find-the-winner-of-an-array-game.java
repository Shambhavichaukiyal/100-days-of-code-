class Solution {
    public int getWinner(int[] arr, int k)
    {
        int winner=arr[0];
        int c=0;
        for(int i=1;i<arr.length;i++)
        {
            if(winner>arr[i])
            {
               c++;
            }
            else
            {
               winner=arr[i];
                c=1;
            }
            if(c==k)
            {
                return winner;
            }
        }
        return winner;
        
        
    }
}