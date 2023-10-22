class Solution {
    public boolean isPalindrome(String s) {
    String f="";    
    String g="";    
    String str= s.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='0'&&str.charAt(i)<='9'))
            {
              g=g+str.charAt(i);  
            }}
            for(int i=0;i<g.length();i++)
        {
                f=g.charAt(i)+f;
            }
        return g.equals(f);
            
            
}}