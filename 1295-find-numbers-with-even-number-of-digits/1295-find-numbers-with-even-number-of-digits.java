
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0; 
        for (int i = 0; i < nums.length; i++) {
            int numDigits = digits(nums[i]); 
            if (numDigits % 2 == 0) {
                count++;
            }
        }
        return count; 
    }
    
    public int digits(int h) {
        if (h < 0) {
            h = h * -1;
        }
        return (int) Math.log10(h) + 1; 
    }
}
