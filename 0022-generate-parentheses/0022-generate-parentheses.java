class Solution 
{
    public List<String> generateParenthesis(int n) 
    {
        List<String> result =new ArrayList<String>();
        generate(n,"",0, 0,result);
            return result;
    }
 public void generate(int n, String ans, int ob, int cb, List<String> result) {
        if (n * 2 == ans.length()) {
            result.add(ans);
            return;
        }
        if (ob < n) {
            generate(n, ans + '(', ob + 1, cb, result);
        }
        if (ob > cb) {
            generate(n, ans + ')', ob, cb + 1, result);
        }
    }
}
        