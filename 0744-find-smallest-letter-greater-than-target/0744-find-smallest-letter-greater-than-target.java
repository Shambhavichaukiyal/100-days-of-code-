class Solution 
{
    public char nextGreatestLetter(char[] letters, char target) 
    {
        int l = 0;
        int r = letters.length - 1;
        int mid = 0;
        
        if (target >= letters[r]) {
            return letters[0];
        }
        
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (letters[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        
        return letters[l % letters.length];
    }
}
