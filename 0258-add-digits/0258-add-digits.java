class Solution {
    public int addDigits(int n) {
        int m = n;
        while (m > 9) {
            int s = 0; // Reset s to 0 for each iteration
            while (n > 0) {
                int rem = n % 10;
                s = s + rem;
                n = n / 10;
            }
            m = s;
            n = s; // Update n with the new value of s for the next iteration
        }
        return m;
    }
}