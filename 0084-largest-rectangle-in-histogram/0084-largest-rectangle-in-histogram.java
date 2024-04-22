

class Solution 
{
    public int largestRectangleArea(int[] heights)
    {
      
          int area=0;
        int maxArea=0;
    Stack<Integer>sts=new Stack<>();
        int left[]=new int[heights.length];
        int right[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            while(!sts.isEmpty() && heights[sts.peek()]>=heights[i])
            {
                sts.pop();
            }
            if(sts.isEmpty())
            {
                left[i]=-1;
            }
            else
            {
               left[i]= sts.peek();
            }
            sts.push(i);
        }
        
       sts.clear();
        for(int i=heights.length-1;i>=0;i--)
        {
            while(!sts.isEmpty() && heights[sts.peek()]>=heights[i])
            {
                sts.pop();
            }
            if(sts.isEmpty())
            {
                right[i]=heights.length;
            }
            else
            {
               right[i]= sts.peek();
            }
            sts.push(i);
        }
        
 for (int i = 0; i < heights.length; i++) {
            int width = right[i] - left[i] - 1;
            area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}


        