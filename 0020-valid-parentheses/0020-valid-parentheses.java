class Solution 
{
    public boolean isValid(String s) 
    {
       char chars[] = s.toCharArray();
        Stack<Character> stack= new Stack<>();
        for(char ele:chars)
        {
            if(ele=='(' || ele=='{'||ele=='[')
            {
                stack.push(ele);
            }
            else
            {
                if(stack.empty())
                {
                    return false;
                }
            
            char top=stack.pop();
             if ((top == '[' && ele != ']') || (top == '(' && ele != ')') || (top == '{' && ele != '}')) {
                    return false; 
                }
        }}
        return stack.empty();
    }}
        
   