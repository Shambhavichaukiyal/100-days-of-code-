class Solution {
    public String reversePrefix(String word, char ch) {
        int c=0;
        String str="";
        for(int i=0;i<word.length();i++)
        {
            if(ch!=word.charAt(i))
            {
                c++;
                
            }
            else{
                break;
            }
        }
        
if(c==word.length())
{
    return word;
}
        
        
        else{
            if(c<word.length())
        {
                for(int i=c;i>-1;i--)
                    
        {
                    str=str+word.charAt(i);
                }
         str=str+word.substring(c+1,word.length());
        return str;
        }
        
        
        
    }
        return word;
}}