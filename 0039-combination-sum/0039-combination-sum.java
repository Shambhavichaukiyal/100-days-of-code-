class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        generate(result,candidates,target,0,new ArrayList<>());
            return result;
        
    }
    public static void generate(List<List<Integer>> result, int candidates[],int target,int  start,List<Integer> current)
    {
        if(target<0)
        {
            return;
        }
        else if(target==0)
        {
            result.add(new ArrayList<>(current));
            
        }
        else
        {
            for(int i=start;i<candidates.length;i++)
            {
                current.add(candidates[i]);
                generate(result,candidates,target-candidates[i],i,current);
                current.remove(current.size()-1);
            }
        }
    }
}