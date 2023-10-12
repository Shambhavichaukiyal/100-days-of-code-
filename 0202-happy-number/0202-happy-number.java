class Solution {
    public boolean isHappy(int n) {
        int s;
        int rem;
        while (n != 1 && n != 4) {
            s = 0;
            while (n > 0) {
                rem = n % 10;
                s += rem * rem;
                n = n / 10;
            }
            n = s;
        }
        return n == 1;
    }
}
