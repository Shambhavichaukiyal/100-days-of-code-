class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
         for(int i=0;i<numCourses;i++)
        {
             adj.add(new ArrayList<>());
         }
        for(int i=0;i<prerequisites.length;i++)
        {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int indegree[]=new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            for(int a:adj.get(i))
            {
                indegree[a]++;
            }
        }
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while(!q.isEmpty())
        {
            int node=q.poll();
            topo.add(node);
            for(int a:adj.get(node))
            {
                indegree[a]--;
                if(indegree[a]==0)
                {
                    q.add(a);
                }
            }
        }
        if(topo.size()==numCourses)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}