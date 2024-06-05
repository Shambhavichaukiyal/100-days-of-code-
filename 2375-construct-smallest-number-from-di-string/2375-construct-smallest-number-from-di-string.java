class Solution 
{
    public String smallestNumber(String pattern) 
    {
        Stack<Integer> sta= new Stack<>();
        String s ="";
        for(int i=0;i<pattern.length()+1;i++)
        {
            sta.push(i+1);
            
            if(pattern.length()==i || pattern.charAt(i)=='I')
            {
                while(!sta.empty())
                {
                s=s+sta.pop();
            }}
        }
        return s;
    }
}