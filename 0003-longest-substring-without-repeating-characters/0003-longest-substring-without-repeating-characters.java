class Solution {
    public int lengthOfLongestSubstring(String str) {
         if (str.length() == 0)
            return 0;
 
        // if string length 1
        if (str.length() == 1)
            return 1;
 
        // if string length is more than 2
        int maxLength = 0;
        boolean[] visited = new boolean[256];
 
        // left and right pointer of sliding window
        int left = 0, right = 0;
        while (right < str.length()) {
 
            // if character is visited
            if (visited[str.charAt(right)]) {
                 while (visited[str.charAt(right)]) {
 
                    visited[str.charAt(left)] = false;
                    left++;
                }
            }
 
            visited[str.charAt(right)] = true;
 
            // The length of the current window (right -
            // left + 1) is calculated and answer is updated
            // accordingly.
            maxLength
                = Math.max(maxLength, (right - left + 1));
            right++;
        }
        return maxLength;
    }
        
    
}