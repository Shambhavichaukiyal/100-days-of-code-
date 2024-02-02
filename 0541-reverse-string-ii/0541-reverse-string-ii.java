class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        
       
        for (int i = 0; i < s.length(); i += 2 * k) {
           
            int end = Math.min(i + k, s.length());
            StringBuilder sb = new StringBuilder(s.substring(i, end));
            result.append(sb.reverse());
            
            // Append the next k characters as they are if there are any
            if (end < s.length()) {
                result.append(s.substring(end, Math.min(end + k, s.length())));
            }
        }
        
        return result.toString();
    }
}

        
    
