class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        back(result,ans,n,k,1);
        return result;
    }
    public static void back(List<List<Integer>> result,List<Integer> ans,int n,int k,int start)
    {
        if(ans.size()==k)
        {
            result.add(new  ArrayList<>(ans));
            return;
        }
        for(int i=start;i<n+1;i++)
        {
            ans.add(i);
            back(result,ans,n,k,i+1);
            ans.remove(ans.size()-1);
            
        }
    }
}