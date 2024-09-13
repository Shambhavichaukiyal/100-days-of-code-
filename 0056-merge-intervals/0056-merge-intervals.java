class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<>()
                    {
                        public int compare(int a[],int b[])
                        {
                            return a[0]-b[0];
                        }
                    });
        List<int[]> wrap= new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            if(wrap.isEmpty() || intervals[i][0]>wrap.get(wrap.size()-1)[1])
            {
                wrap.add(new int[]{intervals[i][0],intervals[i][1]});
            }
            else
            {
                wrap.get(wrap.size()-1)[1]=Math.max(wrap.get(wrap.size()-1)[1],intervals[i][1]);
            }
        }
        return wrap.toArray(new int[wrap.size()][]);
    }
}