import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int n,rem,s;
        n=x;
         s=0;
        while(n>0) 
        {
            rem=n%10;
            s=s*10+rem;
            n=n/10;

        }
        if(s==x)
        return true;
        else
        {
          return false;  
        }
    }}
   