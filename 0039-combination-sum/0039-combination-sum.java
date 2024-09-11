class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Sum(0,candidates,ans,new ArrayList<>(),target);
        return ans;
    }
    public static void Sum(int index,int candidates[],List<List<Integer>> ans,List<Integer> ds,int target)
    {
        if(index==candidates.length)
        {
            if(target==0)
            {
               ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        if(candidates[index]<=target)
        {
            ds.add(candidates[index]);
            Sum(index,candidates,ans,ds,target-candidates[index]);
            ds.remove(ds.size()-1);
        }
       Sum(index+1,candidates,ans,ds,target) ;
    }
}