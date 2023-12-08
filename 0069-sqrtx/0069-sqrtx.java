class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 0) {
            return -1;
        }

        int i;
        for (i = 1; i <= x / i; i++) {
        }
        
        return i - 1;
    }
}
