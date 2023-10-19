import java.util.*;
class Solution {
    public int lengthOfLastWord(String s ) {
       
    int c=0;
        String t=s.trim();
          for(int i=t.length()-1;i>=0;i--)
          {
              if(t.charAt(i)!=' ')
              {
                  c++;
              }
                else
                {
                    return c;
                }
              }
    return c;              
              
}}