class Solution {
    public List<String> generateParenthesis(int n) {
     
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    }

    public void generate(List<String> result, String ans, int ob, int cb, int n) {
        if (ans.length() == 2 * n) {
            result.add(ans);
            return;
        }
        if (ob < n) {
            generate(result, ans + '(', ob + 1, cb, n);
        }
        if (cb < ob) {
            generate(result, ans + ')', ob, cb + 1, n);
        }
    }
}    

