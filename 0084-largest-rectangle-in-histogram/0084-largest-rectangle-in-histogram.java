class Solution
{
    public int largestRectangleArea(int[] heights) 
    {
        int maxarea=0;
        int area=0;
        Stack<Integer> sta= new Stack<>();
        int right[]=new int[heights.length];
         int left[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            while(!sta.isEmpty() && heights[sta.peek()]>=heights[i])
            {
               sta.pop(); 
            }
            if(sta.isEmpty())
            {
                left[i]=-1;
            }
            else
            {
                left[i]=sta.peek();
                
            }
            sta.push(i);
        }
        sta.clear();
    
   for (int i = heights.length - 1; i >= 0; i--) {
        
            while(!sta.isEmpty() && heights[sta.peek()]>=heights[i])
            {
                sta.pop();
            }
            if(sta.isEmpty())
            {
                right[i] = heights.length; 
            }
            else
            {
                right[i]=sta.peek();
                
            }
            sta.push(i);
        }
    for(int i=0;i<heights.length;i++)
    {
        int width=right[i]-left[i]-1;
        area=width*heights[i];
        maxarea=Math.max(area,maxarea);
    }
    return maxarea;
}}