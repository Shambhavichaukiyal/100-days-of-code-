public class Solution {
    public int pivotInteger(int n) {
        int sum = (n * (n + 1)) / 2;
        int r = 0;

        while (n >0) {
            if (sum == r+n) {
                return n;
            } else {
                sum = sum - n;
                r = r + n;
                n--;
            }
        }
        return -1;
    }
}
