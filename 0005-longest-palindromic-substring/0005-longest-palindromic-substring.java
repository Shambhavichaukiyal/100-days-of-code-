class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        int max=Integer.MIN_VALUE;
        int sp=-1;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(solve(i,j,s))
                {
                   if (j - i > max) {
                        max = j - i;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp,sp+max+1);
    }
    public static boolean solve(int i,int j,String s)
    {
        if(i>=j)
        {
            return true;
        }
        if(s.charAt(i)==s.charAt(j))
        {
            return solve(i+1,j-1,s);
        }
        return false;
    }
    
}