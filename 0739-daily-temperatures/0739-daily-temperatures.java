class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[]=new int[temperatures.length];
        Stack<Integer> sta= new Stack<>();
        for(int i=temperatures.length-1;i>-1;i--)
        {
            while(!sta.isEmpty() && temperatures[sta.peek()]<=temperatures[i])
            {
                sta.pop();
            }
            if(sta.isEmpty())
            {
                result[i]=0;
            }
            else
            {
                result[i]=sta.peek()-i;
            }
            sta.push(i);
         }
        return result;
    }
}