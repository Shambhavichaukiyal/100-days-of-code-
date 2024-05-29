class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> sta= new Stack<>();
        sta.push(-1);
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                sta.push(i);
            }
            else
            {
                sta.pop();
                if(!sta.empty())
                {
                   result=Math.max(result,i-sta.peek());
                }
                else
                {
                    sta.push(i);
                }
            }
            
        }
        return result;
    }
}