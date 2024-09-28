class Solution 
{
    public int myAtoi(String s)
    {
         s=s.trim();
        if(s.length()==0)
        {
            return 0;
        }
       
        int start=0;
        long val=0;
        char ch = s.charAt(0);
        int sign=1;
        if(ch=='-')
        {
            sign=-1;
            start++;
        }
        else if(ch=='+')
        {
            sign=1;
            start++;
        }
       for(int i=start;i<s.length();i++)
       {
           char d= s.charAt(i); 
           if(!Character.isDigit(d))
           {
               break;
           }
           val=val*10+(d-'0');
              if (sign == 1 && val > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && -val < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } 
       }
        val=sign*val;
        if(val>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        if(val<Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        
        
       
        return (int)val;
    }}
        