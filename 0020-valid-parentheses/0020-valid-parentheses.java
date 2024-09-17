class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> sta = new Stack<>();
for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);

    if (ch == '(' || ch == '[' || ch == '{') {
        sta.push(ch);
    } 

    else if (!sta.isEmpty() && 
            (sta.peek() == '(' && ch == ')' || 
             sta.peek() == '[' && ch == ']' || 
             sta.peek() == '{' && ch == '}')) {
        sta.pop();
    } 
    
    else {
        return false;
    }
}


return sta.isEmpty();
    }}
