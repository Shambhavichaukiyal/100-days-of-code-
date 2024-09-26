class Solution
{
    class Pair
    {
        int i;
        int j;
        int time;
        Pair(int i,int j,int time)
        {
            this.i=i;
            this.j=j;
            this.time=time;
            
        }
    }
    public int orangesRotting(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        int r[]={-1,0,1,0};
        int c[]={0,-1,0,1};
        int vis[][]=new int[n][m];
        int maxtime=0;
        int fresh=0;
        Queue<Pair> q= new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                }
                else if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }
        int max=0;
        int cnt=0;
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int row = p.i;
            int col=p.j;
            int  t=p.time;
            max=Math.max(max,t);
            for(int i=0;i<4;i++)
            {
                int nrow=row+r[i];
                int ncol=col+c[i];
                
                if(nrow>=0 && ncol>=0 && nrow< n && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
                {
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol,t+1));
                    cnt++;
                }
                
                }
        }
        if(cnt==fresh)
        {
            return max;
        }
        else
        {
            return -1;
        }
    }
}