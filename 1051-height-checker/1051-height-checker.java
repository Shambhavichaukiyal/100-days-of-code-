class Solution {
    public int heightChecker(int[] heights) {
        int hei[]=Arrays.copyOf(heights,heights.length);
        Arrays.sort(hei);
        int c=0;
        for(int i=0;i<heights.length;i++)
        {
            if(hei[i]!=heights[i])
            {
                c++;
}
        }
    return c;    
    }
}